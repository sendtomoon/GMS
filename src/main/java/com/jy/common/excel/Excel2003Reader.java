package com.jy.common.excel;

import org.apache.poi.poifs.filesystem.*;
import org.apache.poi.hssf.usermodel.*;
import java.util.*;
import org.apache.poi.hssf.eventusermodel.*;
import java.io.*;
import org.apache.poi.hssf.model.*;
import org.apache.poi.hssf.record.*;
import org.apache.poi.hssf.eventusermodel.dummyrecord.*;

public class Excel2003Reader implements HSSFListener
{
    private int minColumns;
    private POIFSFileSystem fs;
    private int lastRowNumber;
    private int lastColumnNumber;
    private boolean outputFormulaValues;
    private EventWorkbookBuilder.SheetRecordCollectingListener workbookBuildingListener;
    private HSSFWorkbook stubWorkbook;
    private SSTRecord sstRecord;
    private FormatTrackingHSSFListener formatListener;
    private int sheetIndex;
    private BoundSheetRecord[] orderedBSRs;
    private ArrayList boundSheetRecords;
    private int nextRow;
    private int nextColumn;
    private boolean outputNextStringRecord;
    private int curRow;
    private List<String> rowlist;
    private String sheetName;
    private IExcelRowReader rowReader;
    
    public Excel2003Reader() {
        this.minColumns = -1;
        this.outputFormulaValues = true;
        this.sheetIndex = -1;
        this.boundSheetRecords = new ArrayList();
        this.curRow = 0;
        this.rowlist = new ArrayList<String>();
    }
    
    public void setRowReader(final IExcelRowReader rowReader) {
        this.rowReader = rowReader;
    }
    
    public void process(final String fileName) throws IOException {
        this.fs = new POIFSFileSystem((InputStream)new FileInputStream(fileName));
        final MissingRecordAwareHSSFListener listener = new MissingRecordAwareHSSFListener((HSSFListener)this);
        this.formatListener = new FormatTrackingHSSFListener((HSSFListener)listener);
        final HSSFEventFactory factory = new HSSFEventFactory();
        final HSSFRequest request = new HSSFRequest();
        if (this.outputFormulaValues) {
            request.addListenerForAllRecords((HSSFListener)this.formatListener);
        }
        else {
            request.addListenerForAllRecords((HSSFListener)(this.workbookBuildingListener = new EventWorkbookBuilder.SheetRecordCollectingListener((HSSFListener)this.formatListener)));
        }
        factory.processWorkbookEvents(request, this.fs);
    }
    
    public void processRecord(final Record record) {
        int thisRow = -1;
        int thisColumn = -1;
        String thisStr = null;
        String value = null;
        switch (record.getSid()) {
            case 133: {
                this.boundSheetRecords.add(record);
                break;
            }
            case 2057: {
                final BOFRecord br = (BOFRecord)record;
                if (br.getType() == 16) {
                    if (this.workbookBuildingListener != null && this.stubWorkbook == null) {
                        this.stubWorkbook = this.workbookBuildingListener.getStubHSSFWorkbook();
                    }
                    ++this.sheetIndex;
                    if (this.orderedBSRs == null) {
                        this.orderedBSRs = BoundSheetRecord.orderByBofPosition((List)this.boundSheetRecords);
                    }
                    this.sheetName = this.orderedBSRs[this.sheetIndex].getSheetname();
                    break;
                }
                break;
            }
            case 252: {
                this.sstRecord = (SSTRecord)record;
                break;
            }
            case 513: {
                final BlankRecord brec = (BlankRecord)record;
                thisRow = brec.getRow();
                thisColumn = brec.getColumn();
                thisStr = "";
                this.rowlist.add(thisColumn, thisStr);
                break;
            }
            case 517: {
                final BoolErrRecord berec = (BoolErrRecord)record;
                thisRow = berec.getRow();
                thisColumn = berec.getColumn();
                thisStr = new StringBuilder(String.valueOf(berec.getBooleanValue())).toString();
                this.rowlist.add(thisColumn, thisStr);
                break;
            }
            case 6: {
                final FormulaRecord frec = (FormulaRecord)record;
                thisRow = frec.getRow();
                thisColumn = frec.getColumn();
                if (this.outputFormulaValues) {
                    if (Double.isNaN(frec.getValue())) {
                        this.outputNextStringRecord = true;
                        this.nextRow = frec.getRow();
                        this.nextColumn = frec.getColumn();
                    }
                    else {
                        thisStr = this.formatListener.formatNumberDateCell((CellValueRecordInterface)frec);
                    }
                }
                else {
                    thisStr = String.valueOf('\"') + HSSFFormulaParser.toFormulaString(this.stubWorkbook, frec.getParsedExpression()) + '\"';
                }
                this.rowlist.add(thisColumn, thisStr);
                break;
            }
            case 519: {
                if (this.outputNextStringRecord) {
                    final StringRecord srec = (StringRecord)record;
                    thisStr = srec.getString();
                    thisRow = this.nextRow;
                    thisColumn = this.nextColumn;
                    this.outputNextStringRecord = false;
                    break;
                }
                break;
            }
            case 516: {
                final LabelRecord lrec = (LabelRecord)record;
                thisRow = (this.curRow = lrec.getRow());
                thisColumn = lrec.getColumn();
                value = lrec.getValue().trim();
                value = (value.equals("") ? " " : value);
                this.rowlist.add(thisColumn, value);
                break;
            }
            case 253: {
                final LabelSSTRecord lsrec = (LabelSSTRecord)record;
                thisRow = (this.curRow = lsrec.getRow());
                thisColumn = lsrec.getColumn();
                if (this.sstRecord == null) {
                    this.rowlist.add(thisColumn, " ");
                    break;
                }
                value = this.sstRecord.getString(lsrec.getSSTIndex()).toString().trim();
                value = (value.equals("") ? " " : value);
                this.rowlist.add(thisColumn, value);
                break;
            }
            case 515: {
                final NumberRecord numrec = (NumberRecord)record;
                thisRow = (this.curRow = numrec.getRow());
                thisColumn = numrec.getColumn();
                value = this.formatListener.formatNumberDateCell((CellValueRecordInterface)numrec).trim();
                value = (value.equals("") ? " " : value);
                this.rowlist.add(thisColumn, value);
                break;
            }
        }
        if (thisRow != -1 && thisRow != this.lastRowNumber) {
            this.lastColumnNumber = -1;
        }
        if (record instanceof MissingCellDummyRecord) {
            final MissingCellDummyRecord mc = (MissingCellDummyRecord)record;
            thisRow = (this.curRow = mc.getRow());
            thisColumn = mc.getColumn();
            this.rowlist.add(thisColumn, " ");
        }
        if (thisRow > -1) {
            this.lastRowNumber = thisRow;
        }
        if (thisColumn > -1) {
            this.lastColumnNumber = thisColumn;
        }
        if (record instanceof LastCellOfRowDummyRecord) {
            if (this.minColumns > 0 && this.lastColumnNumber == -1) {
                this.lastColumnNumber = 0;
            }
            this.lastColumnNumber = -1;
            this.rowReader.getRows(this.sheetIndex, this.curRow, this.rowlist);
            this.rowlist.clear();
        }
    }
}

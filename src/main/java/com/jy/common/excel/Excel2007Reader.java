package com.jy.common.excel;

import org.apache.poi.xssf.model.*;
import org.apache.poi.openxml4j.opc.*;
import org.apache.poi.xssf.eventusermodel.*;
import java.io.*;
import java.util.*;
import org.xml.sax.helpers.*;
import org.xml.sax.*;
import org.apache.poi.xssf.usermodel.*;

public class Excel2007Reader extends DefaultHandler
{
    private IExcelRowReader rowReader;
    private SharedStringsTable sst;
    private String lastContents;
    private boolean nextIsString;
    private int sheetIndex;
    private List<String> rowlist;
    private int curRow;
    private int curCol;
    
    public Excel2007Reader() {
        this.sheetIndex = -1;
        this.rowlist = new ArrayList<String>();
        this.curRow = 0;
        this.curCol = 0;
    }
    
    public void setRowReader(final IExcelRowReader rowReader) {
        this.rowReader = rowReader;
    }
    
    public void processOneSheet(final String filename, final int sheetId) throws Exception {
        final OPCPackage pkg = OPCPackage.open(filename);
        final XSSFReader r = new XSSFReader(pkg);
        final SharedStringsTable sst = r.getSharedStringsTable();
        final XMLReader parser = this.fetchSheetParser(sst);
        final InputStream sheet2 = r.getSheet("rId" + sheetId);
        ++this.sheetIndex;
        final InputSource sheetSource = new InputSource(sheet2);
        parser.parse(sheetSource);
        sheet2.close();
    }
    
    public void process(final String filename) throws Exception {
        final OPCPackage pkg = OPCPackage.open(filename);
        final XSSFReader r = new XSSFReader(pkg);
        final SharedStringsTable sst = r.getSharedStringsTable();
        final XMLReader parser = this.fetchSheetParser(sst);
        final Iterator<InputStream> sheets = (Iterator<InputStream>)r.getSheetsData();
        while (sheets.hasNext()) {
            this.curRow = 0;
            ++this.sheetIndex;
            final InputStream sheet = sheets.next();
            final InputSource sheetSource = new InputSource(sheet);
            parser.parse(sheetSource);
            sheet.close();
        }
    }
    
    public XMLReader fetchSheetParser(final SharedStringsTable sst) throws SAXException {
        final XMLReader parser = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
        this.sst = sst;
        parser.setContentHandler(this);
        return parser;
    }
    
    @Override
    public void startElement(final String uri, final String localName, final String name, final Attributes attributes) throws SAXException {
        if (name.equals("c")) {
            final String cellType = attributes.getValue("t");
            if (cellType != null && cellType.equals("s")) {
                this.nextIsString = true;
            }
            else {
                this.nextIsString = false;
            }
        }
        this.lastContents = "";
    }
    
    @Override
    public void endElement(final String uri, final String localName, final String name) throws SAXException {
        if (this.nextIsString) {
            try {
                final int idx = Integer.parseInt(this.lastContents);
                this.lastContents = new XSSFRichTextString(this.sst.getEntryAt(idx)).toString();
            }
            catch (Exception ex) {}
        }
        if (name.equals("v")) {
            String value = this.lastContents.trim();
            value = (value.equals("") ? " " : value);
            this.rowlist.add(this.curCol, value);
            ++this.curCol;
        }
        else if (name.equals("row")) {
            this.rowReader.getRows(this.sheetIndex, this.curRow, this.rowlist);
            this.rowlist.clear();
            ++this.curRow;
            this.curCol = 0;
        }
    }
    
    @Override
    public void characters(final char[] ch, final int start, final int length) throws SAXException {
        this.lastContents = String.valueOf(this.lastContents) + new String(ch, start, length);
    }
}

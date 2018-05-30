package com.jy.common.excel;

import org.apache.poi.openxml4j.exceptions.*;
import java.io.*;
import org.apache.poi.hssf.usermodel.*;
import java.text.*;
import org.apache.poi.ss.usermodel.*;
import java.util.*;
import java.util.regex.*;

public class ExcelImportUtil
{
    public static final String EXTE_EXCEL2003 = ".xls";
    public static final String EXTE_EXCEL2007 = ".xlsx";
    
    public static void readExcel(final IExcelRowReader reader, final String fileName) throws Exception {
        if (fileName.endsWith(".xls")) {
            final Excel2003Reader exceXls = new Excel2003Reader();
            exceXls.setRowReader(reader);
            exceXls.process(fileName);
        }
        else {
            if (!fileName.endsWith(".xlsx")) {
                throw new Exception("\u6587\u4ef6\u683c\u5f0f\u9519\u8bef\uff0cfileName\u7684\u6269\u5c55\u540d\u53ea\u80fd\u662fxls\u6216xlsx\u3002");
            }
            final Excel2007Reader exce2007 = new Excel2007Reader();
            exce2007.setRowReader(reader);
            exce2007.process(fileName);
        }
    }
    
    public static void readExcel2007(final IExcelRowReader reader, final String fileName, final Integer sheetId) throws Exception {
        if (!fileName.endsWith(".xlsx")) {
            throw new Exception("\u6587\u4ef6\u683c\u5f0f\u9519\u8bef\uff0c\u53ea\u652f\u6301Excel2007\uff0cfileName\u7684\u6269\u5c55\u540d\u53ea\u80fd\u662fxlsx\u3002");
        }
        final Excel2007Reader exce2007 = new Excel2007Reader();
        exce2007.setRowReader(reader);
        if (sheetId == null) {
            exce2007.process(fileName);
        }
        else {
            exce2007.processOneSheet(fileName, sheetId);
        }
    }
    
    public static List<List<String>> processDOMReadSheet(final InputStream ins, final int headRowCount) throws InvalidFormatException, IOException {
        final Workbook workbook = WorkbookFactory.create(ins);
        return processDOMRead(workbook, headRowCount);
    }
    
    public static List<List<String>> processDOMReadSheet(final String filename, final int headRowCount) throws InvalidFormatException, IOException {
        final Workbook workbook = WorkbookFactory.create(new File(filename));
        return processDOMRead(workbook, headRowCount);
    }
    
    private static List<List<String>> processDOMRead(final Workbook workbook, final int headRowCount) throws InvalidFormatException, IOException {
        final List<List<String>> list = new ArrayList<List<String>>();
        final Sheet sheet = workbook.getSheetAt(0);
        final int endRowIndex = sheet.getLastRowNum();
        Row row = null;
        List<String> rowList = null;
        final int colsNum = sheet.getRow(0).getLastCellNum();
        for (int i = headRowCount; i <= endRowIndex; ++i) {
            rowList = new ArrayList<String>();
            row = sheet.getRow(i);
            for (int j = 0; j < colsNum; ++j) {
                if (row.getCell(j) == null) {
                    rowList.add("");
                }
                else {
                    final int dataType = row.getCell(j).getCellType();
                    if (dataType == 0) {
                        if (HSSFDateUtil.isCellDateFormatted(row.getCell(j))) {
                            final SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
                            final Date dt = HSSFDateUtil.getJavaDate(row.getCell(j).getNumericCellValue());
                            rowList.add(dateformat.format(dt));
                        }
                        else {
                            rowList.add(String.valueOf(row.getCell(j).getNumericCellValue()));
                        }
                    }
                    else if (dataType == 3) {
                        rowList.add("");
                    }
                    else if (dataType == 5) {
                        rowList.add("");
                    }
                    else {
                        String valString = "";
                        try {
                            valString = row.getCell(j).getStringCellValue();
                        }
                        catch (IllegalStateException e) {
                            valString = String.valueOf(row.getCell(j).getNumericCellValue());
                        }
                        final Pattern p = Pattern.compile("\\s*|\t|\r|\n");
                        final Matcher m = p.matcher(valString);
                        valString = m.replaceAll("");
                        if (valString.indexOf(" ") != -1) {
                            valString = valString.substring(0, valString.indexOf(" "));
                        }
                        rowList.add(valString.trim());
                    }
                }
            }
            list.add(rowList);
        }
        return list;
    }
}

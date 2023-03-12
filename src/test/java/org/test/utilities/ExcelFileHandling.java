package org.test.utilities;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;

public class ExcelFileHandling {
    public void readParticularCell(String SheetName, int rowUN, int columnnum) throws IOException {
        File f = new File("");
        FileInputStream fis = new FileInputStream(f);
        Workbook workbook = new HSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(SheetName);
        int allrow = sheet.getLastRowNum();
        for (int i = 0; i < allrow; i++) {
            Row row =sheet.getRow(rowUN);
          int column= row.getPhysicalNumberOfCells();
          for(int j=0;j<column;j++){
              Cell cell = row.getCell(columnnum);
              String Value = cell.getStringCellValue();
          }



        }
    }
}
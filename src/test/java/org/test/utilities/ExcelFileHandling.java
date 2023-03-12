package org.test.utilities;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;

public class ExcelFileHandling {
    public void readParticularCell(String SheetName, int row) throws IOException {
       File f=new File("");
        FileInputStream fis=new FileInputStream(f);
        Workbook workbook= new HSSFWorkbook(fis);
       Sheet sheet= workbook.getSheet(SheetName);
      int allrow=sheet.getLastRowNum();
        int rowsCount = sheet.getPhysicalNumberOfRows();

    }
}

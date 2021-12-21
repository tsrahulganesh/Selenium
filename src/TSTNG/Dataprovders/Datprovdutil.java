package TSTNG.Dataprovders;



import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.testng.annotations.DataProvider;


import java.io.FileInputStream;
import java.io.IOException;



public class Datprovdutil {

        @DataProvider
        public  static Object[][] getmydata(String filename,String sheetname) throws IOException {
            // 1. read the file
            FileInputStream fis = new FileInputStream(filename);

            // 2. convert the file object into workbook object
            HSSFWorkbook workbook = new HSSFWorkbook(fis);

            // 3. choose sheet from excel
            HSSFSheet sheet = workbook.getSheet(sheetname);

            // 4. count the active rows
            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getLastCellNum();

            Object[][] data = new Object[rowCount-1][colCount];


            for(int i=0;i<rowCount-1;i++)
            {
                HSSFRow row = sheet.getRow(i+1);

                for(int j=0;j<colCount;j++)

                    if(row.getCell(j) == null)

                        data[i][j] ="";
                    else
                    data[i][j] = row.getCell(j).toString();

            }

        return data;
    }
}

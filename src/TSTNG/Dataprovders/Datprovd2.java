package TSTNG.Dataprovders;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class Datprovd2 {


        @Test(dataProvider = "getData")
        public void mytest1(String username, String password) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://stock.scriptinglogic.net");
            driver.manage().window().maximize();
            driver.findElement(By.cssSelector("#login-username")).sendKeys(username);
            driver.findElement(By.cssSelector("#login-password")).sendKeys(password);
            driver.findElement(By.cssSelector("input[value='LOG IN']")).click();
        }

    @DataProvider
    public Object[][] getData() throws IOException {

        // 1. read the file
        FileInputStream fis = new FileInputStream("Data/myData.xls");

        // 2. convert the file object into workbook object
        HSSFWorkbook workbook = new HSSFWorkbook(fis);

        // 3. choose sheet from excel
        HSSFSheet sheet = workbook.getSheet("Sheet2");

        // 4. count the active rows
        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][2]; // 4 x 2

        //5. scan the rows and read the cell values in individual row
        for(int i=0;i<rowCount;i++)
        {
            HSSFRow row = sheet.getRow(i);

            HSSFCell username = row.getCell(0);

            if(username==null)
            {
                data[i][0] ="";
            }
            else
                data[i][0] = username.toString();

            HSSFCell password = row.getCell(1);

            if(password==null)
            {
                data[i][1] ="";
            }
            else
                data[i][1] = row.getCell(1).toString();
        }





        return data;

    }

}


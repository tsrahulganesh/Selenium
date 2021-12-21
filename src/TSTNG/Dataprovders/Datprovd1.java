package TSTNG.Dataprovders;

import io.github.bonigarcia.wdm.WebDriverManager;
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

public class Datprovd1 {
    @Test(dataProvider = "getData")
    public void mytest1(String uname, String pword) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://stock.scriptinglogic.net");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#login-username")).sendKeys(uname);
        driver.findElement(By.cssSelector("#login-password")).sendKeys(pword);
        driver.findElement(By.cssSelector("input[value='LOG IN']")).click();
    }

    @DataProvider
    public Object[][] getData() throws IOException {

        // 1.read the file
        FileInputStream fis = new FileInputStream("Data/Mydata.xls");

        //  2.convert the file object into workbook object
        HSSFWorkbook workbook = new HSSFWorkbook(fis);

        //3.choose the sheet
        HSSFSheet sheet = workbook.getSheet("Sheet1");

        //4.Count the active rows
        int rowCount = sheet.getPhysicalNumberOfRows();
        Object[][] data = new Object[rowCount][2];

        //5.scan the rows and read the cell values in individual row
        for (int i = 0; i < rowCount; i++) {
            HSSFRow row = sheet.getRow(i);
            data[i][0] = row.getCell(0).toString();
            data[i][1] = row.getCell(1).toString();


        }
        return data;
    }

}




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

import static TSTNG.Dataprovders.Datprovdutil.getmydata;

public class Datprovd7loginutil {


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

            return getmydata("Data/Mydata.xls","Sheet1");

        }

    }




package TSTNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.texen.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TNG10 {


        WebDriver driver;

        @BeforeClass
        public void openBrowser() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }


        @AfterClass
        public void closeBrowser() throws InterruptedException {
            Thread.sleep(2000);
            driver.close();
            driver.quit();

        }


        @Test
        public void mytest2() throws java.io.IOException {

            driver.get("https://www.facebook.com/");
            TakesScreenshot ts = (TakesScreenshot) driver;
            File sourcefile = ts.getScreenshotAs(OutputType.FILE);

            String timestamp = new SimpleDateFormat("_yyyyMMDD_HHMMSS").format(new Date());
            String fileName = "IMG"+timestamp+".png";
            FileUtils.copyFile(sourcefile, new File("C:\\Selenium Installers\\Selenium\\screenshot\\"+fileName));


/*TakeScreenshot = ts
sourcefile = house name
address = File
path = pincode
 */

        }
    }























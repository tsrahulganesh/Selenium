package TSTNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TNG9 {


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
        public void mytest1() {

            driver.get("http://www.naukri.com");
            String expected = "Jobs - Recruitment";
            String actual = driver.getTitle();

           boolean result = actual.contains(expected);
           Assert.assertEquals(actual,expected,"message Naukri");



        }

        @Test (enabled = false)
        public void mytest2() {

            driver.get("http://www.monster.com");

        }

        @Test (enabled = false)
        public void mytest3() {

            driver.get("http:www.shine.com");

        }
    }
















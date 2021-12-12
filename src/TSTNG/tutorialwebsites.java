package TSTNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class tutorialwebsites {


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

            driver.get("https://stock.scriptinglogic.net/add_customer.php");
        }


        @Test
        public void mytest2() {

            driver.get("https://www.edureka.co/");

        }

        @Test
        public void mytest3() {

            driver.get("https://skillnation.in/my-account/");

        }
    }





















package TSTNG.AllAnnotation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class socialwebsites {

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

            driver.get("https://www.instagram.com/");
        }


        @Test
        public void mytest2() {

            driver.get("https://www.facebook.com/");

        }

        @Test
        public void mytest3() {

            driver.get("https://www.linkedin.com/in");

        }
    }



















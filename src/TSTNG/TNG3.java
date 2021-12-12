package TSTNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TNG3 {



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

        }

        @Test
        public void mytest1(){

            driver.get("http://stock.scriptinglogic.net");
            driver.manage().window().maximize();
            driver.findElement(By.cssSelector("#login-username")).sendKeys("admin");
            driver.findElement(By.cssSelector("#login-password")).sendKeys("admin");
            //driver.findElement(By.cssSelector("input[value='LOG IN']")).click();
        }
        @Test
        public void mytest2() {

            driver.get("http://stock.scriptinglogic.net");
            driver.manage().window().maximize();
            driver.findElement(By.cssSelector("#login-username")).sendKeys("admin");
            driver.findElement(By.cssSelector("#login-password")).sendKeys("admin123");
           // driver.findElement(By.cssSelector("input[value='LOG IN']")).click();
        }
        @Test
        public void mytest3() {

            driver.get("http://stock.scriptinglogic.net");
            driver.manage().window().maximize();
            driver.findElement(By.cssSelector("#login-username")).sendKeys(" ");
            driver.findElement(By.cssSelector("#login-password")).sendKeys("admin");
           // driver.findElement(By.cssSelector("input[value='LOG IN']")).click();
        }
    }











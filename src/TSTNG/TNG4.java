package TSTNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TNG4 {

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

        @Test (priority = 3)
        public void mytest1() {

            driver.get("http://www.naukri.com");
            /*driver.manage().window().maximize();
            driver.findElement(By.cssSelector("#login-username")).sendKeys("admin");
            driver.findElement(By.cssSelector("#login-password")).sendKeys("admin");
            driver.findElement(By.cssSelector("input[value='LOG IN']")).click();*/
        }

        @Test (priority = 2)
        public void mytest2() {

            driver.get("http://www.monster.com");
           /* driver.manage().window().maximize();
            driver.findElement(By.cssSelector("#login-username")).sendKeys("admin");
            driver.findElement(By.cssSelector("#login-password")).sendKeys("admin123");
            driver.findElement(By.cssSelector("input[value='LOG IN']")).click();*/
        }

        @Test (priority = 1)
        public void mytest3() {

            driver.get("http:www.shine.com");
            /*driver.manage().window().maximize();
            driver.findElement(By.cssSelector("#login-username")).sendKeys(" ");
            driver.findElement(By.cssSelector("#login-password")).sendKeys("admin");
            driver.findElement(By.cssSelector("input[value='LOG IN']")).click();*/
        }
    }














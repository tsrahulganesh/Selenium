package TSTNG.AllAnnotation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNG2 {
    WebDriver driver;

    @BeforeMethod
        public void openBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }


    @AfterMethod
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
            driver.findElement(By.cssSelector("input[value='LOG IN']")).click();
        }
        @Test
        public void mytest2() {

            driver.get("http://stock.scriptinglogic.net");
            driver.manage().window().maximize();
            driver.findElement(By.cssSelector("#login-username")).sendKeys("admin");
            driver.findElement(By.cssSelector("#login-password")).sendKeys("admin123");
            driver.findElement(By.cssSelector("input[value='LOG IN']")).click();
        }
        @Test
        public void mytest3() {

            driver.get("http://stock.scriptinglogic.net");
            driver.manage().window().maximize();
            driver.findElement(By.cssSelector("#login-username")).sendKeys(" ");
            driver.findElement(By.cssSelector("#login-password")).sendKeys("admin");
            driver.findElement(By.cssSelector("input[value='LOG IN']")).click();
        }
    }









package Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit3 {

       static WebDriver driver;

        @BeforeClass //Method below this annotation will run before first test method of the class
        public static void openBrowser() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @AfterClass //Method below this annotation will run after last test of the class
        public static void closeBrowser()
        {
            driver.close();
        }
        @Test
        public void myTest1() {

            driver.get("http://billing.scriptinglogic.net");
            driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("amolujagare@gmail.com");
            driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("admin123");
            //driver.findElement(By.xpath("(//input[@name='btn_login'])[1]")).click();
        }

        @Test
        public void myTest2() {

            driver.get("http://billing.scriptinglogic.net");
            driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("amolujagare@gmail");
            driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("admin123");
            //driver.findElement(By.xpath("(//input[@name='btn_login'])[1]")).click();
        }

        @Test
        public void myTest3() {

            driver.get("http://billing.scriptinglogic.net");
            driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("");
            driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("");
           // driver.findElement(By.xpath("(//input[@name='btn_login'])[1]")).click();
        }



    }






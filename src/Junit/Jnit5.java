package Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TimeoutException;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Jnit5 {



        static WebDriver driver;

        @BeforeClass //Method below this annotation will run before first test method of the class
        public static void openBrowser() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @AfterClass //Method below this annotation will run after last test of the class
        public static void closeBrowser() {
            driver.close();
        }

        @Test
        public void myTest1() {

            driver.get("http://stock.scriptinglogic.net/");
            driver.findElement(By.id("login-username")).sendKeys("admin");
            driver.findElement(By.id("login-password")).sendKeys("admin");
            driver.findElement(By.name("submit")).click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);

            //String expected = "http://stock.scriptinglogic.net/dashboard.php";// Expected to this program will fail
            //String actual = driver.getCurrentUrl();

            /*String expected = "POSNIC - Dashboard";
            String actual = driver.getTitle();*/

            String expected ="Log out" ;
            String actual = driver.findElement(By.cssSelector(".round.button.dark.menu-logoff.image-left")).getText();


            Assert.assertEquals("This is not dashboard",expected,actual);
        }
    }
/*org.junit.ComparisonFailure: This is not dashboard
Expected :log - out
Actual   :Log out*/








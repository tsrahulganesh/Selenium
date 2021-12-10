import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit4 {


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
            driver.findElement(By.id("login-password")).sendKeys("admin1");
            driver.findElement(By.name("submit")).click();

            String expected = "http://stock.scriptinglogic.net/dashboard.php";// Expected to this program will fail
            String actual = driver.getCurrentUrl();

            Assert.assertEquals("This is not dashboard",expected,actual);
        }
    }







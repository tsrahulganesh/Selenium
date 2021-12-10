import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit2 {

    WebDriver driver;

    @Before //Method below this annotation will run before every test
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After //Method below this annotation will run after every test
    public void closeBrowser()
    {
        driver.close();
    }
        @Test
        public void myTest1() {

            driver.get("http://billing.scriptinglogic.net");
            driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("amolujagare@gmail.com");
            driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("admin123");
            driver.findElement(By.xpath("(//input[@name='btn_login'])[1]")).click();
        }

        @Test
        public void myTest2() {

            driver.get("http://billing.scriptinglogic.net");
            driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("amolujagare@gmail");
            driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("admin123");
            driver.findElement(By.xpath("(//input[@name='btn_login'])[1]")).click();
        }

        @Test
        public void myTest3() {

            driver.get("http://billing.scriptinglogic.net");
            driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("");
            driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("");
            driver.findElement(By.xpath("(//input[@name='btn_login'])[1]")).click();
        }



    }




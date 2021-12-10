package Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit7 {

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
            WebElement username1 =driver.findElement(By.xpath("//input[@id=\"login-username\"]"));
            username1.sendKeys("admin");

            WebElement password =driver.findElement(By.xpath("//input[@id='login-password']"));
            password.sendKeys("admin");
            WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input"));
            loginbtn.click();

            WebElement Addbtn = driver.findElement(By.xpath("//a[normalize-space()='Add Customer']"));
            Addbtn.click();
            WebElement Name =  driver.findElement(By.xpath("//*[@id=\"name\"]"));
            Name.sendKeys("Gany18");
            WebElement contact1 =  driver.findElement(By.xpath("//*[@id=\"buyingrate\"]"));
            contact1.sendKeys("Gany18");
            WebElement address =  driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[3]/td[2]/textarea"));
            address.sendKeys("Gany18");
            WebElement contact2 =  driver.findElement(By.xpath("//*[@id=\"sellingrate\"]"));
            contact2.sendKeys("Gany18");
            WebElement Addbtn2 = driver.findElement(By.xpath("//input[@name='Submit']"));
            Addbtn2.click();


            String expected = "[ gany16 ] Customer Details Added !";
            String actual = null;
            try {
                actual = driver.findElement(By.cssSelector("//div[@class='confirmation-box round']")).getText();
            }
            catch (Exception e) {
                actual = "";
            }
            System.out.println("expected="+expected);
            System.out.println("actual = +expected");

            Assert.assertEquals("customer added successfully",expected,actual);
        }
    }

/*expected=Dublicat Entry. Please Verify
actual = +actual

org.junit.ComparisonFailure: Incorrect error message or error message absent
Expected :Dublicat Entry. Please Verify
Actual   :
*/









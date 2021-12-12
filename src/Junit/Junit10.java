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

public class Junit10 {

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
        public void myTest1() throws InterruptedException {

            driver.get("http://stock.scriptinglogic.net/");
            WebElement username1 =driver.findElement(By.xpath("//input[@id=\"login-username\"]"));
            username1.sendKeys("admin");

            WebElement password =driver.findElement(By.xpath("//input[@id='login-password']"));
            password.sendKeys("admin");
            WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input"));
            loginbtn.click();
            Thread.sleep(2000);

            WebElement Addbtn = driver.findElement(By.xpath("//a[normalize-space()='Add Customer']"));
            Addbtn.click();
            //-----Add customer page-----//
            String custName =" ";
            WebElement txtName =  driver.findElement(By.xpath("//*[@id=\"name\"]"));
            txtName.sendKeys(custName);
            WebElement contact1 =  driver.findElement(By.xpath("//*[@id=\"buyingrate\"]"));
            contact1.sendKeys("234344234234");
            WebElement address =  driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[3]/td[2]/textarea"));
            address.sendKeys("lkjasdflkjslkjsdf");
            WebElement contact2 =  driver.findElement(By.xpath("//*[@id=\"sellingrate\"]"));
            contact2.sendKeys("Gany");
            WebElement Addbtn2 = driver.findElement(By.xpath("//input[@name='Submit']"));
            Addbtn2.click();


            String expected = "Please enter a Customer Name";
            String actual = null;
            try {
                actual = driver.findElement(By.cssSelector("//label[normalize-space()='Please enter a Customer Name']")).getText();
            }
            catch (Exception e) {
                actual = "";
            }
            boolean result = actual.contains(expected);
            Assert.assertTrue("incorrect/message absent",result);
        }
    }















package TSTNG.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;


public class ExtentReportDemo1 {
    ExtentReports extent;
    @BeforeClass
        public void initExtentReport() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report3.html");
        extent = new ExtentReports();


        reporter.config().setReportName("All regression tests");
        reporter.config().setDocumentTitle("All types of websites");
        extent.attachReporter(reporter);

        extent.setSystemInfo("Developers name", "kapil1");
        extent.setSystemInfo("Test Manager name", "kapil2");
        extent.setSystemInfo("Test Lead name", "kapil3");
        extent.setSystemInfo("Project Manager name", "kapil4");
    }
    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }

        @Test
        public void Mytest1( )  throws IOException{

            ExtentTest test = extent.createTest("valid login test");

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();



            driver.manage().window().maximize();
            test.info("Browser is Maximized");
            driver.get("https://stock.scriptinglogic.net/");


            test.info("Browser is open");

            WebElement username1 =driver.findElement(By.xpath("//input[@id=\"login-username\"]"));
            username1.sendKeys("admin");
            test.info("username is entered");

            WebElement password =driver.findElement(By.xpath("//input[@id='login-password']"));
            password.sendKeys("admin");
            test.info("password is entered");

            WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input"));
            loginbtn.click();
            test.info("Login button done");

            WebElement Addcust = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul/li[4]/a"));
            Addcust.click();
            WebElement Name =  driver.findElement(By.xpath("//*[@id=\"name\"]"));
            Name.sendKeys("Gany22");
            WebElement contact1 =  driver.findElement(By.xpath("//*[@id=\"buyingrate\"]"));
            contact1.sendKeys("Gany");
            WebElement address =  driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[3]/td[2]/textarea"));
            address.sendKeys("Gany");
            WebElement contact2 =  driver.findElement(By.xpath("//*[@id=\"sellingrate\"]"));
            contact2.sendKeys("Gany");
            WebElement Addbtn = driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[5]/td[2]/input"));
            Addbtn.click();
            test.info("Customer added succesfully");



        }
    }




package TSTNG.Dataprovders;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import static TSTNG.Dataprovders.Datprovdutil.getmydata;

public class Datprovd6util {


        WebDriver driver;

        @BeforeClass
        public void doLogin()
        {
            // --- Login page ------------

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://stock.scriptinglogic.net/");

            WebElement txtUsername = driver.findElement(By.id("login-username"));
            txtUsername.sendKeys("admin");

            WebElement txtPassword = driver.findElement(By.id("login-password"));
            txtPassword.sendKeys("admin");

            WebElement btnLogin = driver.findElement(By.name("submit"));
            btnLogin.click();
        }




        @Test(dataProvider = "getdata")
        public  void Addcust (String name,String add,String contact1,
                              String contact2) {

            //----------- Home page -----------

            WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
            lnkAddCustomer.click();

            // --- Add customer page ------
            WebElement txtName = driver.findElement(By.name("name"));
            txtName.sendKeys(name);

            WebElement txtAddress = driver.findElement(By.name("address"));
            txtAddress.sendKeys(add);

            WebElement txtContact1 = driver.findElement(By.name("contact1"));
            txtContact1.sendKeys(contact1);

            WebElement txtContact2 = driver.findElement(By.name("contact2"));
            txtContact2.sendKeys(contact2);

            WebElement btnAdd = driver.findElement(By.name("Submit"));
            btnAdd.click();
        }

        @DataProvider
        public Object[][] getdata() throws IOException {

            return getmydata("Data/Mydata.xls","addcust2");
        }


    }






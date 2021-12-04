package Seleniumbasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.Address;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://stock.scriptinglogic.net/");
        driver.getTitle();
        //driver.navigate().refresh();
        //driver.navigate().back();
        driver.manage().window().maximize();

        // -------login page ------//
        WebElement Textusername = driver.findElement(By.id("login-username"));
        Textusername.sendKeys("admin");
        WebElement Textpwd = driver.findElement(By.id("login-password"));
        Textpwd.sendKeys("admin");
        WebElement loginbtn = driver.findElement(By.name("submit"));
        loginbtn.click();
        //------Add customer page ------//
        WebElement LnkAddcustomer = driver.findElement(By.linkText("Add Customer"));
        LnkAddcustomer.click();

        WebElement CustomerName=driver.findElement(By.id("name"));
        CustomerName.sendKeys("Gany04");

        WebElement contact1 = driver.findElement(By.name("contact1"));
        contact1.sendKeys("2323232");

        WebElement Address  = driver.findElement(By.name("address"));
        Address.sendKeys("IdontknowIdontknow");

        WebElement contact2= driver.findElement(By.name("contact2"));
        contact2.sendKeys("8484894949");

         WebElement Addbtn = driver.findElement(By.name("Submit"));
         Addbtn.click();

         //-----Add customer 2 ---------//

        WebDriverManager.chromedriver().setup();
        WebDriver driver2 = new ChromeDriver();
        driver2.get("http://stock.scriptinglogic.net/");
        driver2.getTitle();
        //driver.navigate().refresh();
        //driver.navigate().back();
        driver2.manage().window().maximize();
        WebElement Textusername2 = driver2.findElement(By.id("login-username"));
        Textusername2.sendKeys("admin");
        WebElement Textpwd2 = driver2.findElement(By.id("login-password"));
        Textpwd2.sendKeys("admin");
        WebElement loginbtn2 = driver2.findElement(By.name("submit"));
        loginbtn2.click();

        WebElement LnkAddcustomer2 = driver2.findElement(By.linkText("Add Customer"));
        LnkAddcustomer2.click();

        WebElement CustomerName2=driver2.findElement(By.id("name"));
        CustomerName2.sendKeys("Gany05");

        WebElement contact12 = driver2.findElement(By.name("contact1"));
        contact12.sendKeys("2323232");

        WebElement Address2  = driver2.findElement(By.name("address"));
        Address2.sendKeys("IdontknowIdontknow");

        WebElement contact22= driver2.findElement(By.name("contact2"));
        contact22.sendKeys("8484894949");

        WebElement Addbtn2 = driver2.findElement(By.name("Submit"));
        Addbtn2.click();



    }

}

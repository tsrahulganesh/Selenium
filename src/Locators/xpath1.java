package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://stock.scriptinglogic.net/");
        driver.manage().window().maximize();
       WebElement username1 =driver.findElement(By.xpath("//input[@id=\"login-username\"]"));
               username1.sendKeys("admin");

       WebElement password =driver.findElement(By.xpath("//input[@id='login-password']"));
       password.sendKeys("admin");

      // WebElement linktxt = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/a"));
       //linktxt.click();
        WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input"));
        loginbtn.click();
        WebElement Addcust = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul/li[4]/a"));
        Addcust.click();
        WebElement Name =  driver.findElement(By.xpath("//*[@id=\"name\"]"));
        Name.sendKeys("Gany09");
        WebElement contact1 =  driver.findElement(By.xpath("//*[@id=\"buyingrate\"]"));
        contact1.sendKeys("Gany09");
        WebElement address =  driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[3]/td[2]/textarea"));
        address.sendKeys("Gany09");
        WebElement contact2 =  driver.findElement(By.xpath("//*[@id=\"sellingrate\"]"));
        contact2.sendKeys("Gany09");
       WebElement Addbtn = driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[5]/td[2]/input"));
        Addbtn.click();




    }
}

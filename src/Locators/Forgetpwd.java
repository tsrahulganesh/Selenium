package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgetpwd {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://stock.scriptinglogic.net/");
        driver.manage().window().maximize();
        //WebElement Txtusername = driver.findElement(By.className("round full-width-input"));
        //Txtusername.sendKeys("admin");
        //WebElement Txtpwd = driver.findElement(By.className("round full-width-input"));
        //Txtpwd.sendKeys("giving wrong pwd");
        //WebElement Forgetpwd = driver.findElement(By.linkText("Forgot your password?"));
        WebElement Forgetpwd = driver.findElement(By.partialLinkText("Forgot yo"));
        Forgetpwd.click();

    }

}

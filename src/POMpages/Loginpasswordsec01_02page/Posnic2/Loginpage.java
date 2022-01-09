package POMpages.Loginpasswordsec01_02page.Posnic2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static Utility.ConfigReader.getUrl;

public class Loginpage {



   /* WebDriver driver;
    WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));*/


        @FindBy(xpath = "//input[@id='login-username']")
        public WebElement txtUsername;

        public @FindBy(xpath = "//input[@id='login-password']")
        WebElement txtPassword;

        public @FindBy(xpath = "//input[@name='submit']")
        WebElement btnLogin;


        @FindBy (xpath = "//a[normalize-space()='Forgot your password?']")
        WebElement lnkForgotPass;

        public Loginpage(WebDriver driver)
        {
            PageFactory.initElements(driver,this);
        }

    public  void clickForgotPass()
    {
        lnkForgotPass.click();
    }

        public void setTxtUsername (String username)
        {
            txtUsername.sendKeys(username);
        }

        public void setTxtPassword (String password)
        {
            txtPassword.sendKeys(password);
        }

        public void clickLogin ()
        {
            btnLogin.click();
        }

    }



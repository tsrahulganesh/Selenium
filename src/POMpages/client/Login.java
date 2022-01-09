package POMpages.client;

import Utility.Openurl2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login  {

        WebDriver driver;

        @FindBy(xpath = "//input[@id='email']")
        WebElement txtEmail;


        @FindBy(xpath = "//input[@id='password']")
        WebElement txtpassword;


        @FindBy(xpath = "//button[normalize-space()='Login']")
        WebElement btnlogin;


        @FindBy(xpath = "//a[normalize-space()='I forgot my password']")
        WebElement forgotlink;


        public Login(WebDriver driver) {
            this.driver = driver;

            PageFactory.initElements(driver, this);

        }


        public void setUsername(String username)
        {
            txtEmail.sendKeys(username);
        }      // set method used here

        public void setPassword(String password)

        {
            txtpassword.sendKeys(password);
        }        // set method used here

        public void clickLogin()
        {
            btnlogin.click();
        }
        public void  clickForgotPass() {forgotlink.click();}
    }


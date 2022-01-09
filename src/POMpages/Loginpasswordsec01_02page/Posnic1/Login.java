package POMpages.Loginpasswordsec01_02page.Posnic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {



   /* WebDriver driver;
    WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));*/


    @FindBy(xpath = "//input[@id='login-username']")
    public WebElement txtUsername;

    public @FindBy(xpath = "//input[@id='login-password']")
    WebElement txtPassword;

    public @FindBy(xpath = "//input[@name='submit']")
    WebElement btnLogin;

    /*public @FindBy(xpath = "//a[normalize-space()='Forgot your password?']")
    WebElement clicklink1;



    // @FindBy (xpath = "//a[normalize-space()='Forgot Password?']")
    //WebElement lnkForgotPass;*/

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    /*public  void clickForgotPass()
    {
        clicklink1.click();
    }*/


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



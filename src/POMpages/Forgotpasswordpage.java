package POMpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpasswordpage {

    public@FindBy(xpath = "//input[@id='uname']")
    WebElement txtUsername;

    public @FindBy(xpath = "//input[@id='pwd']")
    WebElement txtPassword;

    public @FindBy(xpath = "//a[normalize-space()='Forgot Password?']")
    WebElement clicklink1;

    public Forgotpasswordpage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }



    public void setTxtUsername (String username)
    {
        txtUsername.sendKeys(username);
    }

    public void setTxtPassword (String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clicklink() {
        clicklink1.click();
    }
}




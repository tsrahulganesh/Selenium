package POMpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPass {

    public@FindBy(xpath = "//input[@id='email_id']")
    WebElement txtemail;

    public @FindBy(xpath = "//input[@name='sub']")
    WebElement btnsubmit;



    public ForgotPass(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }



    public void setTxtUsername (String username)
    {
        txtemail.sendKeys(username);
    }



    public void clickbutton() {
        btnsubmit.click();
    }
}




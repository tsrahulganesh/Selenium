package POMpages.client;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Forgotpass {



        @FindBy(xpath = "//input[@id='email']")
        WebElement txtemail;

    public Forgotpass(WebDriver driver)
    {PageFactory.initElements(driver, this);}


        public void setTxtemail (String forgotpassword)
        {
            txtemail.sendKeys(forgotpassword);
        }
    }



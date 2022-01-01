package POMpages.client;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Forgotpass {


        WebDriver driver;
        @FindBy(xpath = ".//*[@id='login']/div[2]/small/a")
        WebElement txtforgotpassword;

    Forgotpass(WebDriver driver) {
            this.driver = driver;

            PageFactory.initElements(driver, this);


        }
        public void setforgotpassword(String forgotpassword)
        {
            txtforgotpassword.sendKeys(forgotpassword);
        }
    }



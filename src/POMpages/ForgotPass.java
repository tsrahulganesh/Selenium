package POMpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPass {

    public@FindBy(xpath = "//input[@id='name']")
    WebElement Favorite;

    public @FindBy(xpath = "//input[@name='submit']")
    WebElement btnsubmit;



    public ForgotPass(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }



    public void setFavorite (String favorite)
    {
        Favorite.sendKeys(favorite);
    }



    public void clickbutton() {
        btnsubmit.click();
    }
}




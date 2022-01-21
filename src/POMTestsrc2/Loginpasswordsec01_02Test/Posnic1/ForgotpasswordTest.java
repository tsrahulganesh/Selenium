package POMTestsrc2.Loginpasswordsec01_02Test.Posnic1;

import POMpages.Loginpasswordsec01_02page.Posnic1.Forgotpasswordpage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class ForgotpasswordTest {

    @Test
    public void ForgotpasswordTest1() throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net/");

        Forgotpasswordpage Forgot = new Forgotpasswordpage(driver);

        Forgot.setTxtUsername("admin");
        Forgot.setTxtPassword("werwe");

        Forgot.clicklink();

    }
}










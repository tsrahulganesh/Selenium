package Loginpasswordsec01_02Test.Posnic2;

import POMpages.Loginpasswordsec01_02page.Posnic2.Loginpage;
import Utility.OpenUrl;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginpageTest extends OpenUrl{



    @Test
    public void LoginpageTest1() throws IOException {

       /* WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net/");*/

        Loginpage login = new Loginpage(driver);

        login.setTxtUsername("admin");
        login.setTxtPassword("admin");
        login.clickLogin();

    }


}

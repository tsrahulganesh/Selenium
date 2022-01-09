package Loginpasswordsec01_02Test.Posnic1;

import POMpages.Loginpasswordsec01_02page.Posnic1.Login;

import org.testng.annotations.Test;
import Utility.OpenUrl;

import java.io.IOException;


public class LoginTest  extends OpenUrl {



        @Test
        public void LoginTest1() throws IOException {

                /*WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();

                driver.get("https://10.20.50.61/erp/");*/

                Login login = new Login(driver);

                login.setTxtUsername("admin");
                login.setTxtPassword("admin");
                login.clickLogin();

        }


}

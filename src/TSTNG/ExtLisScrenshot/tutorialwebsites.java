package TSTNG.ExtLisScrenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class tutorialwebsites extends Util {

        @Test
        public void mytest1() {

            driver.get("https://stock.scriptinglogic.net/add_customer.php");
        }


        @Test
        public void mytest2() {

            driver.get("https://www.edureka.co/");

        }

        @Test
        public void mytest3() {

            driver.get("https://skillnation.in/my-account/");

        }
    }





















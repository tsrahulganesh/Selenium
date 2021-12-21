package TSTNG.ExtLisScrenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class socialwebsites extends Util {


        @Test
        public void mytest1() {

            driver.get("https://www.instagram.com/");
        }


        @Test
        public void mytest2() {

            driver.get("https://www.facebook.com/");

        }

        @Test
        public void mytest3() {

            driver.get("https://www.linkedin.com/in");
            Assert.assertEquals(true,false,"This is failed");


        }
    }



















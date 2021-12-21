package TSTNG.ExtLisScrenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class jobwebsites extends Util {


    @Test
    public void mytest1() {

        driver.get("http://www.naukri.com");
    }


        @Test
        public void mytest2() {

            driver.get("http://www.monster.com");

        }

        @Test
        public void mytest3() {

            driver.get("http:www.shine.com");
           // Assert.assertEquals("This is failed",true,false);

        }
    }

















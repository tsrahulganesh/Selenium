package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css1 {

        public static void main(String[] args) {
                WebDriverManager.chromedriver().setup();
                WebDriver driver=new ChromeDriver();
                driver.get("http://stock.scriptinglogic.net");
                driver.manage().window().maximize();
                /*driver.findElement(By.cssSelector("#login-username")).sendKeys("admin");
                driver.findElement(By.cssSelector("#login-password")).sendKeys("admin");
                driver.findElement(By.cssSelector("input[value='LOG IN']")).click();*/

                driver.findElement(By.cssSelector("input[type=text]")).sendKeys("admin");
                driver.findElement(By.cssSelector("input#login-password")).sendKeys("admin");
                driver.findElement(By.cssSelector(".blue")).click();
                //in case of no id or name then -----
                //---== tagName[attribute=value]
                // input[type=text]




        }
        }







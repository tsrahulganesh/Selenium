package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css2 {

        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.in/s?k=amarendra+chitale+book&crid=2XLY5YSE02FUJ&sprefix=amrendra+chitra%2Caps%2C1024&ref=nb_sb_noss");
            driver.manage().window().maximize();

            driver.findElement(By.cssSelector("img[alt^=NLP")).click();//find webelement 'starts with'
            driver.findElement(By.cssSelector("img[alt$='Agile'")).click();//find webelement 'ends with'
            //also can be --- Contains-->img[alt*='Transforming']
        }
    }




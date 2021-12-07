package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/s?k=amarendra+chitale+book&crid=2XLY5YSE02FUJ&sprefix=amrendra+chitra%2Caps%2C1024&ref=nb_sb_noss");
        driver.manage().window().maximize();
        //when ID and name keywords not found in html we can do it by text
       //driver.findElement(By.xpath("//span[text()='NLP Life Transforming Neuro Magical Stories']")).click();
       //span[contains(text(),'NLP Life' )]
        driver.findElement(By.xpath("//span[contains(text(),'NLP Life' )]")).click();
    }
}

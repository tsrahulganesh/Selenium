package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/s?k=amarendra+chitale+book&crid=2XLY5YSE02FUJ&sprefix=amrendra+chitra%2Caps%2C1024&ref=nb_sb_noss");
        driver.manage().window().maximize();
        //when you find some 4 to 5 para of html xpath we can do like below
        //driver.findElement(By.xpath("//img[@alt='NLP Life Transforming Neuro Magical Stories']")).click();
        //by using sub string
        driver.findElement(By.xpath("//img[contains( @alt, 'Being' )]")).click();
        driver.findElement(By.xpath("//img[contains( @alt, 'NLP' )]")).click();
    }
}

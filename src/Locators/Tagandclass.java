package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

//By useing Findelements and tag

public class Tagandclass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://stock.scriptinglogic.net/");
        driver.manage().window().maximize();
        driver.getTitle();
        List<WebElement> weblist = driver.findElements (By.tagName("input"));
        System.out.println("size="+weblist.size());// size is 3
        weblist.get(0).sendKeys("admin");//username text box
        weblist.get(1).sendKeys("admin");//pwd
        weblist.get(2).click();//loginbtn
    }

}

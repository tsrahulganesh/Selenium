package Login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class classname {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://scriptinglogic.org/");
        driver.getTitle();
       List< WebElement > weblist=driver.findElements(By.className("elementor-button-text"));
       System.out.println("size="+ weblist.size());
       System.out.println(weblist.get(0).getText());
       System.out.println(weblist.get(1).getText());
       System.out.println(weblist.get(2).getText());
       System.out.println(weblist.get(3).getText());
       /*
       Result :
       size=4
       Explore our courses
       Learn More
       Learn More
       Buy Now*/



    }
    }


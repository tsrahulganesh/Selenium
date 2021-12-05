import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class dropdown2 {
    public static void main(String[] args)  throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lifepartner.in/");
        driver.getTitle();
        driver.manage().window().maximize();
        WebElement lookingfor=driver.findElement(By.id("sel3"));
        Select sel = new Select(lookingfor);
        sel.selectByValue("2");
        Thread.sleep(3000);
        WebElement Age = driver.findElement(By.id("sel1"));
        Select sel2 = new Select(Age);
        sel2.selectByVisibleText("56");
        Thread.sleep(3000);
        WebElement Age2 = driver.findElement(By.id("sel2"));
        Select sel3 = new Select(Age2);
        sel3.selectByVisibleText("65");
        Thread.sleep(3000);
        WebElement Community =driver.findElement(By.id("sel4"));
        Select sel4= new Select(Community);
        sel4.selectByValue("Christian");
        Thread.sleep(3000);
        WebElement status =driver.findElement(By.id("sel5"));
        Select sel5= new Select(status);
        sel5.selectByValue("7");
        Thread.sleep(3000);
        WebElement loginbtn =driver.findElement(By.className("search-btn"));
        loginbtn.click();


    }
}


package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://billing.scriptinglogic.net/index.php/sessions/login");
        WebElement user=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        user.sendKeys("baasha");
        WebElement pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        pwd.sendKeys("koiboi");
        //when you have (          'I forgot my password'  ) and i have to trim the spaces then xpath will be like this below
        driver.findElement(By.xpath("//a[normalize-space()='I forgot my password']")).click();//"

    }
}

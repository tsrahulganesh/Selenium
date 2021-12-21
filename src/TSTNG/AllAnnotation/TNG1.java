package TSTNG.AllAnnotation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TNG1 {

    @Test
    public void mytest1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://stock.scriptinglogic.net");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#login-username")).sendKeys("admin");
        driver.findElement(By.cssSelector("#login-password")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[value='LOG IN']")).click();
    }
    @Test
    public void mytest2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://stock.scriptinglogic.net");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#login-username")).sendKeys("admin");
        driver.findElement(By.cssSelector("#login-password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("input[value='LOG IN']")).click();
    }
    @Test
    public void mytest3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://stock.scriptinglogic.net");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#login-username")).sendKeys(" ");
        driver.findElement(By.cssSelector("#login-password")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[value='LOG IN']")).click();
    }
}






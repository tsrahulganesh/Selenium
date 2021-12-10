package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath8 {


        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("http://billing.scriptinglogic.net");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("amolujagare@gmail.com");
            driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("admin123");
            driver.findElement(By.xpath("(//input[@name='btn_login'])[1]")).click();
            driver.findElement(By.xpath("(//span[normalize-space()='Clients'])[1]")).click();
           // driver.findElement(By.xpath("//a[contains(text(),'Add Client')]")).click();
            driver.findElement(By.xpath("//a[normalize-space()='View Clients']")).click();
           // driver.findElement(By.xpath("//a[normalize-space()='View Clients']")).click();
           driver.findElement(By.xpath("//a[normalize-space()='Abhijeet walgude12']")).click();
            //driver.findElement(By.xpath("//tr[td/a[text()='Abhijeet walgude']]//a[normalize-space()='Edit']")).click();
            driver.findElement(By.xpath("//tbody/tr[5]/td[6]/div[1]/a[1]")).click();





        }
    }



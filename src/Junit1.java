import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class Junit1 {


       @Test
        public void myTest1() {
              WebDriverManager.chromedriver().setup();
              WebDriver driver = new ChromeDriver();
              driver.get("http://billing.scriptinglogic.net");
              driver.manage().window().maximize();

              driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("amolujagare@gmail.com");
              driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("admin123");
              driver.findElement(By.xpath("(//input[@name='btn_login'])[1]")).click();
        }

        @Test
        public void myTest2() {
              WebDriverManager.chromedriver().setup();
              WebDriver driver = new ChromeDriver();
              driver.get("http://billing.scriptinglogic.net");
              driver.manage().window().maximize();

              driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("amolujagare@gmail");
              driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("admin123");
              driver.findElement(By.xpath("(//input[@name='btn_login'])[1]")).click();
        }

        @Test
              public void myTest3() {
              WebDriverManager.chromedriver().setup();
              WebDriver driver = new ChromeDriver();
              driver.get("http://billing.scriptinglogic.net");
              driver.manage().window().maximize();

                    driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("");
                    driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("");
                    driver.findElement(By.xpath("(//input[@name='btn_login'])[1]")).click();
              }



}




import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Rahul%20Gany/Desktop/amol.html");
        driver.manage().window().maximize();
       WebElement Txtname = driver.findElement(By.name("myName"));
       Txtname.sendKeys("Rahul");
       WebElement Email = driver.findElement(By.id("email"));
       Email.sendKeys("email");
       WebElement password = driver.findElement(By.name("mypass"));
       password.sendKeys("password");
        WebElement drpsel = driver.findElement(By.id("seltext"));
        Select sel = new Select(drpsel);
        //Thread.Sleep(3000);
        //sel.selectByValue("v12");
        sel.selectByIndex(3);
        //sel.deselectByVisibleText(" text 1");
        //WebElement drpsel2 = driver.findElement(By.id("multiSel"));
        //sel.selectByIndex(3);


    }
}


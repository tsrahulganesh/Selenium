import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidrop {
    public static void main(String[] args)  throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Rahul%20Gany/Desktop/amol.html");
        driver.getTitle();
        driver.manage().window().maximize();
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("Rahul2");
        Thread.sleep(2000);
        WebElement Email = driver.findElement(By.name("myemail"));
        Email.sendKeys("asdfkj");
        Thread.sleep(2000);

        WebElement Paswd= driver.findElement(By.id("pass"));
        Paswd.sendKeys("babu");
        Thread.sleep(2000);

        WebElement drop1 = driver.findElement(By.id("seltext"));
        Select drop11= new Select(drop1);
        drop11.selectByValue("v13");


        WebElement drop2 = driver.findElement(By.id("multiSel"));
        Select Multiselect = new Select(drop2);

        Multiselect.selectByIndex(1);
        Thread.sleep(2000);
        Multiselect.selectByVisibleText("text 3");
        Thread.sleep(2000);
        Multiselect.selectByIndex(4);
        Thread.sleep(2000);

        //Multiselect.deselectByVisibleText("text 5");
        //Thread.sleep(2000);
        //Multiselect.deselectByVisibleText("text 2");
        Multiselect.deselectAll();



    }
}

package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");
        driver.getTitle();
        driver.manage().window().maximize();

        /*WebElement Roll=driver.findElement(By.id("select2-drop-mask"));
        Select sel = new Select(Roll);
        sel.selectByVisibleText("Database Administrator");
        sel.selectByVisibleText("Database Architect");
        Thread.sleep(2000);

        WebElement Experiance_min =driver.findElement(By.id("select2-chosen-1"));
        Select sel2 = new Select(Experiance_min);
        sel2.selectByVisibleText("3");


        WebElement Experiance_max=driver.findElement(By.id("select2-chosen-2"));
        Select sel3 = new Select(Experiance_min);
        sel3.selectByVisibleText("5");*/


        WebElement Keyskills=driver.findElement(By.id("fld_383"));//text
        Keyskills.sendKeys("babooookaaosakamoraoo");


        /*WebElement Jobtype=driver.findElement(By.id("select2-chosen-3"));
        Select sel4 = new Select(Jobtype);
        sel4.selectByIndex(2);
        Thread.sleep(2000);*/

        WebElement Joblocation=driver.findElement(By.id("source_118"));
        Select sel5 = new Select(Joblocation);
        sel5.selectByVisibleText("Bangalore");
        sel5.selectByVisibleText("Chennai");
        sel5.selectByVisibleText("Mumbai");
        Thread.sleep(2000);

        WebElement clickadd =driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]"));
         clickadd.click();
        Thread.sleep(2000);

        WebElement Deselect=driver.findElement(By.id("fld_118"));
        Select sel6 =new Select(Deselect);
        sel6.selectByIndex(0);
        Thread.sleep(2000);

        WebElement Remobtn=driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]"));
        Remobtn.click();


        WebElement Qualification=driver.findElement(By.id("source_508"));
        Select sel7 = new Select(Qualification);
        sel7.selectByVisibleText("Any Basic Graduation");
        //sel7.selectByValue("18");
        sel7.selectByVisibleText("B.A");
        Thread.sleep(2000);

        WebElement clickadd2 =driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/img[1]"));
        clickadd2.click();
        Thread.sleep(2000);

        WebElement Deselect2=driver.findElement(By.id("fld_508"));
        Select sel8 =new Select(Deselect2);
        sel8.selectByIndex(0);
        Thread.sleep(2000);

        WebElement Remobtn2=driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/img[2]"));
        Remobtn2.click();

    }
}

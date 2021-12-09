package Locators;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//tr[td[text()='Galaxy' ----- to find the galaxy in 7o rows
    //img[@alt='edit']------- to find the image edit
    //so ...//tr[td[text()='Galaxy'//img[@alt='edit'] ---- will be the xpath
    //ro ...//tr[td[text()='Galaxy'/td/a/img[@alt='edit']
    public class xpath5 {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("http://openclinic.sourceforge.net/openclinic/admin/staff_list.php");
            driver.findElement(By.xpath("//tr[td[text()='Galaxy']]//img[@alt='edit']")).click();
        }
}

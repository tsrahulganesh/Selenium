package Seleniumbasic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.opera.OperaDriver;


public class seleniumbasic {


    public static void main(String[] args) {
        //  System.out.println("Helloworld");
         //class -System.staticmethod-setproperty("key" &"value")
        System.setProperty("webdriver.chrome.driver","C:/Selenium Installers/Selenium/Drivers/chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("http://naukri.com");

               //driver.quit();
        if(driver.getTitle().equals("Google"))
        {
            System.out.println("This is Naukri");
        }
        else
        {
            System.out.println("This is Google page");
        }
        //System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.manage().window().maximize();

        /*note:
        GetCurrenturl gets the url given above like this "http://naukri.com"
        Getpagesource gives you the html of that url page*/

        // firefox
        /* System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); // upcasting*/
         /* System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
*/










    }
}



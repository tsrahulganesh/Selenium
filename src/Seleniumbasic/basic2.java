package Seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Path:
//C:\Selenium Installers\Selenium\Drivers\chromedriver.exe
public class basic2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installers\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com/");
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}

/*note:
navigate().to() and get() will work same when you use for the first time.
When you use it more than once then using navigate().to() you can come to
the previous page at any time whereas you can do the same using get().

Conclusion:
navigate().to() holds the entire history of the current window and
get() just reload the page and hold any history.
 */


    package Seleniumbasic;
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.edge.EdgeDriver;
    
    public class Drivermanager {
        public static void main(String[] args) {

            WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.driver","C:\\Selenium Installers\\Selenium\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("http://naukri.com");
            driver.manage().window().maximize();
            //System.setProperty("webdriver.edge.driver","C:\\Selenium Installers\\Selenium\\Drivers\\msedgedriver.exe");
            WebDriverManager.edgedriver().setup();
            WebDriver driver1 = new EdgeDriver();
            driver1.get("https://outlook.live.com/mail/0/inbox");
            driver1.manage().window().maximize();

            //WebDriverManager.operadriver().setup();
            //WebDriver driver = new OperaDriver();


            //WebDriverManager.firefoxdriver().setup();
            //WebDriver driver = new FirefoxDriver();


        }
    }
    /*Note:
        enium WebDriver is an automation tool widely popular and is useful to run tests against multiple browsers like Google Chrome browser, Firefox Browser, Internet Explorer, etc.
        This type of testing done on different browsers is usually known as Cross-Browser Testing. So if we want to launch any of these browsers' drivers for testing,
        we have to set the corresponding executable path explicitly. After that, we instantiate the appropriate driver instance and go ahead with the code we want to execute.
        These steps become cumbersome as we need to carry them out every time the versions change. Hence we use the "WebDriverManager" class in Selenium.*/


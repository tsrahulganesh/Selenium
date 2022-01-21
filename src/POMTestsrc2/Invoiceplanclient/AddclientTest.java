package POMTestsrc2.Invoiceplanclient;

import POMmaster.src.pages.Login;
import POMmaster.src.pages.Menu;
import POMmaster.src.pages.addClient.AddClient;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static POMmaster.src.util.ConfigReader.*;

public class AddclientTest {
    WebDriver driver;

    @BeforeClass
    public void doLogin() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());

        Login login = new Login(driver);

        login.setTxtUsername(getUsername());
        login.setTxtPassword(getPassword());
        login.clickLogin();
    }

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setClientName("Gany5");
        addClient.setClientSurname("More");
        addClient.setLanguage("Spanish");
        addClient.setClientAdd1("xyz");
        addClient.setClientAdd2("pqr");
        addClient.setClientCity("Pune");
        addClient.setClientState("MH");
        addClient.setClientZip("898988");
        addClient.setCountry("Hungary");
        addClient.setGender("Female");
        addClient.setBirthDate("12/17/1984");
        addClient.setClientPhone("898998");
        addClient.setClientMobile("89898");
        addClient.setClientFax("8989");
        addClient.setClientEmail("a@b.com");
        addClient.setClientWeb("www.xyz.com");
        addClient.setClientVat("767676");
        addClient.setClientTax("6767");

        addClient.clickSave();

    }


}

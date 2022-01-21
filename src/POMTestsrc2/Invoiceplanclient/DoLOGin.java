package POMTestsrc2.Invoiceplanclient;

import POMpages.client.Login;
import Utility.Openurl2;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class DoLOGin extends Openurl2 {

    @BeforeClass
    public void dologin() throws IOException {
        Login login = new Login(driver);

        login.setUsername(getUsername());
        login.setPassword(getPassword());
        login.clickLogin();

    }

}

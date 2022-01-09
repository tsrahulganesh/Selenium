package Invoiceplanclient;

import POMpages.client.Login;
import Utility.OpenUrl3;
import Utility.Openurl2;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.BeforeClass;
import Utility.ConfigReader;

import java.io.IOException;

import static Utility.ConfigReader.getPassword;
import static Utility.ConfigReader.getUsername;

public class DoLOGin extends Openurl2 {

    @BeforeClass
    public void dologin() throws IOException {
        Login login = new Login(driver);

        login.setUsername(getUsername());
        login.setPassword(getPassword());
        login.clickLogin();

    }

}

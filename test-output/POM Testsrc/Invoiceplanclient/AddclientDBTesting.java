package Invoiceplanclient;  ;

import POMpages.client.Addclient;
import POMpages.client.Login;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import POMmaster.src.pages.Menu;
import POMmaster.src.pages.addClient.AddClient;
import POMmaster.testsrc.util.DoLogin;

import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;

import static POMmaster.src.util.Conversion.*;
import static POMmaster.src.util.MyDataProvider.getMyData;

public class AddclientDBTesting extends DoLOGin {

    @Test (dataProvider = "getData")
    public void addClientTest(String name,String surname,String language,String add1,
                              String add2,String city,String state,String zip,String country,
                              String gender,String birthdate,String phone,String mobile,
                              String fax,String email,String web,String vat,String tax) throws ClassNotFoundException, SQLException, ParseException {
        ArrayList<String> expected = new ArrayList<>();

        expected.add(name);
        expected.add(surname);
        expected.add(language.toLowerCase());
        expected.add(add1);
        expected.add(add2);
        expected.add(city);
        expected.add(state);
        expected.add(zip);
        expected.add(country);
        expected.add(gender);
        expected.add(birthdate);
        expected.add(phone);
        expected.add(mobile);
        expected.add(fax);
        expected.add(email);
        expected.add(web);
        expected.add(vat);
        expected.add(tax);

        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setClientName(name);
        addClient.setClientSurname(surname);
        addClient.setLanguage(language);
        addClient.setClientAdd1(add1);
        addClient.setClientAdd2(add2);
        addClient.setClientCity(city);
        addClient.setClientState(state);
        addClient.setClientZip(zip);
        addClient.setCountry(country);
        addClient.setGender(gender);
        addClient.setBirthDate(birthdate);
        addClient.setClientPhone(phone);
        addClient.setClientMobile(mobile);
        addClient.setClientFax(fax);
        addClient.setClientEmail(email);
        addClient.setClientWeb(web);
        addClient.setClientVat(vat);
        addClient.setClientTax(tax);

        addClient.clickSave();

        Class.forName("com.mysql.cj.jdbc.Driver");

        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/ip8am2";

        Connection con = DriverManager.getConnection(url,user,pass);

        Statement st = con.createStatement();

        String sql = "SELECT * FROM ip_clients where client_name='"+name+"'";

        ResultSet rs = st.executeQuery(sql);

        ArrayList<String> actual = new ArrayList<>();

        while (rs.next())
        {
            actual.add(rs.getString("client_name"));
            actual.add(rs.getString("client_surname"));
            actual.add(rs.getString("client_language"));
            actual.add(rs.getString("client_address_1"));
            actual.add(rs.getString("client_address_2"));
            actual.add(rs.getString("client_city"));
            actual.add(rs.getString("client_state"));
            actual.add(rs.getString("client_zip"));

            actual.add(convertCountry(rs.getString("client_country")));


            actual.add(genderConversion(rs.getString("client_gender")));

            actual.add(convertDate(rs.getString("client_birthdate")));


            actual.add(rs.getString("client_phone"));
            actual.add(rs.getString("client_mobile"));
            actual.add(rs.getString("client_fax"));
            actual.add(rs.getString("client_email"));
            actual.add(rs.getString("client_web"));
            actual.add(rs.getString("client_vat_id"));
            actual.add(rs.getString("client_tax_code"));

        }

        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return getMyData("src/POMmaster/Data/myData.xlsx","db testing");
    }


}

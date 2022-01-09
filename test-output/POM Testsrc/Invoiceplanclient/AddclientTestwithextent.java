/*package Invoiceplanclient;
import POMpages.client.Addclient;
import POMpages.client.Login;
import POMpages.client.Menu;
import Utility.DoLogin;
import Utility.Driver;
import Utility.initExtentReport;

import com.aventstack.extentreports.ExtentReports;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ResourceBundle;

import static Utility.Takeshotscreen.takeScreenshot;

public class AddclientTest extends DoLogin {
   // WebDriver driver = Driver.getDriver(Driver.DriverTypes.CHROME);

   // ExtentReports extent;

   /* @BeforeMethod
    public void login() {

        extent = initExtentReport.init();
        ResourceBundle rb = ResourceBundle.getBundle("InvoicePlane");

        driver.get("http://billing.scriptinglogic.net");


        Login login = new Login(driver);
        login.setUsername("amolujagare@gmail.com");
        login.setPassword("admin123");
        login.clickLogin();
    }

   // @Test(dataProvider = "getData")
  //  public void addclienttest(String clientname, String Steetaddress1, String Steetaddress2, String city, String state, String zipcode,String country,
                           //   String phonenumber, String faxnumber, String mobilenumber, String emailaddress, String webaddress, String vatid, String taxcode) throws IOException, SQLException, ClassNotFoundException {

        ExtentReports extent = new ExtentReports("Extent-Report/report.html", true, NetworkMode.OFFLINE);
        ExtentTest test = extent.startTest("Add client Test", "Add client test for enter input");// for extent report
//@Test
      public void addclientTest()
{
        Menu menu = new Menu(Driver);

        menu.clickAddclient();

        //ExtentReports extent = new ExtentReports("Extent-Report/report.html", true, NetworkMode.OFFLINE);// for extent report


     Addclient addclient = new Addclient(Driver);

        addclient.setclientname(clientname);
       // test.log(LogStatus.INFO, "client name is Enter as "+clientname); //log for extent report
       addclient.setsurname(surname);
        addclient.setstreetaddress1(Steetaddress1);
       // test.log(LogStatus.INFO, "Street address is Enter as" + Steetaddress1);
        addclient.setstreetaddress2(Steetaddress2);
       // test.log(LogStatus.INFO, "Street address 2 is Enter as " + Steetaddress2);
        addclient.setcity(city);
       // test.log(LogStatus.INFO, "City is Enter as " + city);
        addclient.setstate(state);
       // test.log(LogStatus.INFO, "state is Enter as " + state);
        addclient.setzipcode(zipcode);
       // test.log(LogStatus.INFO, "Zipcode is Enter as " + zipcode);
        addclient.setcountry(country);
        //test.log(LogStatus.INFO,"country is Enter as "+country);
        addclient.setphonenumber(phonenumber);
       // test.log(LogStatus.INFO, "Phonenumber is Enter as "+phonenumber);

        addclient.setfaxnumber(faxnumber);
       // test.log(LogStatus.INFO, "Faxnumber is Enter as "+faxnumber);

        addclient.setmobilenumber(mobilenumber);
       // test.log(LogStatus.INFO, "mobilenumber is Enter as "+mobilenumber);
        addclient.setemailaddress(emailaddress);
      //  test.log(LogStatus.INFO, "emailaddress is Enter as "+emailaddress);
        addclient.setwebaddress(webaddress);
       // test.log(LogStatus.INFO, "webaddress is Enter as "+webaddress);

        addclient.setvatid(vatid);
      //  test.log(LogStatus.INFO, "vatid is Enter as "+vatid);
        addclient.settaxcode(taxcode);
      //  test.log(LogStatus.INFO, "taxcode is Enter as "+taxcode);
        addclient.setBtnsave();
      //  test.log(LogStatus.INFO, "save is clicked");

       // test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./screenshots/" + takeScreenshot(driver)));//log for snapshot

       // extent.endTest(test);
       // extent.flush();

    }

    @DataProvider

    public String[][] getData() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("Data/Pomdatasheet.xls");//copy path of Exelsheet here

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream); //create object for workbook

        HSSFSheet worksheet = workbook.getSheet("Sheet1"); // get the proper sheet from exel

        int rowcount = worksheet.getPhysicalNumberOfRows();

        String[][] data = new String[rowcount - 1][14];
        for (int i = 1; i < rowcount; i++) {
            HSSFRow row = worksheet.getRow(i);

            HSSFCell clientname = row.getCell(0);

            if (clientname == null)
                data[i - 1][0] = "";
            else {
                clientname.setCellType(CellType.STRING);// to convert numbers into string we use setCell type
                data[i - 1][0] = clientname.getStringCellValue();
            }

            HSSFCell address1 = row.getCell(1);//for get cell
            if (address1 == null)
                data[i - 1][1] = "";
            else {
                address1.setCellType(CellType.STRING);

                data[i - 1][1] = address1.getStringCellValue();
            }

            HSSFCell address2 = row.getCell(2);
            if (address2 == null)
                data[i - 1][2] = "";
            else {
                address2.setCellType(CellType.STRING);
                data[i - 1][2] = address2.getStringCellValue();
            }

            HSSFCell city = row.getCell(3);
            if (city == null)
                data[i - 1][3] = "";
            else {
                city.setCellType(CellType.STRING);
                data[i - 1][3] = city.getStringCellValue();
            }

            HSSFCell state = row.getCell(4);
            if (state == null)
                data[i - 1][4] = "";
            else {
                state.setCellType(CellType.STRING);
                data[i - 1][4] = state.getStringCellValue();
            }


            HSSFCell zipcode = row.getCell(5);
            if (zipcode == null)
                data[i - 1][5] = "";
            else {
                zipcode.setCellType(CellType.STRING);
                data[i - 1][5] = zipcode.getStringCellValue();
            }

            HSSFCell county = row.getCell(6);
            if (county == null)
                data[i - 1][6] = "";
            else {
                county.setCellType(CellType.STRING);
                data[i - 1][6] = county.getStringCellValue();
            }

            HSSFCell phonenumber = row.getCell(7);
            if (phonenumber == null)
                data[i - 1][7] = "";
            else {
                phonenumber.setCellType(CellType.STRING);
                data[i - 1][7] = phonenumber.getStringCellValue();
            }

            HSSFCell faxno = row.getCell(8);
            if (faxno == null)
                data[i - 1][8] = "";
            else {
                faxno.setCellType(CellType.STRING);
                data[i - 1][8] = faxno.getStringCellValue();
            }

            HSSFCell mobno = row.getCell(9);
            if (mobno == null)
                data[i - 1][9] = "";
            else {
                mobno.setCellType(CellType.STRING);
                data[i - 1][9] = mobno.getStringCellValue();
            }


            HSSFCell emailadd = row.getCell(10);
            if (emailadd == null)
                data[i - 1][10] = "";
            else {
                emailadd.setCellType(CellType.STRING);
                data[i - 1][10] = emailadd.getStringCellValue();
            }

            HSSFCell webaddress = row.getCell(11);
            if (webaddress == null)
                data[i - 1][11] = "";
            else {
                webaddress.setCellType(CellType.STRING);
                data[i - 1][11] = webaddress.getStringCellValue();
            }

            HSSFCell vatid = row.getCell(12);
            if (vatid == null)
                data[i - 1][12] = "";
            else {
                vatid.setCellType(CellType.STRING);
                data[i - 1][12] = vatid.getStringCellValue();
            }

            HSSFCell taxcode = row.getCell(13);
            if (taxcode == null)
                data[i - 1][13] = "";
            else {
                taxcode.setCellType(CellType.STRING);
                data[i - 1][13] = taxcode.getStringCellValue();
            }


        }

        return data;
    }
}*/




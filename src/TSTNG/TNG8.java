package TSTNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNG8 {


        @BeforeSuite
        public void classThreeTest1(){
            System.out.println("Before my suite");
        }
        @BeforeSuite
        public void anotherBeforeSuite(){
            System.out.println("another before suite");
        }

        @Parameters({"myurl","username","password"})
        @AfterSuite
        public void classThreeTest3(String url,String user,String pass)
        {
            System.out.println("After my suite");
            System.out.println("url="+url);
            System.out.println("user="+user);
            System.out.println("pass="+pass);

        }
    }




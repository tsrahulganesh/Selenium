package TSTNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
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
        @AfterSuite
        public void classThreeTest3(){
            System.out.println("After my suite");
        }
    }




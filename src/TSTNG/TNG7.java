package TSTNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNG7 {


        @BeforeTest
        public void classTwoTest1(){
            System.out.println("Before my Test");
        }
        @AfterTest
        public void classTwoTest2(){
            System.out.println("After my test 2");
        }
        @AfterTest
        public void classTwoTest3(){
            System.out.println("After my Test");
        }
    }


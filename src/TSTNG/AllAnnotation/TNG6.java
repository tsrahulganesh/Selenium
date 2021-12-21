package TSTNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNG6 {

    @Test
    public void classoneTest1(){
        System.out.println("classoneTest1");
    }
    @Test(groups ="email")
    public void classoneTest2(){
        System.out.println("classonetest2");
    }

    @Parameters ({"myurl","username","password"})
    @Test
    public void classoneTest3(String url,String user,String pass){
        System.out.println("classonetest3");
        System.out.println("url="+url);
        System.out.println("user="+user);
        System.out.println("pass="+pass);
    }
}

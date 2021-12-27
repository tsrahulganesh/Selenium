package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    public static void main(String[] args) throws IOException {
        //how to retrive the text file from config file
        //here we can retrive in 4 steps

        //step 1. read the file
        FileInputStream fis = new FileInputStream("Config/Config.prop");
        //step 2. create the object of properties class
        Properties prop = new Properties();

        //step 3. load this properties object with file object
        prop.load(fis);

        //step 4. read the value of the key
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));
    }
}





package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties getLoadedPropertiesObject() throws IOException {
        //step 1. read the file
        FileInputStream fis = new FileInputStream("Config/Config.prop");
        //step 2. create the object of properties class
        Properties prop = new Properties();

        //step 3. load this properties object with file object
        prop.load(fis);

        return prop;
    }
    public static String getUrl() throws IOException {
        return getLoadedPropertiesObject().getProperty("url");
    }

    public static String getUsername() throws IOException {
        return getLoadedPropertiesObject().getProperty("username");
    }

    public static String getPassword() throws IOException {
        return getLoadedPropertiesObject().getProperty("password");
    }
}
package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {

    public static String getBrowserName() throws IOException {
        Properties config = new Properties();
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\ConfigFiles\\config.properties");
        config.load(file);
        return config.getProperty("browser");
    }
}

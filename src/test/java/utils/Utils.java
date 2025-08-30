package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {
    private static Properties prop;
    public static String getConfig(String key) throws IOException {
        try {
            File file = new File("src/test/resources/configs/config.properties");
            FileInputStream fis=  new FileInputStream(file);
            Properties prop = new Properties();
            prop.load(fis);
        }catch (Exception e){
            e.printStackTrace();
        }
        return prop.get(key).toString();
    }
}

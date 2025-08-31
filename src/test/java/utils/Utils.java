package utils;

import driver.DriverRepo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Utils {

    public static String getConfig(String key) throws IOException {
        Properties prop=null;
        try {
            File file = new File("src/test/resources/configs/config.properties");
            FileInputStream fis=  new FileInputStream(file);
            prop = new Properties();
            prop.load(fis);
        }catch (Exception e){
            e.printStackTrace();
        }
        return prop.get(key).toString();
    }
    public void waitFor(WebElement element){
        WebDriverWait wait=new WebDriverWait(DriverRepo.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}

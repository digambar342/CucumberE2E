package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverRepo {
    private static WebDriver driver;
    private static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
    private DriverRepo(){
    }
    public static void setDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
            tlDriver.set(driver);
        }else if(browser.equalsIgnoreCase("edge")){
            driver=new EdgeDriver();
            tlDriver.set(driver);
        }

    }
    public static WebDriver getDriver(){
        return tlDriver.get();
    }
    public static void removeDriver(){
        if(driver!=null){
            tlDriver.remove();
        }
    }
}

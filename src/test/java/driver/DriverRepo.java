package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class DriverRepo {
    private static WebDriver driver;
    private static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
    private DriverRepo(){
    }
    public static void setDriver(String browser) throws MalformedURLException {
        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            Map<String,Object> prefs= new HashMap<String,Object>();
            prefs.put("profile.password_manager_leak_detection", false);
            options.setExperimentalOption("prefs",prefs);
            options.addArguments("--headless=new", "--no-sandbox", "--disable-dev-shm-usage");
            //driver=new ChromeDriver(options);
            driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
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
        if(tlDriver.get()!=null){
            tlDriver.get().quit();
            tlDriver.remove();
        }
    }
}

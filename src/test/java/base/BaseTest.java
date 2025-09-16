package base;

import driver.DriverRepo;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import utils.ConfigReader;
import utils.Utils;
import io.cucumber.java.Before;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {


    public static void setUp() throws IOException {
        System.out.println("inside hook before");
        DriverRepo.setDriver(ConfigReader.getBrowserName());
        DriverRepo.getDriver().get(ConfigReader.getBaseUrl());
        DriverRepo.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        DriverRepo.getDriver().manage().window().maximize();
    }

    public static void tearDown(){
       DriverRepo.removeDriver();
    }

    @After
    public void takeSS(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println("inside failed hook");
            byte[] screenshot= ((TakesScreenshot)DriverRepo.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Failed scenario ss");
        }
    }
}

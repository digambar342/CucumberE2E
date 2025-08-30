package base;

import driver.DriverRepo;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.Utils;
import io.cucumber.java.Before;


import java.io.IOException;

public class BaseTest {

    @Before
    public void setUp() throws IOException {
        DriverRepo.setDriver(ConfigReader.getBrowserName());
        DriverRepo.getDriver().get(ConfigReader.getBaseUrl());
        DriverRepo.getDriver().manage().window().maximize();
    }
    @After
    public void tearDown(){
        DriverRepo.removeDriver();
    }
}

package runner;

import base.BaseTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/sauceDemo2.feature",
        glue = {"stepDefinations","base"},
        plugin = {"pretty", "html:target/cucumber-html-report2.html"},
        monochrome = true
)
public class TestRunner2 extends AbstractTestNGCucumberTests {
    @BeforeClass
    public static void setUp() throws IOException {
        BaseTest.setUp();
    }
    @AfterClass
    public static void tearDown(){
        BaseTest.tearDown();
    }
}

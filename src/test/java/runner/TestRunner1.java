package runner;

import base.BaseTest;
import io.cucumber.core.options.RuntimeOptions;
import io.cucumber.core.options.RuntimeOptionsBuilder;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.List;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.TestNGCucumberRunner;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.FeatureWrapper;

import io.cucumber.core.options.RuntimeOptions;
import io.cucumber.core.options.RuntimeOptionsBuilder;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.List;


@CucumberOptions(
        features = "src/test/resources/features/sauceDemo1.feature",
        glue = {"stepDefinations","base"},
        plugin = {"pretty", "html:target/cucumber-html-report1.html"},
        monochrome = true
)
public class TestRunner1 extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void setUp() throws IOException {
        BaseTest.setUp();
    }
    @AfterClass
    public static void tearDown(){
        BaseTest.tearDown();
    }
}

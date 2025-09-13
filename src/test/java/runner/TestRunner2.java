package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/sauceDemo2.feature",
        glue = {"stepDefinations","base"},
        plugin = {"pretty", "html:target/cucumber-html-report.html"},
        monochrome = true
)
public class TestRunner2 extends AbstractTestNGCucumberTests {
}

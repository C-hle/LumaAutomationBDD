package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = {"stepDefinition"},
        plugin = {"com.avantstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class LumaAutomation extends AbstractTestNGCucumberTests {
}

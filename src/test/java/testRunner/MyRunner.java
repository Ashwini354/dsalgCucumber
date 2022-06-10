package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features =
		"classpath:/Features" , glue = {
				"stepDefinitions", "base" }, monochrome = true, plugin = {
						"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

}

)

public class MyRunner {

}
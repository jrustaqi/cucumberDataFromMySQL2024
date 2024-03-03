package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",	//package name, this way it works for all feature file we have inside package
		glue = "steps",						//package name, where we have our stepDefination class
		tags = "@Regression1",				//will run the scenario (s) based on our tag name
		monochrome = true,					//if FALSE will not print readable and pretty in console
		dryRun = false,						//if TRUE then will not execute the steps, will check for initialization errors
		plugin = {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
		}
		)
		
public class AddCustomerRunner {

}

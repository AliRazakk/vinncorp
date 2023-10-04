package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)				
@CucumberOptions(features="src/test/java/FEATURE/index.feature",
glue="StepDefinition",
dryRun = false,
monochrome = true,
//plugin = {"pretty" , "html: test-output"},
plugin = {"pretty", "json:target/cucumber-reports/cucumber.json",
		"html:target/cucumber-reports/cucumber.html"}
		)
public class Runner {

}

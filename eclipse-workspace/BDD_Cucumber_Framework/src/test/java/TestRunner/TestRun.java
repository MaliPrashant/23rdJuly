package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//feature/LoginFeature.feature",
		glue = "StepDefinition",
		dryRun = true,
		monochrome = true,
		plugin = {"pretty"}
		)


public class TestRun {
// This class will be empty
}

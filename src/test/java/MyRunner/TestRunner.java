package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:/QA/SeleniumWorkSpace/MyBDDFrameWork/src/test/java/Features",
		glue={"stepDefinations"},
		plugin = {"pretty",
				"html:test-output/index.html",
				"html:target/cucumber/cucumber-pretty",
                "json:target/cucumber/cucumber.json",
                "rerun:target/cucumber/rerun.txt"},      
		monochrome = true, //display the console output in a proper readable format
		dryRun = false//to check the mapping is proper between feature file and step def file
//		tags= "@RegressionTest or @SmokeTest"
		)

public class TestRunner {

}

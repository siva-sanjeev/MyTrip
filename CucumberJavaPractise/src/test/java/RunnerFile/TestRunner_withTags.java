package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinitions"}, monochrome = true,
		   tags = "@@validRun"
		)
public class TestRunner_withTags {
	
	
	/**Tags 
	@smoke and @Regression
	@smoke or @Regression
	@smoke and not @Regression  
		**/

}

package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


/**
 * 
 * plugin = {"pretty", "html:target/reports"}  //Target is a folder name and we can create a folder under tat target folder
 * plugin = {"pretty", "json:target/reports/cucumber.json"}
 * plugin = {"pretty", "junit:target/reports/cucumber.xml"}
 * 
 * monochrome is by default false. It helps to view the output in colsole easily
 * 
 * @tags like @Smoke --> Features contains same tags will get executed
 * 
 * @Siva Sanjeev - Zapcom
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinitions"}, monochrome = true,
  plugin = {"pretty","json:target/JSONreports/report.json",
		  "html:target/HTMLreports/reports", 
		  "junit:target/JunitReports/report.xml"}
		)
public class TestRunner {
	
	
	
}

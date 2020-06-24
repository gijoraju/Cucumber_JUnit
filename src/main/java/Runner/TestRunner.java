package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="C:\\Users\\user\\eclipse-workspace\\CucumberFramework\\src\\main\\java\\Features\\deal.feature"
		,glue={"StepDefinitions"}
		//,glue="C:\\Users\\user\\eclipse-workspace\\CucumberFramework\\src\\main\\java\\StepDefinitions\\DealCreateStepDefinition.java"
		,format= {"pretty","html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
		//,strict=true
		,monochrome=true
		,dryRun=false

)


public class TestRunner {
	
	
	
	
	
	

}

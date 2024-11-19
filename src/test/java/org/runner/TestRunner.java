package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import report.ReportingClass;

@RunWith(Cucumber.class)
@CucumberOptions 
(features = {"C:\\Users\\91737\\eclipse-workspace\\cuc\\src\\test\\resources\\Feature.feature"}, 
glue ={"org.stepdef","report"}, monochrome=true, dryRun= false, publish=true, 
plugin= {"pretty","html:target/cucumber-report/report.html", 
		"json:target/cucumber-report/report2.json",
		"junit:target/cucumber-report/report1.xml"})
public class TestRunner {
	
	@AfterClass
	public static void afterclass () {
	ReportingClass.generateJVMReport("json pathrame.json");
	}

}

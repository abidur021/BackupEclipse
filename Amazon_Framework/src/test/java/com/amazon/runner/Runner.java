package com.amazon.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features ="./Feature",
		glue ="com.amazon.stepdefination",
		plugin ={"pretty","json:target/cucumber.json" },
		dryRun = false,
		monochrome =true,
		tags ="@Smoke"
	
		)

public class Runner extends AbstractTestNGCucumberTests {
}

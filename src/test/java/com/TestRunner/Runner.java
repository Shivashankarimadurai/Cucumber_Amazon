package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src\\test\\java\\com\\feature\\Facebook.feature",
		glue = "com.StefDef",
		plugin = {
				"html:HTMLReports/Facebook.html",
//				"pretty",
				"json:JsonReports/FacebookJs.json"
		}
				
		)
			
public class Runner {
	
}

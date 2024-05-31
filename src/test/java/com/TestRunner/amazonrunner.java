package com.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src\\test\\java\\com\\feature\\amazon.feature",
		glue ="com.StefDef" ,
		dryRun = false,
		plugin = {
				"html:HTMLReports/reports.html",
				"pretty",
				"json:JsonReports/amazonjs.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
			
		)
	
public class amazonrunner extends BaseClass{
	@BeforeClass
	public static void StartSession() {
		launchBrowser("chrome");
	}
	
	@AfterClass
	public static void EndSessionn() {
		terminateBrowser();
	}
}



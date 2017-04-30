package framework;

import java.io.File;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(glue = {"smokeTest",}, 
features = "src/test/java/",
//format = { "html:target/cucumber-htmlreport", "json:target/cucumber-report.json" }, 
plugin = { "html:target/cucumber-htmlreport", "json:target/cucumber-report.json","com.cucumber.listener.ExtentCucumberFormatter" },
tags = { ""}, monochrome = true)
public class FrameworkRunner extends AbstractTestNGCucumberTests{
	
	@BeforeClass
	public static void setup(){
		
		ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		
		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));
		
	}

}

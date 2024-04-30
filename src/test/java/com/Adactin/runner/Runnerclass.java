
package com.Adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)//we want run with j-unit,so we are adding runwith annotation
@CucumberOptions(features="src//test//java//com//Adactin//feature",
glue="com.Adactin.StepDefinition",
monochrome=true,
dryRun=false,
strict=true,
tags="@smokeTest",
plugin={"html:Reports/Html_Report",
		"pretty",
		"json:Reports/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"
})
//path of cucumber option that is it is in *src.test.java  and runner class in com.adactin.feature
//We are using glue for Step definition
public class Runnerclass {

	
	public static WebDriver driver; //driver is holding null value
	
	@BeforeClass
	public static void Setup() //open the browser
	{
		WebDriverManager.chromedriver().setup();//for system.setproperty
		driver=new ChromeDriver();    //driver is holding chromedriver value
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		}
	
	@AfterClass
	public static void tearDown() //close the browser
	{
		driver.close();

	}
}

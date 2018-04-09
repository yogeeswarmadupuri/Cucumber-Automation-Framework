package testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import configreader.ConfigFileReader;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\yogeeswar\\workspace\\CucumberAutomation\\src\\main\\java\\featurefiles\\dealsmap.feature", //the path of the feature files
			glue={"stepDefinitions"}, //the path of the step definition files
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			plugin = { "com.cucumber.listener.ExtentCucumberFormatter:"},
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
	 
	public class TestRunner {
		@Before
		public void beforeScenario() {
//			ConfigFileReader configFileReader = new ConfigFileReader();
//			String date = configFileReader.dategenerator();
//			date = date.replace("/", "").replace(":", "");
//			System.out.println(date);
			
			
		}
		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File(new ConfigFileReader().getReportConfigPath()));
			Reporter.assignAuthor("Yogeeswar Madupuri");
			Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		    Reporter.setSystemInfo("Selenium", "3.7.0");
		    Reporter.setSystemInfo("Maven", "3.5.2");
		    Reporter.setSystemInfo("Java Version", "1.8.0_151");
		}
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	


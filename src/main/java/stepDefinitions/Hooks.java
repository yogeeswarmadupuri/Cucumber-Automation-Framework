package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.cucumber.listener.Reporter;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils; // Needs commons-io dependency

public class Hooks {

    @Before(order = 0) 
    public void setUp() {
        WebDriverFactory.initializeDriver();
    }
	
	@Before(order = 1) 
	public void beforeScenario(Scenario scenario) {
	    Reporter.assignAuthor("Yogeeswar Madupuri"); // Existing author assignment
	}
	
    // This new @After hook should run before the driver quit hook
    @After(order = 1) // Higher order means it runs earlier for @After hooks
    public void embedScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                WebDriver driver = WebDriverFactory.getDriver();
                if (driver != null && driver instanceof TakesScreenshot) { // Check if driver is not null
                    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                    // Define a path to save the screenshot, e.g., target/screenshots
                    File destinationFolder = new File("target/screenshots");
                    if (!destinationFolder.exists()) {
                        destinationFolder.mkdirs(); // Create folder if it doesn't exist
                    }
                    File destinationFile = new File(destinationFolder, scenario.getName().replaceAll("[^a-zA-Z0-9]", "_") + "_" + System.currentTimeMillis() + ".png");
                    FileUtils.copyFile(screenshotFile, destinationFile); 
                    Reporter.addScreenCaptureFromPath(destinationFile.getAbsolutePath(), "Screenshot on failure");
                }
            } catch (IOException e) {
                System.err.println("Failed to save screenshot: " + e.getMessage());
                e.printStackTrace();
            } catch (Exception e) { 
                System.err.println("An error occurred during screenshot capture: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
	
	@After(order = 0) // This will run last among @After hooks
	public void tearDown() {
		WebDriverFactory.quitDriver();
	}
}

package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import configreader.ConfigFileReader;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    public static WebDriver driver;
    private static ConfigFileReader configFileReader;

    public static WebDriver initializeDriver() {
        configFileReader = new ConfigFileReader();
        String browserName = configFileReader.getBrowser().toLowerCase();

        switch (browserName) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            // Add other browsers as needed, e.g., edge, ie
            default:
                throw new RuntimeException("Unsupported browser: " + browserName + ". Please check config.properties.");
        }
        
        long timeout = configFileReader.getDefaultTimeout();
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        return driver;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            initializeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Reset driver after quitting
        }
    }
}

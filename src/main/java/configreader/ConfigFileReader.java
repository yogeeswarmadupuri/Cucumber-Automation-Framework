package configreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class ConfigFileReader {
    private Properties properties;
    private final String configFilePath = "config.properties";

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(configFilePath);
            properties = new Properties();
            if (inputStream != null) {
                properties.load(inputStream);
                inputStream.close();
            } else {
                throw new RuntimeException("Configuration file not found at " + configFilePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error loading configuration file: " + e.getMessage());
        }
    }

    public String getBrowser() {
        String browser = properties.getProperty("browser");
        if (browser != null) return browser;
        else throw new RuntimeException("browser not specified in the config.properties file.");
    }

    public String getBaseUrl() {
        String baseUrl = properties.getProperty("baseUrl");
        if (baseUrl != null) return baseUrl;
        else throw new RuntimeException("baseUrl not specified in the config.properties file.");
    }

    public long getDefaultTimeout() {
        String defaultTimeout = properties.getProperty("defaultTimeout");
        if (defaultTimeout != null) {
            try {
                return Long.parseLong(defaultTimeout);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Invalid format for defaultTimeout in config.properties file.");
            }
        } else {
            throw new RuntimeException("defaultTimeout not specified in the config.properties file.");
        }
    }

    public String getExtentReportPath() {
        String extentReportPath = properties.getProperty("extentReportPath");
        if (extentReportPath != null) return extentReportPath;
        else throw new RuntimeException("extentReportPath not specified in the config.properties file.");
    }

    public String getExtentConfigPath() {
        String extentConfigPath = properties.getProperty("extentConfigPath");
        if (extentConfigPath != null) return extentConfigPath;
        else throw new RuntimeException("extentConfigPath not specified in the config.properties file.");
    }

    // Updated getReportConfigPath to use the new property
    public String getReportConfigPath() {
        return getExtentConfigPath();
    }

    public String dategenerator() {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
        Date date = new Date();
        return simpledateformat.format(date);
    }
}

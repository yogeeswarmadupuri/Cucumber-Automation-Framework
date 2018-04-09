package configreader;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConfigFileReader {
	public String getReportConfigPath(){
		String reportConfigPath="C:\\Users\\yogeeswar\\workspace\\CucumberAutomation\\Config\\extent-config.xml";
		return reportConfigPath;		
	}
	public  String dategenerator()
	{
		SimpleDateFormat simpledateformat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
        Date date = new Date();
        return simpledateformat.format(date);
	}
}

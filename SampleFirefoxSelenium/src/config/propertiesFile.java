package config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


public class propertiesFile {

	static Properties prop = new Properties();
	
	public String readProperties(String strProperty) {
		try {
			
			InputStream file = new FileInputStream("/Users/macbook/git/Project25July/SampleFirefoxSelenium/src/config/config.properties");
			prop.load(file);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(strProperty); 
	}
	
	public static void writeProperties() {
		
	}
	
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/macbook/eclipse-workspace/SampleFirefoxSelenium/lib/geckodriver/geckodriver");

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		
		try {
			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			Thread.sleep(1800);
			driver.quit();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
	}

}

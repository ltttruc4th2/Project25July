import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserInfo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"/Users/macbook/git/Project25July/SampleFirefoxSelenium/lib/geckodriver/geckodriver");

		try {

			WebDriver driver = new FirefoxDriver();

			Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();

			// get browser name and browser version
			String browserName = caps.getBrowserName();
			String browserVerson = caps.getVersion();
			System.out.println(browserName + " " + browserVerson);

			// go to http://wikipedia.org
			driver.get("http://wikipedia.org/");

			// go to bottom of the page
			// Using Javascript
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("scrollBy(0,2500)");

			Thread.sleep(1000);

			// exit browser and close it
			driver.quit();

		} catch (Exception e) {
			// print out the exception if it occurs
			System.out.println(e);
		}
	}

}

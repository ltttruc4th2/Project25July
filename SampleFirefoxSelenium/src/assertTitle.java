import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.io.*;
import org.apache.commons.io.FileUtils;

public class assertTitle {

	public static void main(String[] args) {

		// String driverPath = System.getProperty("usr.dir");
		System.setProperty("webdriver.gecko.driver",
				"/Users/macbook/git/Project25July/SampleFirefoxSelenium/lib/gecko/geckodriver");
		WebDriver driver = new FirefoxDriver();

		try {

			// System.setProperty("webdriver.gecko.driver",
			// "/Users/macbook/git/Project25July/SampleFirefoxSelenium/lib/geckodriver/geckodriver");

			driver.get("https://google.com");

			String title = driver.getTitle();
			System.out.println("Page title: " + title);

			Assert.assertTrue(title.contains("Google"));

			// capture picture
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scrFile,
					new File("/Users/macbook/git/Project25July/SampleFirefoxSelenium/output/o1.png"));

			Thread.sleep(1500);
			driver.quit();

		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}

	}

}

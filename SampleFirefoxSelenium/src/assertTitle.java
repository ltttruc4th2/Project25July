import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class assertTitle {

	public static void main(String[] args) {

		String driverPath = System.getProperty("usr.dir");
		System.setProperty("webdriver.gecko.driver", driverPath + "/lib/gecko/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		try {

			
			
			//System.setProperty("webdriver.gecko.driver", "/Users/macbook/git/Project25July/SampleFirefoxSelenium/lib/geckodriver/geckodriver");
			
			
			driver.get("https://google.com");
			
			String title = driver.getTitle();
			System.out.println("Page title: " + title);
			
			Assert.assertTrue(title.contains("Google"));
			
			Thread.sleep(1500);
			
			driver.quit();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	
		
	}

}

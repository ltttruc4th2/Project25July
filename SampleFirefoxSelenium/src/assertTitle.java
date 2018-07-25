import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class assertTitle {

	public static void main(String[] args) {

		//String driverPath = System.getProperty("usr.dir");
		
		
		try {

			
			WebDriver driver = new FirefoxDriver();
			//System.setProperty("webdriver.gecko.driver", "/Users/macbook/git/Project25July/SampleFirefoxSelenium/lib/geckodriver/geckodriver");
			System.setProperty("webdriver.gecko.driver", "/Users/macbook/git/Project25July/SampleFirefoxSelenium/lib/geckodriver/geckodriver");
			
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

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/macbook/git/Project25July/SampleFirefoxSelenium/lib/geckodriver/geckodriver");

		
		WebDriver driver = new FirefoxDriver();
		
		try {
			
			
			
			
			//Always maximize the browser window
			driver.manage().window().maximize();
			
			//Go to seleniumhq page
			driver.get("http://seleniumhq.org/");
			
			//Get current URL
			String currentURL = driver.getCurrentUrl();
			System.out.println(currentURL);
			Thread.sleep(1800);
			
			//Open new tab and go to google.com
			if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("window.open();");
		        }
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        Thread.sleep(1800);
			//driver.findElement(By.cssSelector("Body")).sendKeys(Keys.chord(Keys.COMMAND,"t"));
			driver.get("https://google.com");
			
			
			//Get current size of window and set the dimension to 640 x 480
			System.out.println(driver.manage().window().getSize());
			Dimension d = new Dimension(640, 480);
			
			driver.manage().window().setSize(d);
			System.out.println(driver.manage().window().getSize());
			
			//Sleep for 1.8s
			Thread.sleep(1800);
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		//Refresh the page
		driver.navigate().refresh();
		
		//Quite Firefox
		driver.quit();
		
	}
	
	

}

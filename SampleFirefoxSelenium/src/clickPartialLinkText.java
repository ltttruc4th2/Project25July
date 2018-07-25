import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.propertiesFile;

public class clickPartialLinkText {

	public static void main(String[] args) throws InterruptedException {

		
		String workLocation;
		
		propertiesFile property = new propertiesFile();
		workLocation = property.readProperties("geckoDriverPath");
		System.setProperty("webdriver.gecko.driver", workLocation);
		
		System.out.println(workLocation);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://wikipedia.org/");
		
		driver.findElement(By.partialLinkText("Terms")).click();
		
		//check the page that navigated
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		Thread.sleep(1000);
		
		//Close browser
		driver.quit();
		
	}

}

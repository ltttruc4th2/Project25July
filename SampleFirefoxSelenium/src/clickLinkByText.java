
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;

import config.propertiesFile;

public class clickLinkByText {

	public static void main(String[] args) throws InterruptedException {

		String workLocation;
		
		propertiesFile property = new propertiesFile();
		workLocation = property.readProperties("geckoDriverPath");
		System.setProperty("webdriver.gecko.driver", workLocation);
		
		System.out.println(workLocation);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com/");
		
		try {
			//find linkText
			//driver.findElement(By.linkText("Gmail")).click();
			
			//find class Name
			//driver.findElement(By.className("gb_P")).click();
			
			//Find by xPath
			//driver.findElement(By.xpath("//a[contains(text(),'Bảo mật')]")).click();
			
			//driver.findElement(By.xpath("//a[@class='gb_P']")).click();
			//driver.findElement(By.id("lst-ib"));
			//Assert.assertTrue(driver.findElement(By.id("lst-ib")).isDisplayed());
			
			//find by class name
			//driver.findElement(By.className("gsfi"));
			
			//input text and clear text
			//driver.findElement(By.id("lst-ib")).sendKeys("Selenium WebDriver");
			//driver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
			//Thread.sleep(500);
			
			//driver.findElement(By.id("lst-ib")).clear();
			
			//find element by css
			//driver.findElement(By.cssSelector(".ctr-p1"));
			
			//find element by tag name
			//driver.findElement(By.tagName("textarea"));
			
			//find by xpath
			//driver.findElement(By.xpath("//input"));
			
			//find All links using Selenium
			/*List<WebElement> links = driver.findElements(By.tagName("a"));
			for (WebElement ele:links) {
				System.out.println(ele.getAttribute("href"));
			}*/
			
			//check of text present
			/*if(driver.getPageSource().contains("Google được cung cấp tại:")) {
				System.out.println("Text present");
			}
			else {
				System.out.println("Text not present");
			}*/
			
			//get domain name
			//get page title
			//work with cookies
			//navigate backward and forward
			//write page source into file
			//click a button by id
			//select a checkbox
			//select a dropdown value
			//select radio button
			//switch browser tab
			//close dialog box
			//find all elements
			//move windows to x-y co-ordinates
			//get xy co-ordinate
			//open context menu by right mouse click
			//close browser tab
			//scroll elements using javascript
			//get all image urls
			//implicit wait
			//explicit wait
			//page load timeout
			//open link in new window
			//switch to new window
			//read data from excel file
			//time stamp
			//print link names on page
			//double click on button
			//web page load time
			//select text in web page
			//Zoom in zoom out
			//Internet explorer setup
			//special character keys event
			//send unicode key
			//get size of element
			//get text of elements text
			//firefox profile
			//verify element using isEnabled
			//verify element using isDisplayed
			//total checkboxes on webpage
			//total number of dropdown menu
			//total number of textboxes
			//total number of iframe
			//total number of radio buttons
			//total number of buttons
			//Extract Css attribute of element
			//Execute javascript on webpage
			//Handle alert
			//Read font properties
			//read data in HTML web table
			//table row count
			//Mouse hover actions
			//HTML Unit Driver
			//java awt robot get pixel color
			//java awt robot right click press release
			//get last modified date
			//check document ready state
			//phantomjs driver
			//screen capture using phantomjs
			//generate pdf report
			//Add jUnit library
			//Switching Frames
			//Drag and drop
			//Select multiple checkboxes
			//Get popup window text
			//Selenium HTML5 Video automation
			//Dismiss Alert popup
			//Setup testNG
			//Selenium testNG Test Case Priority Annotations
			//Selenium Java TestNG skip test
			//TestNG dependsOnMethods example
			//Execute javascript in HTMLUnitDriver
			//Javascript Executor Select checkbox
			//Javascript Executor Send Characters
			//Javascript Executor Click button
			//TestNG Reporter
			//TestNG HTML report
			//TestNG @BeforeMethod @AfterMethod
			//Double click button
			//Download image
			//Download file
			//Javascript Executor Select Radio Button.
			
			//check the page that navigated
			//String currentURL = driver.getCurrentUrl();
			//System.out.println(currentURL);
			
			//Close browser
			//driver.quit();
		} catch (Exception e) {
			System.out.println("Unable clear due to element not found!");
		}
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}

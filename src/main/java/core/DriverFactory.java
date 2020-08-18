package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
private WebDriver driver = null;
	
	public WebDriver getDriver(String browser) {

		if(browser.toLowerCase().equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:/Users/marinellid/Desktop/WizdomQA/chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browser.toLowerCase().equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:/Users/marinellid/Desktop/WizdomQA/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);  // One time config done for the whole project
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // One time config
		return driver;	
	}
	
	public void quitDriver() {
		if(driver!=null) {
			driver.quit();
		}
	}
}

package co.amazon.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitDriver {
	WebDriver driver;
	private String browser;

	public InitDriver(String browser) {
		this.browser = browser;
		setWebDriver();
	}
	
	private void setWebDriver() {
		switch(browser.toLowerCase()){
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
				
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			
			default:
				System.out.println("Invalid Browser Selection");
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
}

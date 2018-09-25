package co.amazon.co;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonLogIn {
	WebDriver driver;
	
	@BeforeTest
	public void lounchBrowser() {
		InitDriver init = new InitDriver("chrome");
		driver = init.getDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void lounchAmazon() {
	  driver.get("https://www.amazon.in");
	}
	
	@Test(priority = 1,dependsOnMethods = {"lounchAmazon"})
	public void shopByCategory() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@id='nav-shop']/a[@id='nav-link-shopall']"))).build().perform();
	}
	
	@Test(priority = 2)
	public void echoAndAlexa() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[@class='nav-hasPanel                              nav-item']/span[text()='Echo & Alexa']"))).build().perform();
	}
	
}		

package shopping;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsThelogginExsit {

	@Test
	public void testButton() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		boolean expectedVal;
		
		
		expectedVal = driver.findElement(By.name("login")).isDisplayed();
		
		assertTrue(expectedVal);

	}
	
	public boolean isElementPresent(WebDriver driver, By locatorKey) {
	    try {
	        driver.findElement(locatorKey);
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	
	
}

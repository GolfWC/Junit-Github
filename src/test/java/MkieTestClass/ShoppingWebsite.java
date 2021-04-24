package MkieTestClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingWebsite {

	

//		WebDriverManager.chromedriver().setup();

	    WebDriver driver;	
		
		@Before
		public void setup() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			}
		
		@Test
		public void TestCase1() {
			driver.get("http://automationpractice.com/index.php");
			
			String actualTitle = "My Store";
			String expectTitle = driver.getTitle();
			if(actualTitle.equals(expectTitle)) {
				
				System.out.println("Title is match");
			}else {
				System.out.println("Wrong Title");
			}
			
			driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("shirt", Keys.ENTER);
			 
		    driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		    
			
			String result = driver.findElement(By.xpath("//span[contains(text(),'\"shirt\"')]")).getText();
			String text = "\"SHIRT\"";
			
			 
			if(result.equalsIgnoreCase(text)) {
				
				System.out.println("Text is match");
				
			}else {
				System.out.println("Test is fail");		
				
			}
	
			assertEquals(result,text);
			
			driver.findElement(By.xpath("//select[@id='selectProductSort']")).click();
			driver.findElement(By.xpath("//option[contains(text(),'In stock')]")).click();

//6 User need verify name of product and price and verify IN stock green button is display
			String actualProductName = driver.findElement(By.xpath("(//a[contains(text(),'Faded Short Sleeve T-shirts')])[2]")).getText();    
			String expectProductName = "Faded Short Sleeve T-shirts";
			if(actualProductName.equalsIgnoreCase(expectProductName)) {
				
				System.out.println("Same Product name");
				
			}else {
				System.out.println("Product not match");
				
			}
			assertEquals(actualProductName,expectProductName);
			
			String actualPrices = driver.findElement(By.xpath("(//span[contains(text(),'$16.51')])[3]")).getText();
			String expectPrices ="$16.51";
			if(actualPrices.equals(expectPrices)) {
				System.out.println("Price is match");
			}else {
				System.out.println("Price not match");
			}
			assertEquals(actualPrices,expectPrices);
			
			boolean display =driver.findElement(By.xpath("//span[@class='available-now']")).isDisplayed();
			assertTrue(display);
			
		}
		
		
		
		@After
		public void end() {
			
			driver.close();
		}
	

}

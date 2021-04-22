package FirstTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTest {
	@Test
	public void junitOne() {
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		// maximizes my browser
		driver.manage().window().maximize();
		
		
		//search for JAVA and press ENTER
		//click on news tab
//		driver.findElement(By.id("input")).sendKeys("Men VolleyBall", Keys.ENTER);
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Men VolleyBall", Keys.ENTER);
		driver.findElement(By.name("q")).sendKeys("JAVA", Keys.ENTER);
	
		driver.findElement(By.xpath("//*[@id='hdtb-msb']/div/div/div[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
		
		
//		String searchResultStat = driver.findElement(By.id("result-stats")).getText();
		String result = driver.findElement(By.id("result-stats")).getText();

		System.out.println(result);
		
//		Thread.sleep(3000);
		
		driver.navigate().back();
		
		String result2 = driver.findElement(By.id("result-stats")).getText();

		System.out.println(result2);
		
		
		driver.quit();
	
	}
}

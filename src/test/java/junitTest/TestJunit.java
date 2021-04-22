package junitTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestJunit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.mortgagecalculator.org/");
		
		driver.findElement(By.xpath("//input[@id='homeval']")).sendKeys("300000",Keys.ENTER);
		driver.findElement(By.id("downpayment")).sendKeys("6000",Keys.ENTER);
		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		driver.findElement(By.id("loanamt")).sendKeys("240000.00",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name=\"param[interest_rate]\"]")).sendKeys("3.8",Keys.ENTER);
		driver.findElement(By.id("loanterm")).sendKeys("30",Keys.ENTER);
		
		driver.findElement(By.name("param[start_month]")).click();
		driver.findElement(By.xpath("//option[@value=\"5\"]")).click();
		
		driver.findElement(By.id("start_year")).sendKeys("2021",Keys.ENTER);
		driver.findElement(By.id("pptytax")).sendKeys("2400",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='pmi']")).sendKeys("0.5",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='hoi']")).sendKeys("1000",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='hoa']")).sendKeys("0",Keys.ENTER);
		driver.findElement(By.name("param[milserve]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Conventional')]")).click();
		
		driver.findElement(By.name("param[refiorbuy]")).click();
		driver.findElement(By.xpath("//option[@label=\"Refi\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		driver.close();
	}

}

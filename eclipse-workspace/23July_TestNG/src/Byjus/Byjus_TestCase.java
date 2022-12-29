package Byjus;

import java.security.PublicKey;
import java.security.interfaces.DSAPublicKey;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.PublicApi;

public class Byjus_TestCase {
	WebDriver driver;
	
	@BeforeMethod
	public void Initialization() {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Installation\\Driver\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	
	 driver.manage().window().maximize();
	
	 driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	
	 driver.get("https://byjus.com/learn/profile");
	//button[@type="button"]
	}

	@Test
	public void Byjus_LoginTestCase() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"phone-text-input  form-control\"]")).sendKeys("7875782120");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[@class=\"btn next-btn next-btn-active btn btn-light\"]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class=\" css-b62m3t-container\"])[2]")).click();
		driver.findElement(By.xpath("(//div[@class=\" css-qc6sy-singleValue\"])[2]")).click();
		
	}
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		//driver.quit();
	}
}

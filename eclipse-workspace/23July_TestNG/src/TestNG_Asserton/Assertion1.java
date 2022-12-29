package TestNG_Asserton;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertion1 {
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Installation\\New Driver\\chromedriver.exe");
		
	    driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void UserName() {
		
		WebElement Username = driver.findElement(By.name("username"));
		WebElement Password = driver.findElement(By.name("password"));
		
		// AssertTrue
		assertTrue(Username.isDisplayed());
		Username.sendKeys("Admin");
		
		assertTrue(Password.isDisplayed());
		Password.sendKeys("admin123");
		
		// AssertFalse
		
//		assertFalse(Username.isDisplayed());
//		Username.sendKeys("Admin");
//		
//		assertFalse(Password.isDisplayed());
//		Password.sendKeys("admin123");	
	}
	
	@Test
	public void OrangeHRM() {
		
		WebElement Username = driver.findElement(By.name("username"));
		WebElement Password = driver.findElement(By.name("password"));
		WebElement Submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		assertTrue(Username.isDisplayed());
		Username.sendKeys("Admin");
		
		assertTrue(Password.isDisplayed());
		Password.sendKeys("admin123");
		
	    Submit.click();
	    
	    boolean text = driver.findElement(By.xpath("//p[contains(text(),'Alb Ghost')]")).isDisplayed();
	    assertEquals(text, true);
	}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}

package AssignmentNo7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Initialization() {
		
		 	System.setProperty("webdriver.chrome.driver", "C:\\Installation\\Driver\\chromedriver.exe");
			
		 	driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.get("https://www.edamama.ph/shop");
	}

	@Test
	public void edamamaPage() throws InterruptedException {
		
		WebElement Element =  driver.findElement(By.xpath("(//h2[@class=\"title\"])[2]"));
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].scrollIntoView()", Element);
		
		driver.findElement(By.xpath("(//a[@class=\"rf-link ng-star-inserted\"])[11]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("moe-dontallow_button")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Add to Bag')]")).click();
		Thread.sleep(3000);
		
		
		
		
	}
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		//driver.quit();
	}
}

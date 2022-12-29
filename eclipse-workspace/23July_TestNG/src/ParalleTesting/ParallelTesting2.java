package ParalleTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting2 {
	
	WebDriver driver;
	
	@Test 
	public void M1() {
		   System.setProperty("webdriver.chrome.driver", "C:\\Installation\\New Driver\\chromedriver.exe");
			
		    driver = new ChromeDriver();
				
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
			driver.quit();
			
	}
	
	@Test 
	public void M2() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installation\\New Driver\\chromedriver.exe");
		
	    driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
	 
		driver.quit();
	}

}

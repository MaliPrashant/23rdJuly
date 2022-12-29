package TestNG_Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keywords1 {

	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Installation\\New Driver\\chromedriver.exe");
			
	   driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}

// The sequence of execution is depends on Alpha numerical order
	
	@Test
	public void OrangeHRM_LoginPage() {
		String Title = driver.getTitle();
		System.out.println("Page Title: "+ Title);	
	}
	
	@Test
	public void OrangeHRM_Logo() {
		boolean logo = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]")).isDisplayed();
		System.out.println("Is logo displayed or not: "+logo);
	}
	
	@Test
	public void OrangeHRM_Link() {
		boolean link = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).isDisplayed();
		System.out.println("Is Link click or not: "+link);
	}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(3000);
	    driver.quit();
	}
}



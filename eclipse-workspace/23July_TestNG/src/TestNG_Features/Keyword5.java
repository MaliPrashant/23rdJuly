package TestNG_Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword5 {
	
WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Installation\\New Driver\\chromedriver.exe");
		
		   driver = new ChromeDriver();
				
		   driver.manage().window().maximize();
			
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(groups = "Title") 
	public void OrangeHRMTitle() {
		String Title = driver.getTitle();
		System.out.println("Title " + Title);
	}

	@Test(groups = "Logo") 
	public void OrangeHRMLogo() {
		boolean Logo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println("Logo " + Logo);
	}

	@Test(groups = "Logo") 
	public void OrangeHRMLink() {
		boolean link = driver
				.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]"))
				.isDisplayed();
		System.out.println("Link " + link);
    }
	
	@Test (groups = "Test")
	public void Test1() {
		System.out.println("Test 1");
	}
	
	@Test (groups = "Test")
	public void Test2() {
		System.out.println("Test2");
	}
	
	@Test (groups = "Test")
	public void Test3() {
		System.out.println("Test3");
	}
		
	@AfterMethod 
	public void Teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
}


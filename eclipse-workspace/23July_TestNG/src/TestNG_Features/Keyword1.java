package TestNG_Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword1 {
	
/* TestNG keyword-1: "priority"
	 To change test method/TC execution order we need to use TestNG keyword "priority"
	 Example: (priority =2)
	 */
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installation\\New Driver\\chromedriver.exe");
		
	    driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test (priority = -2)
	public void OrangeHRM_LoginPage() {
		String Title = driver.getTitle();
		System.out.println("Page Title: "+ Title);	
	}
	
	@Test (priority = 3)
	public void OrangeHRM_Logo() {
		boolean logo = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]")).isDisplayed();
		System.out.println("Is logo displayed or not: "+logo);
	}
	
	@Test (priority = 1)
	public void OrangeHRM_Link() {
		boolean link = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).isDisplayed();
		System.out.println("Is Link click or not: "+link);
	}
	
	@Test (priority = 5)
    public void T1() {
		System.out.println("Test 2");
	}
	
	@Test (priority = 4)
    public void T2() {
		System.out.println("Test 1");
	}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(3000);
	    driver.quit();
	}
	
}

package TestNG_Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword2 {
	
/* TestNG keyword-2: "enabled"
      Displaying a test method/TC in testNG can be achieved by setting the enable attribute of the @Test annotation to false.
      Example: (enabled = true) 	
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
	
	@Test (enabled = true)
	public void OrangeHRM_LoginPage() {
		String Title = driver.getTitle();
		System.out.println("Page Title: "+ Title);	
	}
	
	@Test (enabled = false)
	public void OrangeHRM_Logo() {
		boolean logo = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]")).isDisplayed();
		System.out.println("Is logo displayed or not: "+logo);
	}
	
	@Test (enabled = false)
	public void OrangeHRM_Link() {
		boolean link = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).isDisplayed();
		System.out.println("Is Link click or not: "+link);
	}
	
	@Test (enabled = true)
    public void T1() {
		System.out.println("Test 1");
	}
	
	@Test (enabled = false)
    public void T2() {
		System.out.println("Test 1");
	}
	
	@AfterMethod 
	public void Teardown() throws InterruptedException {
		Thread.sleep(3000);
	    driver.quit();
	}

}

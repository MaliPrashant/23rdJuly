package TestNG_Parameterization;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	WebDriver driver;
	@Parameters({"URL"})
	@BeforeMethod
	public void Setup(String URL) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installation\\New Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(URL);
	}
	
	@Test
	@Parameters ({"Username","Password","Title"})
	public void LoginTest(String Username, String Password, String Title) throws InterruptedException {
		
		WebElement User = driver.findElement(By.id("Email"));
		Thread.sleep(5000);
		User.clear();
		User.sendKeys(Username);
		
		WebElement Pass = driver.findElement(By.id("Password"));
		Pass.clear();
		Thread.sleep(4000);
		Pass.sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		
		String Actual_Title = driver.getTitle();
		//String Expected_Title = "Dashboard / nopCommerce administration";
		
		if (Actual_Title.equals(Title)) {
			System.out.println("Correct Title");
		}
		else 
			System.out.println("Incorrect Title");
	}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
}












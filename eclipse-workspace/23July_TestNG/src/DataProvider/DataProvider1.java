package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	WebDriver driver;
	
	@Test (dataProvider = "LoginData")
	public void LoginTest(String Username, String Password) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Installation\\New Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys(Username);
		
		driver.findElement(By.name("password")).sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).isDisplayed());	
		
		driver.quit();
	}
		
	@DataProvider (name = "LoginData")
	 public Object[][] LoginData() {
		 
		 Object data [][] = new Object [4][2];
		 // Correct username & Correct password
		 
		 data[0][0] = "Admin";
		 data[0][1] = "admin123";
		 
		 // Incorrect username & Correct password
		 data [1][0] = "Admin12";
		 data [1][1] = "Admin123";
		 
		 // Correct username & Incorrect password 
		 data [2][0] = "Admin";
		 data [2][1] = "Admin1";
		 
		 //Incorrect username & incorrect password
		 data [3][0] = "admin11";
		 data [3][1] = "admin22";
		 
		 return data;
				 
	 }
}

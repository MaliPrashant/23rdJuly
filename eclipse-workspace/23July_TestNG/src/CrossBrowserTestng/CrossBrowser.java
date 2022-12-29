package CrossBrowserTestng;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowser {
	
	WebDriver driver;
	@Parameters("Browsername")
	@Test
	public void OrangeHRM_Login(String Browsername) {
		
		// To set path of the chrome driver exe file.
		
		if (Browsername.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Installation\\New Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (Browsername.equals("Edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Installation\\Driver\\msedgedriver.exe");
            driver = new EdgeDriver();
		}
	
		else if (Browsername.equals("FireFox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Installation\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		button.click();
		
		String ExpectedName = "Paul Collings";
		
		String ActualName = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		
		Assert.assertEquals(ExpectedName, ActualName);
		
		System.out.println("Correct Name");
		
		driver.quit();
	}
	

}

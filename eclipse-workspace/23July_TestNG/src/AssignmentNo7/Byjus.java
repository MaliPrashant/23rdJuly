package AssignmentNo7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Byjus {

	
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Installation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://byjus.com/");
	}
	
	@Test
	public void LoginTest() throws InterruptedException{
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Sarthak");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("7875782120");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Send OTP\"]")).click();
		Thread.sleep(30000);
		WebElement States = driver.findElement(By.xpath("//select[@name=\"state\"]"));
		
		Select SC = new Select(States);
		SC.selectByValue("Maharashtra");
		Thread.sleep(2000);
		
		WebElement grade = driver.findElement(By.xpath("//select[@name=\"grade\"]"));
		
		Select SC2 = new Select(grade);
		SC2.selectByValue("");
	}
}

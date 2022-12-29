package TestNG_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase_WithTestNG {
	
	@Test
	public void M1() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Installation\\New Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.amazon.in/");
		
		driver.get("https://www.redbus.in/");
	}

	@Test
	public void M2() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Installation\\New Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//driver.get("https://www.redbus.in/");
	}
	
}

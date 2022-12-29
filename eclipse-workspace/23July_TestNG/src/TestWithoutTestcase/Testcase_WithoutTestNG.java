package TestWithoutTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_WithoutTestNG {
	
	public static void main(String []args ) {

        System.setProperty("webdriver.chrome.driver", "C:\\Installation\\New Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.amazon.in/");
		
		driver.get("https://www.redbus.in/");
		
	}	
}

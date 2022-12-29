package Com.Banking.BaseClass;


import java.util.concurrent.TimeUnit;

//import java.util.logging.Logger;

//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.Banking.Utilities.Banking_TestUtils;

public class Banking_BaseClass {
	
	public String BaseURL ="https://demo.guru99.com/V4/index.php";
	public String Username = "mngr464119";
	public String Password = "tYdAjYt";
	public static WebDriver driver;
//	public static Logger Logger;
	

	@BeforeMethod
	public void Initialization () throws InterruptedException {
		
		//Logger = Logger.getLogger("23rd July Automation");
		//PropertyConfigurator.configure("Log4j.Properties");
		
		System.setProperty("webdriver.chrome.driver","C:\\Installation\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(BaseURL);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Banking_TestUtils.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();		
	}
	
}

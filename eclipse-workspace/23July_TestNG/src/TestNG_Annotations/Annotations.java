package TestNG_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
// Precondition Annotations
	@BeforeSuite              // 1st Priority
	public void Setup() {
		System.out.println("Setup System Property");
	}
	
	@BeforeClass             // 3nd Priority 
	public void URL() {
		System.out.println("Enter URL");
	}

	@BeforeMethod           // 4td Priority
	public void Login() {
		System.out.println("Login to Application");
	}
	
	@BeforeTest              // 2nd Priority 
	public void LaunchBrowser() {
		System.out.println("Launch Browser");
	}
	
// Test Class 
	
	@Test                    // 5th Priority 
	public void GoogleTitle() {
		System.out.println("Google Title");
	}
	
	
// Postcondition Annotations
	@AfterMethod            // 6th Priority
	public void Logout() {
		System.out.println("Logout from application");
	}
	
	@AfterClass            // 7th Priority 
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterTest            // 8th Priority
	public void detectCookies() {
		System.out.println("Detect coockies");
	}
	
	@AfterSuite
	public void Logout1() {
		System.out.println("Logout 1");
	}
}

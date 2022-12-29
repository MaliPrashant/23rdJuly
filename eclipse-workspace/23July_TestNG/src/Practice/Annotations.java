package Practice;

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
	
	
	@AfterMethod 
	public void M1() {
		System.out.println("Print mwthod: M1");
	}

	@BeforeClass
	public void M2() {
		System.out.println("Print Method: M2");
	}
	
	@BeforeSuite
	public void M3() {
		System.out.println("Print Method: M3");
	}
	
	@Test
	public void M4 () {
		System.out.println("Print Method: M4");
	}
	
	@AfterTest
	public void M5() {
		System.out.println("Print Method: M5");
	}
	
	@AfterClass
	public void M6() {
		System.out.println("Print Method: M6");
	}
	
	@AfterSuite
	public void M7() {
		System.out.println("Print Method: M7");
	}
	
	@BeforeMethod
	public void M8() {
		System.out.println("Print Method: M8");
	}
	
	@BeforeTest
	public void M9() {
		System.out.println("Print Method: M9");
	}
	

}

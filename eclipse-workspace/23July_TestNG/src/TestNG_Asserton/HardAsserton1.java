package TestNG_Asserton;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsserton1 {
	
	@Test
	public void DemoTest() {
		
		Assert.assertTrue(false);   // false
		
		System.out.println("Hello Good Morning");
		
		Assert.assertEquals("Welcome", "Welcome"); 
		
		System.out.println("Hello");
		
		Assert.assertEquals("Selenium", "Selenium");
		
		System.out.println("Successfull Passed TC");
	}
	
	@Test
	public void DemoTest1() {
		
		Assert.assertTrue(true); // false
		
		System.out.println("Hello Good");
		
		System.out.println("Hii");
		
		Assert.assertEquals("Selenium", "Selenium");
		
		System.out.println("Successfully Passed TC");
		
	}
	

}

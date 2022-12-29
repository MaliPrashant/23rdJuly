package TestNG_Asserton;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test 
	public void DemoTest() {
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals("Welcome", "Welcom");  // false
		
		System.out.println("Execution Started");
		
		soft.assertEquals(false, true);
		
		System.out.println("Successfully Passed DemoTest");
		
		soft.assertAll();
		
// It collect the result of all the assertion and in case if any failure mark test as failed.		
	    }
	
	@Test
	public void DemoTest1 () {
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals("Welcome"," Welcome");
		
		System.out.println("Execution Started");
		
		soft.assertEquals(true, true);
		
		System.out.println("Sussessfully Passed DemoTest1");
		
		soft.assertAll();
		
// It collect the result of all the assertion and in case if any failure mark 
// the test as failed.		
	}
	

}












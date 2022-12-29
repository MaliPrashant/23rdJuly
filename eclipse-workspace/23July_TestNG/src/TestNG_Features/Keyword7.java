package TestNG_Features;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword7 {

	
	@Test 
	public void OrangeHRMTest() {
		System.out.println("@Test--OrangeHRMTest");
		Reporter.log("23rd July Batch", true);
	}
	
	@Test
	public void OrangeHRMSearch() {
		System.out.println("@Test--OrangeHRMSearch");
		Reporter.log("Running OrangeHRM Search", true);
	}
}

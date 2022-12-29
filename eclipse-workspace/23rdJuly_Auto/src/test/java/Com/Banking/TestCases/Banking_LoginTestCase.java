package Com.Banking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Com.Banking.BaseClass.Banking_BaseClass;
import Com.Banking.PageObject.Banking_LoginPage;

public class Banking_LoginTestCase extends Banking_BaseClass {

	@Test
	public void LoginTest() {
		//Logger.info("URL is open");
		Banking_LoginPage BL = new Banking_LoginPage();
	//Logger.info("Enter Username");
		BL.SetUsername("Username");
	//	Logger.info("Enter Password");
		BL.SetPassword("Password");
	//	Logger.info("Click on Login Button");
		BL.Clickbtn();
		
		if (driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
}

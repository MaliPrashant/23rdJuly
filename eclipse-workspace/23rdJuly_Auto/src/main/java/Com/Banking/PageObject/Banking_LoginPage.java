package Com.Banking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Banking.BaseClass.Banking_BaseClass;

public class Banking_LoginPage extends Banking_BaseClass{
	
// 1. 
	
	public Banking_LoginPage() {
		PageFactory.initElements(driver, this);
	}

// 2. 
	
	@FindBy (name ="uid")
	public WebElement Username;
	
	@FindBy (name = "password")
	public WebElement password;
	
	@FindBy (xpath = "//input[@type=\"submit\"]")
	public WebElement LoginBtn;
	
// 3. 
	
	public void SetUsername (String Uname) {
		Username.sendKeys(Uname);
	}
	
	public void SetPassword (String pwd) {
		password.sendKeys(pwd);
	}
	
	public void Clickbtn() {
		LoginBtn.click(); 
	}
}

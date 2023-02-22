package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	

		WebDriver driver;
		
		public LogInPage(WebDriver driver) {
		
			PageFactory.initElements(driver, this);
		}
		
	@FindBy (id ="Email") WebElement email;
	
	@FindBy (id = "Password") WebElement password;
	
	@FindBy (xpath = "//button[@type=\"submit\"]") WebElement LoginButton;
	
	@FindBy (linkText = "Logout") WebElement LinkText;
	
	
	public void EnterEmail(String EmailAdd) {
		email.sendKeys(EmailAdd); 
	}
	
	public void EnterPassword(String PasswordAdd) {
		password.sendKeys(PasswordAdd);
	}

	
	public void ClickOnLogin() {
		
		LoginButton.click();
		
	}

	public void Logout() {
		LinkText.click();
		
	}
	
}

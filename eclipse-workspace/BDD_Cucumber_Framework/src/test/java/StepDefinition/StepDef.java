package StepDefinition;

import org.junit.Assert;
import org.junit.internal.runners.InitializationError;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LogInPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	public LogInPage Login;
	
	public WebDriver driver;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  Login = new LogInPage(driver);
	  
	 
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	   driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String EmailAdd, String PasswordAdd) {
	    Login.EnterEmail(EmailAdd);
	    Login.EnterPassword(PasswordAdd);
	}

	@When("Click on Login")
	public void click_on_login() {
	    Login.ClickOnLogin();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {
	    String ActualTitle =driver.getTitle();
	    
	    if (ActualTitle.equals(ExpectedTitle)) {
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
	   Login.Logout();
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	    driver.quit();
	}

}

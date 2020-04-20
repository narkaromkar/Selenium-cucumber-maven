package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;
import testUtil.BaseClass;

public class StepDefination {
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		BaseClass.initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    LoginPage loginPage = new LoginPage();
	    loginPage.login();
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		
	}

	@Then("^user cicks on sign-in button$")
	public void user_clicks_on_sign_in_button() throws Throwable {
	    
	}
	
	@Then("^user closes browser$")
	public void user_closes_browser() throws Throwable {
	    BaseClass.driver.quit();
	}
}

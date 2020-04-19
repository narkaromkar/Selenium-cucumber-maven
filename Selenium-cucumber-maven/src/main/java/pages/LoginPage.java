package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testUtil.BaseClass;


public class LoginPage extends BaseClass{
	@FindBy(partialLinkText = "Sign in")
	WebElement SignIn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(){
		SignIn.click();
	}
	
	
}

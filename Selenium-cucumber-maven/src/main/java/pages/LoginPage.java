package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testUtil.BaseClass;


public class LoginPage extends BaseClass{
	@FindBy(partialLinkText = "Sign in")
	WebElement signIn;
	
	@FindBy(xpath = "//input[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath = "//input[@id=\"passwd\"]")
	WebElement password;
	
	@FindBy(xpath = "//button[@id=\"SubmitLogin\"]")
	WebElement submit;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un, String pwd){
		signIn.click();
		email.sendKeys(un);
		password.sendKeys(pwd);
		submit.click();
	}
	
	
}

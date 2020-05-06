package stepDefination;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;
import testUtil.BaseClass;


public class StepDefination {
	
	LoginPage loginPage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		BaseClass.initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    loginPage = new LoginPage();
	}

	@Then("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\" and user clicks on sign-in button$")
	public void user_enters_username_as_and_password_as_and_user_clicks_on_sign_in_button(String email, String password) throws Throwable {
		loginPage.login(email,password);
	}

	
	@Then("^user closes browser$")
	public void user_closes_browser() throws Throwable {
	    //BaseClass.driver.quit();
	}
	
	@Then("^user clicks on women button$")
	public void user_clicks_on_women_button() throws Throwable {
	  
	}

	@Then("^user saves all data in excel sheet$")
	public void user_saves_all_data_in_excel_sheet() throws Throwable {
	
	 
	}
}

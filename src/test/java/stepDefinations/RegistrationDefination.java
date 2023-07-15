package stepDefinations;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;

public class RegistrationDefination {

	RegistrationPage rp = new RegistrationPage();

	@Given("^user is on Login Page$")
	public void user_is_on_loginPage() {
		rp.openBrowser();
		rp.openLoginPage();
	}

	@When("^title of login page \"(.*)\"$")
	public void title_of_loginPage(String expectedTitle) {
		String actualTitle = rp.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^go to registration page$")
	public void go_to_registration_page() {
		rp.clickOnRegisterLink();
	}

	@Then("^user enters all the details$")
	public void user_enters_all_the_details(DataTable data) {
		rp.enterAllDetails(data);
	}

	@Then("^verify title \"(.*)\"$")
	public void verify_title(String expectedTitle) {
		String actualTitle = rp.getRegisterTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^user click on logout link$")
	public void user_click_on_logout_link() {
		rp.clickOnLogoutLink();
	}

	@Then("^user click on registration link$")
	public void user_click_on_registration_link() {
		rp.clickOnRegisterLink();
	}

	
	@Then("^quite the browser$")
	public void quit() {
		rp.quitBrowser();
	}

}

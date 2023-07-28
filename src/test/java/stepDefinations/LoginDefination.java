package stepDefinations;

import org.junit.Assert;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefination extends BaseTest{
	
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
		 System.out.println("User is on loginPage");
	 }
	
	 @When("^title of login page is \"(.*)\"$")
	 public void title_of_login_page_is_Account_Login(String title){
     String expectedTitle = title;
     String actualTitle = lp.getTitle();
     Assert.assertEquals(expectedTitle, actualTitle);
	 }
	
	 @Then("^user check forgot password link$")
	 public void user_check_forgot_password_link()
	 {
		 Assert.assertTrue(lp.isForgotPasswordLinkDisplayed());
	 }
	 
	 
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_emailId_and_password(String emailId, String password){
	 lp.enterEmailAndPassword(emailId, password);
	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 lp.clickOnLoginButton();
	 }
	 
	 @Then("^user is on My Account page \"(.*)\"$")
	 public void user_is_on_my_account_page(String accountPageTitle) {
	 String title = lp.getAccoutPagetitle();
	 System.out.println(title);
	 Assert.assertEquals(accountPageTitle, title);
	 }
	 
	 @Then("close the browser")
	 public void close_the_browser() {
	 lp.closeBrowser();
	 }
}

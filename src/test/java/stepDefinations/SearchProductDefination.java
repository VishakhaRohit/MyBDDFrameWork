package stepDefinations;

import org.junit.Assert;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductDefination extends BaseTest{
	
	 @Given("^user is on LoginPage$")
	 public void user_already_on_login_page(){
		 System.out.println("User is on Login Page");
	 }
	
	 @When("^title of loginpage is \"(.*)\"$")
	 public void title_of_login_page_is_account_login(String title){
     String expectedTitle = title;
     String actualTitle = sp.getTitle();
     Assert.assertEquals(expectedTitle, actualTitle);
	 }
	
	 @Then("^user entering \"(.*)\" and \"(.*)\"$")
	 public void user_enters_emailId_and_password(String emailId, String password){
	 sp.enterEmailAndPassword(emailId, password);
	 }
	
	 @Then("^user clicks on login$")
	 public void user_clicks_on_login_button() {
	 sp.clickOnLoginButton();
	 }
	 
	 @Then("^user is on \"(.*)\"$")
	 public void user_is_on_my_account_page(String accountPageTitle) {
	 String title = sp.getAccoutPagetitle();
	 System.out.println(title);
	 Assert.assertEquals(accountPageTitle, title);
	 }

	 @Then("^user is searching for the \"(.*)\"$")
	 public void user_is_searching_for_the_product(String productName) {
	 sp.searchProduct(productName);
	 System.out.println("user is searching for the : " + productName);
	 }
	 
	 @Then("quit browser")
	 public void close_the_browser() {
	 sp.closeBrowser();
	 }
	
}

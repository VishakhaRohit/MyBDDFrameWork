package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductInfoPage;

public class ProductInfoDefination {

	WebDriver driver;
	ProductInfoPage pp = new ProductInfoPage();
	
	@Given("^user opens LoginPage")
	public void user_opens_login_page() {
		pp.openBrowser();
		pp.openLoginPage();
	}
	
	@When("^title of the loginpage \"(.*)\"$")
	public void title_of_the_loginpage(String title) {
		String actualTitle = pp.getTitle();
		System.out.println("Login Page title = " + actualTitle);
		Assert.assertEquals(title, actualTitle);
	}
	
	@Then("^user enter the \"(.*)\" and \"(.*)\"$")
	public void user_enter_the_and(String emailId, String password) {
		pp.enterEmailAndPassword(emailId, password);
	}
	
	@Then("^user clicking on login$")
	public void user_clicking_on_login() {
		pp.clickOnLoginButton();
	}
	
	@Then("^user search for the \"(.*)\"$")
	public void user_search_for_the(String productName) {
		pp.searchProduct(productName);
	}
	
	@Then("^user click on the product$")
	public void user_click_on_the_product() {
		pp.clickOnProduct();
	}
	
	@Then("^verify the product details \"(.*)\"$")
	public void verify_the_product_details(String expectedTitle) {
		String actualTitle = pp.getProductInfoPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("closing the browser")
	public void closing_the_browser() {
	    pp.closeTheBrowser();
	}
}

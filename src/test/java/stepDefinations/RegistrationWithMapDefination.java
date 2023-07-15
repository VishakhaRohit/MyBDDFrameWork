//package stepDefinations;
//import java.util.Map;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class RegistrationWithMapDefination {
//
//	WebDriver driver;
//
//	@Given("^user is on Login Page$")
//	public void user_is_on_login_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//	}
//
//	@When("^title of login page is Account Login$")
//	public void title_of_login_page_is_Account_Login() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Account Login", title);
//	}
//
//	@Then("^go to registration page$")
//	public void go_to_registration_page() {
//		driver.findElement(By.linkText("Register")).click();
//	}
//
//	@Then("^user enters all the details$")
//	public void user_enters_all_the_details(DataTable data) {
//		
//		
//		for (Map<String,String> dataValue : data.asMaps(String.class, String.class)) {
//			driver.findElement(By.id("input-firstname")).sendKeys(dataValue.get("firstname"));
//			driver.findElement(By.id("input-lastname")).sendKeys(dataValue.get("lastname"));
//			driver.findElement(By.id("input-email")).sendKeys(dataValue.get("emailid")+ (int)(Math.random() * 1000) + "@gmail.com");
//			driver.findElement(By.id("input-telephone")).sendKeys(dataValue.get("contact"));
//			driver.findElement(By.id("input-password")).sendKeys(dataValue.get("password"));
//			driver.findElement(By.id("input-confirm")).sendKeys(dataValue.get("confirm Password"));
//			driver.findElement(By.xpath("//input[@type='radio' and @value='0']")).click();
//			driver.findElement(By.xpath("//input[@type='checkbox' and @value='1']")).click();
//			driver.findElement(By.xpath("//input[@value='Continue']")).click();
//			driver.findElement(By.linkText("Logout")).click();
//			driver.findElement(By.linkText("Register")).click();
//		}
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//}

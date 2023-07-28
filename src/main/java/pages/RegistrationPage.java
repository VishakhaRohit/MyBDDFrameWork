package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;

public class RegistrationPage {

	WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
//	public void openBrowser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
//		driver = new ChromeDriver();
//	}
//
//	public void openLoginPage() {
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//	}

	public String getTitle() {
		String actualTitle = driver.getTitle();
		return actualTitle;
	}

	public void clickOnRegisterLink() {
		driver.findElement(By.linkText("Register")).click();
	}

	public void enterAllDetails(DataTable data)
	{	
		for (Map<String,String> dataValue : data.asMaps(String.class, String.class)) {
			driver.findElement(By.id("input-firstname")).sendKeys(dataValue.get("firstname"));
			driver.findElement(By.id("input-lastname")).sendKeys(dataValue.get("lastname"));
			driver.findElement(By.id("input-email")).sendKeys(dataValue.get("emailid")+ (int)(Math.random() * 1000) + "@gmail.com");
			driver.findElement(By.id("input-telephone")).sendKeys(dataValue.get("contact"));
			driver.findElement(By.id("input-password")).sendKeys(dataValue.get("password"));
			driver.findElement(By.id("input-confirm")).sendKeys(dataValue.get("confirm Password"));
			driver.findElement(By.xpath("//input[@type='radio' and @value='0']")).click();
			driver.findElement(By.xpath("//input[@type='checkbox' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
		}
	}

	public String getRegisterTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnLogoutLink()
	{
		driver.findElement(By.linkText("Logout")).click();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}

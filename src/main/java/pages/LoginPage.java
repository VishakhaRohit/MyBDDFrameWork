package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

//	public void openBrowser() {
//		 System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
//		 driver = new ChromeDriver();
//	}
//	
//	public void openLoginPage() {
//		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//	}

	public String getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println("Login Page title = " + actualTitle);
		return actualTitle;
	}
	
	public boolean isForgotPasswordLinkDisplayed()
	{
		return driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
	}
	
	public void enterEmailAndPassword(String email, String password) {
		
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
	}
	
	public void clickOnLoginButton(){
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	public String getAccoutPagetitle()
	{
		String actualTitle = driver.getTitle();
		System.out.println("Account Page title = " + actualTitle);
		return actualTitle;
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
}

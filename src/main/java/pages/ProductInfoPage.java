package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductInfoPage {

	WebDriver driver;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void openLoginPage() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	public String getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println("Login Page title = " + actualTitle);
		return actualTitle;
	}

	public void enterEmailAndPassword(String email, String password) {

		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
	}
	
	public void clickOnLoginButton(){
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	public void searchProduct(String productName)
	{
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.xpath("//span[@class='input-group-btn']")).click();
	}
	
	public void clickOnProduct()
	{
		driver.findElement(By.linkText("MacBook")).click();
	}
	
	public String getProductInfoPageTitle()
	{
	    String productPageTitle = driver.getTitle();
	    return productPageTitle;
	}
	
	public void closeTheBrowser()
	{
		driver.quit();
	}
}

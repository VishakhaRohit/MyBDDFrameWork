package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProductPage {

	WebDriver driver;

	public SearchProductPage(WebDriver driver)
	{
		this.driver = driver;
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
	
	public String getAccoutPagetitle()
	{
		String actualTitle = driver.getTitle();
		System.out.println("Account Page title = " + actualTitle);
		return actualTitle;
	}
	
	public void searchProduct(String productName)
	{
		 driver.findElement(By.name("search")).sendKeys(productName);
		 driver.findElement(By.xpath("//span[@class='input-group-btn']")).click();
	}
	public void closeBrowser()
	{
		driver.close();
	}
	
}

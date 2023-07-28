package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.LoginPage;
import pages.ProductInfoPage;
import pages.RegistrationPage;
import pages.SearchProductPage;

	public class BaseTest {

		public WebDriver driver;
		public Properties prop;
		public LoginPage lp;
		public RegistrationPage rp;
		public SearchProductPage sp;
		public ProductInfoPage pp;
		
		public BaseTest() {
			
			readData();
			driver = initializeDriver();
			lp = new LoginPage(driver);
			rp = new RegistrationPage(driver);
			sp = new SearchProductPage(driver);
			pp = new ProductInfoPage(driver);
		}

		public WebDriver initializeDriver() {
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome")){
				 System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equals("Firefox")){
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\mygoa\\Desktop\\java\\seleniumDemo\\QA\\SeleniumJars\\geckodriver.exe");	
				driver = new FirefoxDriver(); 
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();			
			driver.get(prop.getProperty("url"));
			
			return driver;
		}
		
		public void readData()
		{
			try {

				File f = new File("C:\\QA\\SeleniumWorkSpace\\MyBDDFrameWork\\src\\test\\java\\config\\config.properties");
				FileInputStream fis = new FileInputStream(f);
				
				prop = new Properties();
				prop.load(fis);
				
				System.out.println(prop.getProperty("browser"));

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		public void quitBrowser(){
			driver.quit();
		}
	}
	



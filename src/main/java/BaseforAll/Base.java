package BaseforAll;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BDCollect_PageElements.Obj_Home_Page;
import BDCollect_PageElements.Obj_Login_Page;

public class Base extends Readproprties {

	public Logger logger = LogManager.getLogger(Base.class.getName());

	public WebDriver driver;

	String Browser;

	
	public void SelectBrowser() throws IOException {

		// Browser = Logprop.getProperty("Browser");

		admin_url();
		
		Browser = Logprop.getProperty("Browser");

		System.out.println(Logprop.getProperty("Browser"));

		if (Browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "/home/rupesh/chromedriver");

			driver = new ChromeDriver();

			logger.info("Chrome browser lounched");


		} else if (Browser.equals("FireFox")) {

			System.out.println("FireFox browser is Opened");

			System.setProperty("webdriver.firefox.marionette",
					"/home/rupesh/Desktop/RK082017/Selenium/Drivers/geckodriver.exe");

			driver = new FirefoxDriver();

			logger.info("Firefox browser lounched");

		} else if (Browser.equals("IE")) {

			System.out.println("IE browser is Opened");

			System.setProperty("webdriver.ie.driver",
					"/home/rupesh/Desktop/RK082017/Selenium/Drivers/IEDriverServer_x64_3.14.0/IEDriverServer.exe");

			driver = new InternetExplorerDriver();

			logger.info("InternetExplorer browser lounched");

		} else {

			System.out.println("No Browser Found");

		}
	}
	
	
	/*
	 * @BeforeTest public void beforeTest() throws IOException {
	 * 
	 * SelectBrowser();
	 * 
	 * driver.get(Logprop.getProperty("URL"));
	 * 
	 * logger.debug("Url entered successfully"); }
	 */
	
	Obj_Home_Page home;
	Obj_Login_Page login;
	
	@BeforeTest
	public void Verify_the_login() throws IOException {

		SelectBrowser();

		driver.get(Logprop.getProperty("URL"));

		logger.debug("Url entered successfully");

		login = new Obj_Login_Page(driver);

		login.UserId().sendKeys("a");

		logger.debug("UserId Entered");

		login.Password().sendKeys("a");

		logger.debug("passwoerd entered");

		login.LoginButton().click();

		logger.debug("clicked on login button");

		home = new Obj_Home_Page(driver);

		String username = home.getUserName().getText();

		Assert.assertEquals(username, "Rupesh Sharma");

		logger.info("User Name Verified ::::" + username);

	}

}
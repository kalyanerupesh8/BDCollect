package BDCollect_TestScenarios;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BDCollect_PageElements.Obj_Home_Page;
import BDCollect_PageElements.Obj_Login_Page;
import BaseforAll.Base;

public class Verify_the_Login_page_Element extends Base {

	Obj_Home_Page home;
	Obj_Login_Page login;

	//@Test
	public void Checkc_all_elements() throws IOException {

		SelectBrowser();

		driver.get(Logprop.getProperty("URL"));

		logger.debug("Url entered successfully");

		login = new Obj_Login_Page(driver);

		login.Logo().isDisplayed();

		logger.debug("BillDesk logo is Displayed");

		login.UserId().isDisplayed();

		logger.debug("UserId field is Present");

		login.Password().isDisplayed();

		logger.debug("Password field is Present");

		login.LoginButton().isDisplayed();

		logger.debug("Login button is present");

		String BDcollectTital = driver.getTitle();

		logger.debug("BdCollect page Tital::::" + BDcollectTital);

		Assert.assertEquals(BDcollectTital, "BDCollect", "BDCollect tital is missmatched");

	}

	/*
	 * @BeforeTest public void Verify_the_login() throws IOException {
	 * 
	 * SelectBrowser();
	 * 
	 * driver.get(Logprop.getProperty("URL"));
	 * 
	 * logger.debug("Url entered successfully");
	 * 
	 * login = new Obj_Login_Page(driver);
	 * 
	 * login.UserId().sendKeys("a");
	 * 
	 * logger.debug("UserId Entered");
	 * 
	 * login.Password().sendKeys("a");
	 * 
	 * logger.debug("passwoerd entered");
	 * 
	 * login.LoginButton().click();
	 * 
	 * logger.debug("clicked on login button");
	 * 
	 * home = new Obj_Home_Page(driver);
	 * 
	 * String username = home.getUserName().getText();
	 * 
	 * Assert.assertEquals(username, "Rupesh Sharma");
	 * 
	 * logger.info("User Name Verified ::::" + username);
	 * 
	 * }
	 */

}

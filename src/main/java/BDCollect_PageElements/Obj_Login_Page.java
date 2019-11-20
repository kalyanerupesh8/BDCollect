package BDCollect_PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Obj_Login_Page {
	
	WebDriver driver;
	
	public Obj_Login_Page(WebDriver driver) {
		
		this.driver = driver;

	}

	By UserId = By.name("userName");
	
	By Password = By.name("userPassword");

	By LoginButton = By.id("loginButton");
	
	By Logo = By.xpath("//img[@src =\"/bdcollect/bdCollect/admin/images/default-bank-logo.jpg\"]");
	
	
	public WebElement UserId(){
		
		return driver.findElement(UserId);
		
	}
	
	public WebElement Password() {

		return driver.findElement(Password);

	}

	public WebElement LoginButton() {

		return driver.findElement(LoginButton);

	}
	
	public WebElement Logo() {

		return driver.findElement(Logo);

	}

}

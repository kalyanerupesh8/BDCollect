package BDCollect_PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Obj_Student_Portal_login_Page {

	WebDriver driver;

	public Obj_Student_Portal_login_Page(WebDriver driver) {

		this.driver = driver;

	}

	By StudentNumber = By.xpath("//*[@class=\"form-control fieldVal\"]");

	By Student_DOB = By.xpath("//*[@class=\"form-control fieldVal datepicker\"]");

	By StudentPortalSubmitBtn = By.xpath("//*[@class=\"button btn-block bg-blue-700 signInBtn\"]");

	By NotificationPanl = By.xpath("//*[@class=\"panel-heading\"]");
	
	By NoticeNumber = By.xpath("//*[@id=\"form3\"]/div[2]/div/div/div[1]/div[2]/div[2]");
	
	By NoticeHeading = By.xpath("//*[@id=\"form3\"]/div[2]/div/div/div[1]/div[2]/div[3]");
	
	By CreatedOn = By.xpath("//*[@id=\"form3\"]/div[2]/div/div/div[1]/div[2]/div[1]");
	
	By readNotice = By.xpath("//*[@id=\"form3\"]/div[2]/div/div/div[2]/div[1]/div/label/input");
	
	By proceedbtn = By.xpath("//*[@id=\"form3\"]/div[2]/div/div/div[2]/div[2]/div/button");
	
	By noticeDownload = By.xpath("//a[@href=\"/bdcollect/pay?reqid=downloadNotice&method=downloadNotificationFile&mid=725&sid=RK101&fileName=509&reqtoken=bCa1tDScccfzXV5x3nUa&responseType=1\"]");

	
	public WebElement StudentNumber() {
		return driver.findElement(StudentNumber);

	}

	public WebElement Student_DOB() {
		return driver.findElement(Student_DOB);

	}

	public WebElement StudentPortalSubmitBtn() {

		return driver.findElement(StudentPortalSubmitBtn);
	}

	public WebElement NotificationPanl() {

		return driver.findElement(NotificationPanl);
	}
	
	public WebElement NoticeNumber() {

		return driver.findElement(NoticeNumber);
	}
	
	public WebElement NoticeHeading() {

		return driver.findElement(NoticeHeading);
	}
	
	public WebElement CreatedOn() {

		return driver.findElement(CreatedOn);
	}
	
	public WebElement readNotice() {

		return driver.findElement(readNotice);
	}
	
	public WebElement proceedbtn() {

		return driver.findElement(proceedbtn);
	}
	
	public WebElement noticeDownload() {

		return driver.findElement(noticeDownload);
	}
}

package BDCollect_PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseforAll.Base;

public class Obj_Notification_Page extends Base {

	WebDriver driver;	

	   public Obj_Notification_Page(WebDriver driver) {

			this.driver = driver;

		}
	   
	   By  Notifice_Number = By.xpath("//*[@name=\"noticeNumber\"]");
	   
	   By  Notifice_Heading = By.xpath("//*[@name=\"noticeHeading\"]");
	   
	   By  ChooseFile = By.xpath("//*[@id=\"file-2\"]");
	   
	   By  UploadBtn = By.xpath("//*[@id=\"upload_form\"]");
	   
	   By Individual_Notification = By.xpath("//*[contains(text(),\"Individual Notification\")]");
	   
	   By FileUploaded_Success = By.xpath("//span[contains(text(),' files uploaded successfully.')]");
	   
	   By FileUploaded_Error = By.xpath("//span[@id=\"emsg\"]");
	   
	   public WebElement Notice_Number() {

		return driver.findElement(Notifice_Number);
		  
	   }
	   
	   public WebElement Notice_Heading() {

			return driver.findElement(Notifice_Heading);
			  
		   }
	   
	   public WebElement ChooseFile() {

			return driver.findElement(ChooseFile);
			  
		   }
	   
	   public WebElement UploadBtn() {

			return driver.findElement(UploadBtn);
			  
		   }
	   
	   public WebElement Individual_Notification() {

			return driver.findElement(Individual_Notification);
			  
		   }
	   
	   public WebElement FileUploaded_Success() {

			return driver.findElement(FileUploaded_Success);
			  
		   }
	   
	   public WebElement FileUploaded_Error() {

			return driver.findElement(FileUploaded_Error);
			  
		   }
	
}

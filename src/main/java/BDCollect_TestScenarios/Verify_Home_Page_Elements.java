package BDCollect_TestScenarios;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.itextpdf.awt.geom.misc.RenderingHints.Key;

import BDCollect_PageElements.Obj_Home_Page;
import BDCollect_PageElements.Obj_Login_Page;
import BDCollect_PageElements.Obj_Notification_Page;
import BDCollect_PageElements.Obj_Student_Portal_login_Page;
import BaseforAll.Base;

public class Verify_Home_Page_Elements extends Base {

	Obj_Home_Page home;
	Obj_Login_Page login;
	Obj_Notification_Page notification;
	Obj_Student_Portal_login_Page StudentPrtl;

	static String ExistingFile;

	// @Test
	public void Check_all_elements_which_are_required_on_home_page() {

		home = new Obj_Home_Page(driver);

		home.HomePageLogo().isDisplayed();

		logger.debug("Home page billdesk logo is Displayed");

		String homepagetital = driver.getTitle();

		if (homepagetital.equalsIgnoreCase("BDCollect")) {

			logger.debug("Home page tital is verified ::::" + homepagetital);
		} else {

			logger.error("Home page tital is missmatched  ::::" + homepagetital);
		}

		String username = home.getUserName().getText();

		if (username.equalsIgnoreCase("Rupesh Sharma")) {

			logger.debug("User Name is Verified::::" + username);
		} else {

			logger.error("User Name is missmatched::::" + username);
		}

		home.Admin().isDisplayed();

		logger.debug("Admin menue is present in left side menue");

		home.Data().isDisplayed();

		logger.debug("Data menue is present in left side menue  bar ");

		home.Query().isDisplayed();

		logger.debug("Query menue is present in left side menue bar");

		home.Refund().isDisplayed();

		logger.debug("Refund menue is present in left side menue bar");

		home.Settlement().isDisplayed();

		logger.debug("Settlement menue is present in left side menue bar");

		home.Configuration().isDisplayed();

		logger.debug("Configuration menue is present in left side menue bar");

		home.Home().isDisplayed();

		logger.debug("Home menue is present in left side menue bar");

		home.Notification().isDisplayed();

		logger.debug("Notification menue is present in left side menue bar");

	}

	@Test
	public void Verify_Notification_process() throws IOException, InterruptedException {

		home = new Obj_Home_Page(driver);

		notification = new Obj_Notification_Page(driver);

		// Select college

		Select merchant = new Select(home.MerchantDrop());

		String mrchntName = Logprop.getProperty("MerchantName");

		logger.debug("merchant name" + mrchntName);

		merchant.selectByVisibleText(mrchntName);

		logger.debug("Merchant Selected Successfully");
		/*
		 * }
		 * 
		 * //@Test public void Verify_Notification_process1() throws IOException {
		 */

		/*
		 * String StudentportalURL = home.StudentPortalUrl().getText();
		 * 
		 * logger.debug("Student portal url::::"+StudentportalURL);
		 */

		// click on notification

		Thread.sleep(5000);

		home.Notification().click();

		logger.debug("Clicked on Notification menue from home page side bar");

		// verify the notification page heading

		if (notification.Individual_Notification().getText().equalsIgnoreCase("Individual Notification")) {

			logger.debug("Notification page heading Was correct" + notification.Individual_Notification().getText());
		} else {

			logger.debug("NOtification page heading was incoreect" + notification.Individual_Notification().getText());
		}

		// enter the notice number

		String ntcNumber = Logprop.getProperty("NoticeNumber");

		logger.debug("Notice Number field is Displayed and Notice number entered successfuly");

		notification.Notice_Number().sendKeys(ntcNumber);

		// enter the notice heading

		String ntcHeading = Logprop.getProperty("NoticeHeading");

		notification.Notice_Heading().sendKeys(ntcHeading);

		logger.debug("ntcHeading field is Displayed and notice heading entered successfully");

		String fileName = Logprop.getProperty("StudentNumber");

		String filepath = "/home/rupesh/Downloads/BDcollect Notofication/PDF/" + fileName + ".pdf";

		// choose uploading file

		// Create a new file
		PDDocument document = new PDDocument();
		document.addPage(new PDPage());
		document.save(filepath);

		System.out.println("PDF created");
		document.close();

		logger.debug("file create successfully");

		// Upload a file

		WebElement uploadElement = notification.ChooseFile();

		// enter the file path onto the file-selection input field

		uploadElement.sendKeys(filepath);

		logger.debug("File selected successfully");

		// click on upload

		notification.UploadBtn().click();

		logger.debug("Clicked on upload button");

		String UploadSuccess = notification.FileUploaded_Success().getText();

		String Exptd_Scs_Msg = fileName + ".pdf files uploaded successfully.";

		logger.debug("file uploaded successfully::::" + fileName + ".pdf");

		if (UploadSuccess.equalsIgnoreCase("Exptd_Scs_Msg")) {

			logger.debug("fileuploaded Successfully" + UploadSuccess);

		} else {

			String errfile = notification.FileUploaded_Error().getText();

			logger.error("File not uploaded" + errfile);

			if (errfile.equalsIgnoreCase(fileName + ".pdf files not uploaded.")) {

				logger.debug("Error message displayed successfully");

			} else {

				logger.error("Error message incorrect");
			}
		}
		// hit the Student portal url

		driver.get(Logprop.getProperty("Student_Portal"));

		// enter student id

		StudentPrtl = new Obj_Student_Portal_login_Page(driver);

		StudentPrtl.StudentNumber().sendKeys(Logprop.getProperty("StudentNumber"));
		// enter DOB
		StudentPrtl.Student_DOB().sendKeys(Logprop.getProperty("DOB"));

		// click on submit button

		StudentPrtl.StudentPortalSubmitBtn().click();
		// verify the Notice Number
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("//*[@id=\\\"form3\\\"]/div[2]/div/div/div[1]/div[2]/div[2]")));

		String PnoticeNumber = StudentPrtl.NoticeNumber().getText();

		if (PnoticeNumber.equalsIgnoreCase(ntcNumber)) {

			logger.debug("Notice number matched");
		} else {

			logger.debug("Notice number not matched");
		}
		// verify the Notice heading

		String PnoticeHeading = StudentPrtl.NoticeHeading().getText();

		if (PnoticeHeading.equalsIgnoreCase(ntcHeading)) {

			logger.debug("Notice heading matched");
		} else {

			logger.debug("Notice heading not matched");
		}

		// verify the download link

		

		StudentPrtl.noticeDownload().isDisplayed();

		logger.debug("Notification Download link Displayed");

		// verify the check box

		StudentPrtl.readNotice().click();

		logger.debug("Read Notice check box is checkked");
		// verify the proceed button

		StudentPrtl.proceedbtn().click();

		logger.debug("Click on Proceed button");

	}
}

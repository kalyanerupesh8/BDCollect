package BDCollect_PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class Obj_Home_Page {
	
   WebDriver driver;	

   public Obj_Home_Page(WebDriver driver) {

		this.driver = driver;

	}

	By UserName = By.xpath("//a[@href='javascript:;']");

	By LogOut = By.xpath("//a[@onclick=\"openLink('logout')\"]");

	By changePassword = By.xpath("//a[@onclick=\"openLink('changePassword')\"]");
	
	By LogOutPage = By.xpath("//*[contains(text(),'You have been logged out successfully. Please click below to login again!')]");
	
	

	By SelectCalender = By.xpath("//*[@id=\"reservation\"]");

	// Calender (Select the Days which you want to see the graph details)

	By Today = By.xpath("//li[contains(text(),'Today')]");
	
	By Yesterday = By.xpath("//li[contains(text(),'Yesterday')]");
	
	By Last_7_Days = By.xpath("//li[contains(text(),'Last 7 Days')]");
	
	By Last_30_Days = By.xpath("//li[contains(text(),'Last 30 Days')]");
	
	By This_Month = By.xpath("//li[contains(text(),'This Month')]");
	
	By Last_Month = By.xpath("//li[contains(text(),'Last Month')]");
	
	By Custom_Range = By.xpath("//li[contains(text(),'Custom Range')]");
	

	By From_Date = By.xpath("//input[@name=\"daterangepicker_start\"]");
	
	By End_Date = By.xpath("//input[@name=\"daterangepicker_end\"]");
	

	By Date_Apply = By.xpath("//*[contains(text(),'Apply')]");
	
	By Date_Cancel = By.xpath("//*[contains(text(),'Cancel')]");
	
	By studentURL = By.cssSelector("studentURL");

	
	By HomePageLogo = By.xpath("//a[@class=\"logo\"]");
	By menuToggle  = By.cssSelector(".fa.fa-bars");
	By menuMinimize = By.cssSelector(".nav-sm");
    By menuMaximize = By.cssSelector(".nav-md");
    By MerchantDrop = By.xpath("//*[@id=\"merchant\"]");
    By FormDropDown = By.xpath("//*[@id=\"formsDrdn\"]");
    By Gross_RevenueTable = By.xpath("//*[text()='Gross Revenue & Transactions']");
    By RevenueGraph = By.cssSelector(".highcharts-background");
    By Amount =  By.xpath("//*[@id ='totalAmt']");
    By Transaction = By.xpath("//*[@id ='totalTxns']");
    By AverageTxn = By.xpath("//*[@id ='avg']");
    By PaymentMode = By.cssSelector(".col-md-7.col-sm-12.col-xs-12");
    
    
    By Profile = By.cssSelector(".fa.fa-angle-down.arroHSw_p-p");
    
    By Home = By.xpath("//span[contains(text(),'Home')]");
    By Data = By.xpath("//a[contains(text(),'Data')]");
    By Query = By.xpath("//a[contains(text(),' Query')]");
    By Refund = By.xpath("//a[contains(text(),' Refund')]");
    By Settlement = By.xpath("//a[contains(text(),'Settlement')]");
    By Configuration = By.xpath("//a[contains(text(),'Configuration')]");
    By Admin = By.xpath("//a[contains(text(),' Admin ')]");
    By Notification = By.xpath("//span[contains(text(),\"Notification\")]");
    
    By StudentPortalUrl = By.xpath("//*[@id=\"studentPortalURL\"]");
    
	/*
	 * public WebElement FeeUploadSetting() {
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 10);
	 * 
	 * wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
	 * FeeUploadSetting)));
	 * 
	 * return driver.findElement(FeeUploadSetting);
	 * 
	 * }
	 * 
	 * public WebElement AdhocForm() {
	 * 
	 * return driver.findElement(AdhocForm);
	 * 
	 * }
	 * 
	 * public WebElement GeneralSetting() {
	 * 
	 * return driver.findElement(GeneralSetting);
	 * 
	 * }
	 * 
	 * public WebElement EditDetails() {
	 * 
	 * return driver.findElement(EditDetails);
	 * 
	 * }
	 * 
	 * public WebElement UploadSettings() {
	 * 
	 * return driver.findElement(UploadSettings);
	 * 
	 * }
	 */
    public WebElement Admin() {

		return driver.findElement(Admin);

	}
    
    public WebElement Configuration() {

		return driver.findElement(Configuration);

	}
    
    public WebElement Settlement() {

		return driver.findElement(Settlement);

	}
    
    public WebElement Refund() {

		return driver.findElement(Refund);

	}
    
    
    public WebElement Query() {

		return driver.findElement(Query);

	}
    
    public WebElement Data() {

		return driver.findElement(Data);

	}
    
    public WebElement Home() {

		return driver.findElement(Home);

	}
    
    public WebElement Notification() {

		return driver.findElement(Notification);

	}
    
    public WebElement Profile() {

		return driver.findElement(Profile);

	}
    
    public WebElement StudentPortalUrl() {

		return driver.findElement(StudentPortalUrl);

	}
    
    public WebElement PaymentMode() {

		return driver.findElement(PaymentMode);

	}
    
    public WebElement AverageTxn() {

		return driver.findElement(AverageTxn);

	}
    
    public WebElement Transaction() {

		return driver.findElement(Transaction);

	}
    
    public WebElement Amount() {

		return driver.findElement(Amount);

	}
    
    public WebElement RevenueGraph() {

		return driver.findElement(RevenueGraph);

	}
    
    public WebElement Gross_RevenueTable() {

		return driver.findElement(Gross_RevenueTable);

	}
    
    public WebElement FormDropDown() {

		return driver.findElement(FormDropDown);

	}
    
    public WebElement MerchantDrop() {

		return driver.findElement(MerchantDrop);

	}
    
    public WebElement menuMaximize() {

		return driver.findElement(menuMaximize);

	}
    
    public WebElement menuMinimize() {

		return driver.findElement(menuMinimize);

	}
    
    public WebElement menuToggle() {

		return driver.findElement(menuToggle);

	}
    
    public WebElement HomePageLogo() {

		return driver.findElement(HomePageLogo);

	}
	

	public WebElement getUserName() {

		return driver.findElement(UserName);

	}

	public WebElement getLogOutPage() {

		return driver.findElement(LogOutPage);

	}

	public WebElement getchangePassword() {

		return driver.findElement(changePassword);

	}
	
	public WebElement getLogOut() {

		return driver.findElement(LogOut);

	}

	public WebElement getCalender() {

		return driver.findElement(SelectCalender);

	}

	public WebElement getToday() {

		return driver.findElement(Today);

	}

	public WebElement getYesterday() {

		return driver.findElement(Yesterday);

	}

	public WebElement getLast_7_Days() {

		return driver.findElement(Last_7_Days);

	}

	public WebElement getLast_30_Days() {

		return driver.findElement(Last_30_Days);

	}

	public WebElement getThis_Month() {

		return driver.findElement(This_Month);

	}

	public WebElement getLast_Month() {

		return driver.findElement(Last_Month);

	}

	public WebElement getCustom_Range() {

		return driver.findElement(Custom_Range);

	}

	public WebElement getFrom_Date() {

		return driver.findElement(From_Date);

	}

	public WebElement getEnd_Date() {

		return driver.findElement(End_Date);

	}

	public WebElement getDate_Apply() {

		return driver.findElement(Date_Apply);

	}

	public WebElement getDate_Cancel() {

		return driver.findElement(Date_Cancel);

	}
	
}

package Payment_gatwway_all_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Birth_date_blank_continue_button_disable_show_LTC {

WebDriver driver;
	
	@FindBy(id="cardNumber")
	WebElement cardnumber;
	
	@FindBy(xpath="//input[@placeholder='Expiry']")
	WebElement Expirydate;
	
	@FindBy(xpath="//input[@placeholder='cvv*']")
	WebElement CVV;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement FIRSTname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement LAstname;
	
	@FindBy(xpath="(//select[@class='ng-untouched ng-pristine ng-invalid'])[1]")
	WebElement CountryDropdown;
	
	@FindBy(xpath="//select[@formcontrolname='state']")
	WebElement STatedropdown;
	
	@FindBy(xpath="//select[@formcontrolname='city']")
	WebElement CITYdropdown;
	
	@FindBy(xpath="//input[@formcontrolname='zip']")
	WebElement zipcode;
	
	@FindBy(xpath="//input[@formcontrolname='street']")
	WebElement STREETfield;
	
	@FindBy(xpath="//input[@formcontrolname='emailAddress']")
	WebElement Emailid;
	
	@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
	WebElement phonenumber;
	
	@FindBy(xpath="//input[@data-mat-calendar='mat-datepicker-0']")
	WebElement Calender;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement continuebutton;
	
	@FindBy(xpath = "//mat-error[text()='Enter valid Email Address']")
	WebElement Emailfield_errorMessage;
	
	
	public Birth_date_blank_continue_button_disable_show_LTC(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterDATA() throws InterruptedException {
		cardnumber.sendKeys("4001919257537193");
		Expirydate.sendKeys("12/26");
		CVV.sendKeys("465");
		FIRSTname.sendKeys("pravin");
		LAstname.sendKeys("lavate");
		Thread.sleep(2000);
		Select s=new Select(CountryDropdown);
		s.selectByVisibleText("India");
		Thread.sleep(2000);
		
		Select s1=new Select(STatedropdown);
		s1.selectByVisibleText("Maharashtra");
		
		Thread.sleep(2000);
		Select s2=new Select(CITYdropdown);
		s2.selectByVisibleText("Achalpur");
		
		Thread.sleep(2000);
		
		
	    zipcode.sendKeys("1234567");
		STREETfield.sendKeys("mg road ");
		Emailid.sendKeys("pravinl@nu10.co");
		//Emailid.sendKeys(Keys.ENTER);
		
		phonenumber.sendKeys("9970076686");
		
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[@aria-label='Open calendar']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@aria-label='1999']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()=' JAN ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		
		Reporter.log("Birth date field  is Blank",true);
		
		Thread.sleep(1000);
	}
	
	public void clickoncontinuebutton() {
		continuebutton.click();
	}
	
//	public void Email_error_message() {
//       if (Emailfield_errorMessage.isDisplayed()) {
//    	   String mesg = Emailfield_errorMessage.getText();
//    	   System.out.println("Error message is  :: "+mesg);
//			
//			System.out.println("Email field Error message is showing when its blank " );
//				
//		}
//		else {
//			System.out.println("Email field  Error message is not showing ");
//		}
//       
//       String expected_result="Enter valid Email Address";
//       
//       String mesg = Emailfield_errorMessage.getText();
//       
//       String actual_result=mesg;
//       Assert.assertEquals(expected_result, actual_result, "Error message is not match");
//       Reporter.log("Pass- Check in Email id field, mandatory field is marked with a red asterisk symbol.",true);
//	}
	public void continuebutton_status() {
	
		if (continuebutton.isEnabled()) {
			
			System.out.println("contiune button is enable " );
			 Reporter.log("Pass- Check that without  selecting date ,continue button is disable .",true);	
		}
		else {
			System.out.println("contiune button is disable");
			 Reporter.log("failed- Check that without  selecting date ,continue button is disable .",true);	

		}
	}


}

package Payment_gatwway_all_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Cardnumber_field_blank_error_message_show {
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
	
	@FindBy(xpath = "//mat-error[text()='Please enter valid Card Number']")
	WebElement cardnumber_field_errorMessage;
	
	
	public Cardnumber_field_blank_error_message_show(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterDATA() throws InterruptedException {
		cardnumber.sendKeys(Keys.ENTER);
		//cardnumber.sendKeys("4001919257537193");
		Reporter.log("Card number field is Blank",true);
		Expirydate.sendKeys("12/26");
		CVV.sendKeys("465");
		FIRSTname.sendKeys("pravin");
		LAstname.sendKeys("lavate");
		
		Select s=new Select(CountryDropdown);
		s.selectByVisibleText("India");
		
		
		Select s1=new Select(STatedropdown);
		s1.selectByVisibleText("Maharashtra");
		
		
		Select s2=new Select(CITYdropdown);
		s2.selectByVisibleText("Achalpur");
		
		Thread.sleep(2000);
		
		
	    zipcode.sendKeys("1234567");
		STREETfield.sendKeys("mg road ");
		Emailid.sendKeys("pravinl@nu10.co");
		phonenumber.sendKeys("9970076686");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='Open calendar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='1999']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' JAN ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		
		Thread.sleep(4000);
	}
	
	
	
	public void Cardnumber_error_message() {
		
		
       if (cardnumber_field_errorMessage.isDisplayed()) {
    	   String mesg = cardnumber_field_errorMessage.getText();
    	   System.out.println("Error message is  :: "+mesg);
			
			System.out.println("cardnumber field Error message is showing when its blank " );
			Reporter.log("passed-button is disabled without entering Card number",true);	
		}
		else {
			System.out.println("cardnumber field  Error message is not showing ");
			Reporter.log("Failed-button is disabled without entering Card number",true);
		}
		
       String expected_result="Please enter valid Card Number";
       String mesg = cardnumber_field_errorMessage.getText(); 
       String actual_result=mesg; 
       Assert.assertEquals(expected_result, actual_result, "Error message is not match");
       Reporter.log("Passed-Verify that by without entering card number on card number field its should be show error message.",true);  
    
	}
	public void continuebutton_status() {
	
		if (continuebutton.isEnabled()) {
			
			System.out.println("contiune button is enable " );
				
		}
		else {
			System.out.println("contiune button is disable");
		}
	}
}

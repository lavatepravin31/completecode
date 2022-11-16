package Payment_gatwway_all_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class state_dropdown_blank_error_message {
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
	
	@FindBy(xpath = "//mat-error[text()='Select State']")
	WebElement statedropdown_errorMessage;
	
	
	public state_dropdown_blank_error_message(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterDATA() throws InterruptedException {
		cardnumber.sendKeys("4001919257537193");
		Expirydate.sendKeys("12/26");
		CVV.sendKeys("465");
		FIRSTname.sendKeys("pravin");
		LAstname.sendKeys("lavate");
		Thread.sleep(2000);
		
//		Select s=new Select(CountryDropdown);
//		s.selectByVisibleText("India");
		driver.findElement(By.xpath("//select[@formcontrolname='country']")).click();
		
		driver.findElement(By.xpath("//select[@formcontrolname='state']")).click();

		Reporter.log("country drop down is not selected ");
		Reporter.log("state drop down is not selected ");
		
		Thread.sleep(2000);
//		Select s1=new Select(STatedropdown);
//		s1.selectByVisibleText("Maharashtra");
//		Thread.sleep(2000);
//		
//		Select s2=new Select(CITYdropdown);
//		s2.selectByVisibleText("Achalpur");
//		
//		Thread.sleep(2000);
		
		
		 zipcode.sendKeys("1234567");
		//zipcode.sendKeys(Keys.ENTER);
		
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
	
	
	
	public void statedropdown_error_message() {
       if (statedropdown_errorMessage.isDisplayed()) {
    	   String mesg = statedropdown_errorMessage.getText();
    	   System.out.println("Error message is  :: "+mesg);
			
			System.out.println("state Error message is showing when its blank " );
				
		}
		else {
			System.out.println("state Error message is not showing ");
		}
       

       String expected_result="Select State";
       String mesg = statedropdown_errorMessage.getText();
       String actual_result=mesg;
       Assert.assertEquals(expected_result, actual_result, "Error message is not match");
       Reporter.log("Error message is  : "+actual_result,true);
       Reporter.log("Pass- Verify that  without selecting state ,  its should  show error message.",true);		
	
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





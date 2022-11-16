package DEmo_QA_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class invalid_cvv_pom14 {

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
	
	@FindBy(xpath="//mat-error[text()='Please enter valid CVV']")
	WebElement errormessagecvv;
	
	
	public invalid_cvv_pom14(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterDATA() throws InterruptedException {
		cardnumber.sendKeys("4001919257537193");
		Expirydate.sendKeys("12/26");
		CVV.sendKeys("4");
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
	
	public void errormessagecvv() {
		String e1 = errormessagecvv.getText();
		System.out.println("error message is :"+e1);
	}
	public void clickoncontinuebutton() {
		boolean d1 = continuebutton.isEnabled();
		
		System.out.println("stsus of continue buttton: "+d1);
	}
}



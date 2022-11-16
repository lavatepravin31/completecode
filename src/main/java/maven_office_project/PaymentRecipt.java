package maven_office_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentRecipt {

	WebDriver driver;
	
//	@FindBy(xpath="//input[@name='name']")
//	WebElement namefiled;
//	
//	@FindBy(xpath="//input[@name='email']") 
//	WebElement mailfield;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement paybutton;
//	
//	@FindBy (xpath="//button[@type='submit']")
//	WebElement amountfield;
	
	
	public PaymentRecipt(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void paymentbuttonclick() {
//		namefiled.clear();
//		namefiled.sendKeys("pravin lavate");
//		mailfield.clear();
//		mailfield.sendKeys("pravinl@nu10.co");
//		amountfield.clear();
//		amountfield.sendKeys("12.5");
		paybutton.click();
	}
}

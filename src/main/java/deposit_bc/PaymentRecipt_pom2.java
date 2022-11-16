package deposit_bc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentRecipt_pom2 {

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
	
	
	public PaymentRecipt_pom2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void paymentbuttonclick() {
		
		paybutton.click();
	}
}

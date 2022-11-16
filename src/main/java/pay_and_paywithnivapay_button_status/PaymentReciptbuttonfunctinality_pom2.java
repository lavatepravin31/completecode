package pay_and_paywithnivapay_button_status;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentReciptbuttonfunctinality_pom2 {

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
	
	
	public PaymentReciptbuttonfunctinality_pom2(WebDriver driver) {
		this.driver=driver;
	}
	public void buttonfunctionality()
	{
		boolean status = paybutton.isEnabled();
		
		if (status==true) {
			
			System.out.println(" pay button is enable");	
		}
		else {
			System.out.println(" pay button is disable");	
		}
	}
}

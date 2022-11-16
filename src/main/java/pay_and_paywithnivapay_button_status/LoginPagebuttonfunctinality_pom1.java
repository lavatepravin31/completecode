package pay_and_paywithnivapay_button_status;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagebuttonfunctinality_pom1 {
	
	WebDriver driver;
	
	@FindBy(xpath="(//button[@type='button'])[1]") 
	WebElement paytomerchantbutton;
	
	
		public LoginPagebuttonfunctinality_pom1(WebDriver driver)
		{
			this.driver=driver;
		}
	
	public void clickOnaPaytoMerchant() {
		
		paytomerchantbutton.click();
	}

}

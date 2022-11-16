package DAshBoard_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Deposit_button_functinality_pom4 {
	WebDriver driver;
	
	@FindBy(xpath="(//span[text()='Deposit'])[1]")
	WebElement LTC_deposit;
	
	@FindBy(xpath="(//span[text()='Deposit'])[2]")
	WebElement bTC_deposit;
	
	public Deposit_button_functinality_pom4(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickonLTC_deposit_Button() {
		
		LTC_deposit.click();
	}

     public void clickon_BTC_deposit_Button() {
		
    	 bTC_deposit.click();
	}
     public void clickon_lTC_deposit_Button() {
 		
    	 bTC_deposit.click();
	}
}

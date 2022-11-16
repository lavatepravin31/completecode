package DAshBoard_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Deposit_screen_pom5 {
	WebDriver driver;
	 
	@FindBy(xpath = "//span[text()='Deposit']")
	WebElement deposite_Btc_landing_page;
	
	@FindBy(xpath = "//span[text()='Deposit']")
	WebElement deposite_ltc_landing_page;
	
	
	
	public Deposit_screen_pom5(WebDriver driver)
	{
		this.driver=driver;
	}

	public void status_clickon_BTC_Deposit_Button() {
		
		if (deposite_Btc_landing_page.isDisplayed()) {
			
			System.out.println("User is landing on deposit window ,so deposit button is clickable");
			Reporter.log( "Passed-Check that functinality of Deposit button.(btc )", true ); 

		}
		else {
			System.out.println("User is not landing on deposit window  ,so deposit button is not clickable");
		}
		
	}
		
		public void status_clickon_LTC_Deposit_Button() {
			
			if (deposite_ltc_landing_page.isDisplayed()) {
				
				System.out.println("User is not landing on deposit window  ,so deposit button is not clickable");
				Reporter.log( "Passed-Check that functinality of Deposit button.(Ltc )", true ); 

			}
			else {
				System.out.println("User is not landing on deposit window  ,so deposit button is not clickable");
			}
	}

	
	
}

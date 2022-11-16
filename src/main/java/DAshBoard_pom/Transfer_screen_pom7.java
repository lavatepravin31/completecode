package DAshBoard_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class Transfer_screen_pom7 {

	WebDriver driver;
	 
	@FindBy(xpath = "")
	WebElement Transfer_Btc_landing_page;
	
	@FindBy(xpath = "")
	WebElement Transfer_Ltc_landing_page;
	
	
	
	public Transfer_screen_pom7(WebDriver driver)
	{
		this.driver=driver;
	}

	public void status_clickon_BTC_Transfer_Button() {
		
		boolean actual = Transfer_Btc_landing_page.isDisplayed();
		Assert.assertTrue(actual);
		
		if (Transfer_Btc_landing_page.isDisplayed()) {
			
			System.out.println("User is landing on transfer window ,so transfer button is clickable");
			Reporter.log("Transfer button is clickable ,user is landing on Transfer window ",true);
			Reporter.log("Passed-Check that Transfer  button functionality.",true);
			
		}
		else {
			System.out.println("User is not landing on transfer button  ,so transfer button is not clickable");
			Reporter.log("Transfer button is not  clickable ,user is not landing on Transfer window ",true);
			Reporter.log("Failed-Check that Transfer  button functionality.",true);
		}
		
	}
		
		public void status_clickon_LTC_Transfer_Button() {
			
			boolean actual = Transfer_Ltc_landing_page.isDisplayed();
			Assert.assertTrue(actual);
			
			if (Transfer_Ltc_landing_page.isDisplayed()) {
				
				System.out.println("User is landing on transfer window ,so transfer button is clickable");
				Reporter.log("Transfer button is clickable ,user is landing on Transfer window ",true);
				Reporter.log("Passed-Check that Transfer  button functionality.",true);
			}
			else {
				System.out.println("User is not landing on transfer button  ,so transfer button is not clickable");
				Reporter.log("Transfer button is not  clickable ,user is not landing on Transfer window ",true);
				Reporter.log("Failed-Check that Transfer  button functionality.",true);
			}
	}

}

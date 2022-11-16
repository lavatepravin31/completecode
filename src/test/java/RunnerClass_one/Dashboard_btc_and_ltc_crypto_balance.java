package RunnerClass_one;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import DAshBoard_pom.Avilable_balance_uncofirmed_balance;
import DAshBoard_pom.BTc_LTC_crypto_balance;
import LiberyFile.BaseClass;

public class Dashboard_btc_and_ltc_crypto_balance {
	WebDriver driver;
	
	  @Test
	  public void balance_on_dashboard() throws InterruptedException, IOException {
		 // driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2Njg0NDI3OCwiZXhwIjoxNjY2ODY1ODc4fQ.JoSu7zfXlzm6p1S4L8mx5DROlMPxzDI114gcTz3IIXw");
		  driver=BaseClass.Nivapay_Wallet_launch(0, 0, null);
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		  
		  
		  BTc_LTC_crypto_balance s1=PageFactory.initElements(driver, BTc_LTC_crypto_balance.class);
		  
		  s1.click_on_proceed_button();
		  
		  Thread.sleep(5000);
		  
		  s1.btc_crypto_balance();
		  s1.ltc_crypto_balance();
		  
		  BaseClass.TakesScreenShot();
		  Reporter.log("Passed-Verify tnat user can able to to see crypto balance for ltc & btc ");
		  driver.close();
	  }
}

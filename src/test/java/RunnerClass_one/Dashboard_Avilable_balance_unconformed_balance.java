package RunnerClass_one;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import DAshBoard_pom.Avilable_balance_uncofirmed_balance;
import LiberyFile.BaseClass;

public class Dashboard_Avilable_balance_unconformed_balance {
	
	WebDriver driver;
	
  @Test
  public void balance_on_dashboard() throws InterruptedException, IOException {
	//  driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2Njg0NDI3OCwiZXhwIjoxNjY2ODY1ODc4fQ.JoSu7zfXlzm6p1S4L8mx5DROlMPxzDI114gcTz3IIXw");
	  driver=BaseClass.Nivapay_Wallet_launch(0, 0, null);	
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  
	  
	  Avilable_balance_uncofirmed_balance s1=PageFactory.initElements(driver, Avilable_balance_uncofirmed_balance.class);
	  
	  s1.click_on_proceed_button();
	  
	  Thread.sleep(4000);
	  
	  s1.avilable_balance_showing();
	  s1.unconfirmed_balance_showing();
	  
	  BaseClass.TakesScreenShot();
	  
	  Reporter.log("Passed-Verify that user can able to see Avilable balance and unconfirmed balance .",true);
	  
	  driver.close();
  }
}

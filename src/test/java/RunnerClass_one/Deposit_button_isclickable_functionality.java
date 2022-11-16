package RunnerClass_one;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DEmo_QA_POM.DEMO_PurchaseScreeen_pom3;
import Deposit_all_pom.Deposit_Depositwindow_pom3;
import Deposit_all_pom.Deposit_dashboard_pom2;
import Deposit_all_pom.Deposit_pom1;
import LiberyFile.BaseClass;

public class Deposit_button_isclickable_functionality {
  
	 WebDriver driver;
	 
	 @BeforeClass
	 public void launchbrowser() throws InterruptedException, EncryptedDocumentException, IOException {

	 	//driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2NjMyODM0NiwiZXhwIjoxNjY2MzQ5OTQ2fQ.x37amfOLl_kdn8dKNCaafSf8DeGiho9TJQi04fpbTDk");
	 	driver=BaseClass.Nivapay_Wallet_launch(0, 0, null);
	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));	
	 	
	 }
	 
	 @BeforeMethod
	 public void click_on_proceedbutton() {
		 
		  Deposit_pom1 p1 = PageFactory.initElements(driver, Deposit_pom1.class);
		  p1.ClickONProceedButton();
		  
		  Deposit_dashboard_pom2 p2=PageFactory.initElements(driver, Deposit_dashboard_pom2.class);
		  p2.ClickONdepositButton();
	 }
	 	@Test
		public void launchBroswser() throws InterruptedException {
		
		
		  
		  Deposit_Depositwindow_pom3 p3=PageFactory.initElements(driver, Deposit_Depositwindow_pom3.class);
		//  p3.depositpage();
		  p3.validation();
		  p3.numberofdigitcurrency();
			 Reporter.log("Passed- Check that Deposit button functinality.",true);

		 			
		} 
		
		@AfterClass
		public void closebrowser() {
			driver.close();
		}
	
}

package RunnerClass_one;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LiberyFile.BaseClass;
import Payment_gatwway_all_pom.Cardnumber_Invalid_card_detail_error_message_show;
import Payment_gatwway_all_pom.PaymentGateway_Dashboard_pom2;
import Payment_gatwway_all_pom.Proceed_button_pom1;
import Payment_gatwway_all_pom.purchase_screen_pom3;

public class PAymentGateway_cardnumber_invalid_1_LTC {

	WebDriver driver;
	@BeforeClass
	public void openBrowser() throws InterruptedException, EncryptedDocumentException, IOException {
		driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2Njg0MjkwMzYsImV4cCI6MTY2ODQ1MDYzNn0.hGVvDuj30Q5HKjqI17T9Ufp3Z2b8Et3YKj83M3OmgRs");
		//driver=BaseClass.Nivapay_Wallet_launch(0, 0, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	
	@BeforeMethod
	public void clickon_proced_button() throws InterruptedException {
		
		Proceed_button_pom1 s1=PageFactory.initElements(driver, Proceed_button_pom1.class);
		s1.ClickONProceedButton();
		Thread.sleep(3000);
		PaymentGateway_Dashboard_pom2 s2=PageFactory.initElements(driver, PaymentGateway_Dashboard_pom2.class);
		s2.clickonLTCPurchaseButton();
		Thread.sleep(4000);
        purchase_screen_pom3 s3=PageFactory.initElements(driver, purchase_screen_pom3.class);
		s3.enteramount();
		Thread.sleep(3000);
		s3.clickONPurchaseBUtton();
		Thread.sleep(4000);
	}
	@Test
	public void cardnumber_error_message() throws InterruptedException {
		Cardnumber_Invalid_card_detail_error_message_show  s4=PageFactory.initElements(driver, Cardnumber_Invalid_card_detail_error_message_show.class);
        s4.enterDATA();
        s4.Cardnumber_error_message();
        s4.continuebutton_status();
	}
	@AfterMethod
	public void screenshot() throws IOException {
		
	//	Reporter.log("Passed-  Check in Card number, mandatory field is marked with a red asterisk symbol..",true);

		BaseClass.TakesScreenShot();
	}
	@AfterClass
	public void closebrowser() {
		
		driver.close();
	}
}







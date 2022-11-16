package RunnerClass_one;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DAshBoard_pom.Deposit_button_functinality_pom4;
import DAshBoard_pom.Deposit_screen_pom5;
import DAshBoard_pom.Verify_proced_button_pom1;
import LiberyFile.BaseClass;

public class Dashboard_Deposit_button_functinality_LTC {
	WebDriver driver;
	
	@BeforeClass
	public void launchbrowser() throws InterruptedException, EncryptedDocumentException, IOException {
		
	   // driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2Njg0NDI3OCwiZXhwIjoxNjY2ODY1ODc4fQ.JoSu7zfXlzm6p1S4L8mx5DROlMPxzDI114gcTz3IIXw");
		driver=BaseClass.Nivapay_Wallet_launch(0, 0, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));	
	}
	
	@BeforeMethod
	public void clickonprocedbutton() throws InterruptedException {
		
		Verify_proced_button_pom1 s1 = PageFactory.initElements(driver, Verify_proced_button_pom1.class);
        s1.ClickONProceedButton();
        Thread.sleep(3000);
        Deposit_button_functinality_pom4 s2=PageFactory.initElements(driver,Deposit_button_functinality_pom4.class);
         s2.clickon_lTC_deposit_Button();
	}
	
	@Test
	public void user_LANDING_STATUS() throws InterruptedException {
		
		Thread.sleep(5000);
		Deposit_screen_pom5 s3=PageFactory.initElements(driver, Deposit_screen_pom5.class);
		s3.status_clickon_LTC_Deposit_Button();
		
		//Reporter.log( "Ltc deposite button is clickable user land on deposit page,test case pass", true ); 
		Reporter.log( "Passed-Check that functinality of Deposit button.(Ltc )", true ); 

	}
	
	@AfterMethod
	public void takescreenshot() throws IOException, InterruptedException {
		Thread.sleep(2000);
		BaseClass.TakesScreenShot();
	}
	@AfterClass
	public void closebrowser() {
		
		driver.close();
	}
}

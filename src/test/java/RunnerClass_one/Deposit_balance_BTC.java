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
import org.xml.sax.ext.Attributes2;

import Deposit_all_pom.Deposit_Depositwindow_pom3;
import Deposit_all_pom.Deposit_dashboard_pom2;
import Deposit_all_pom.Deposit_pom1;
import LiberyFile.BaseClass;

public class Deposit_balance_BTC {
 
	WebDriver driver;
	@BeforeClass
	public void launchbrowser() throws InterruptedException, EncryptedDocumentException, IOException {

		//driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2NjMyODM0NiwiZXhwIjoxNjY2MzQ5OTQ2fQ.x37amfOLl_kdn8dKNCaafSf8DeGiho9TJQi04fpbTDk");
		driver=BaseClass.Nivapay_Wallet_launch(0, 0, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));	
	}
	@BeforeMethod
	public void click_On_proceedbutton() {
		  Deposit_pom1 p1 = PageFactory.initElements(driver, Deposit_pom1.class);
		  p1.ClickONProceedButton();  
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		  Deposit_dashboard_pom2  p2 = PageFactory.initElements(driver, Deposit_dashboard_pom2.class);
		  p2.ClickONdepositButton_BTC();
	}
	@Test
	public void btc_balance_show_deposit_window() {
		
		Deposit_Depositwindow_pom3 s2 =PageFactory.initElements(driver, Deposit_Depositwindow_pom3.class);
		s2.userLanding_depositpage();
		s2.DepositBalance();
	}
	@AfterMethod
	public void screenshot() throws IOException {
		 Reporter.log("Passed- Verify that user should be able to see btc balance on deposit window (BTC).",true);
		BaseClass.TakesScreenShot();
		
	}
	@AfterClass
	public void closebrowser() {
		
		driver.close();
	}
}

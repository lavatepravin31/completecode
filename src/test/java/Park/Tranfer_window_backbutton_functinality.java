package Park;

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
import Transfer_Window_all_pom.Click_on_tranfer_pom2;
import Transfer_Window_all_pom.Transfer_pom1;
import Transfer_Window_all_pom.avilable_balance_pom6;

public class Tranfer_window_backbutton_functinality {
  
	WebDriver driver;
	@BeforeClass
	public void openBrowser() throws InterruptedException, EncryptedDocumentException, IOException {
		//driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJhanVsZEBudTEwLmNvIiwiaWF0IjoxNjY3NDU5NDUwLCJleHAiOjE2Njc0ODEwNTB9.4j5kUmtWFVFowjtRQjN_s8razbXkx_RsyZ7hjDx7oY8");
		driver=BaseClass.Nivapay_Wallet_launch(0, 0, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	
	@BeforeMethod
	public void clickon_proced_button() throws InterruptedException {
		
		Transfer_pom1 s1=PageFactory.initElements(driver, Transfer_pom1.class);
		s1.ClickONProceedButton();
		Thread.sleep(4000);
		Click_on_tranfer_pom2 s2=PageFactory.initElements(driver, Click_on_tranfer_pom2.class);
		s2.ClickON_Transfer();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));  
	}
	@Test
	public void ltc_crypto_usd() throws InterruptedException {
		
		avilable_balance_pom6 s3=PageFactory.initElements(driver, avilable_balance_pom6.class);
		s3.ltc_crypto_usd();
		s3.Click_on_backnutton_();
		Thread.sleep(5000);
		Click_on_tranfer_pom2 s4=PageFactory.initElements(driver, Click_on_tranfer_pom2.class);
		s4.userlandingon_status();
	}
	@AfterMethod
	public void takescreenshot() throws IOException {
		BaseClass.TakesScreenShot();
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
}



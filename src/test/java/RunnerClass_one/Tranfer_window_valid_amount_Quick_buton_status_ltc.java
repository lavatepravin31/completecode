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
import Transfer_Window_all_pom.Click_on_tranfer_pom2;
import Transfer_Window_all_pom.Entering_Max_amount_error_message_show_pom5;
import Transfer_Window_all_pom.Transfer_pom1;

public class Tranfer_window_valid_amount_Quick_buton_status_ltc {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() throws InterruptedException, EncryptedDocumentException, IOException {
		//driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJhanVsZEBudTEwLmNvIiwiaWF0IjoxNjY3MzcyMzExLCJleHAiOjE2NjczOTM5MTF9.68cAWFQofB-CWRhXDzHiup3iDE5LaxovZdEfJR_4K04");
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
	public void max_amount_error() throws InterruptedException {
		Entering_Max_amount_error_message_show_pom5 s5 =PageFactory.initElements(driver, Entering_Max_amount_error_message_show_pom5.class);
		s5.ClickON_Dropdown();
		s5.enter_correct_amount();
		s5.avilable_balance();
		Thread.sleep(4000);
	//	s5.Errormessage_status();
		
		s5.Quicktransfer_button_status();	
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


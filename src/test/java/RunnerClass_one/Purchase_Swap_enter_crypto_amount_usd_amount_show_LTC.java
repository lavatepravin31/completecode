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
import Purchase_screen_all_pom.DEmo_DashBoard_page_pom2;
import Purchase_screen_all_pom.Proceedbutton_Page_pom1;
import Purchase_screen_all_pom.Purchase_screen_crypto_to_usd_swap;

public class Purchase_Swap_enter_crypto_amount_usd_amount_show_LTC {
 
	WebDriver driver;
	@BeforeClass
	public void launchbrwser() throws InterruptedException, EncryptedDocumentException, IOException {
		
		//driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2NjM0Njk5MSwiZXhwIjoxNjY2MzY4NTkxfQ.hIt33j_AAKUZpqpg2_roIFSvNxHwDjy7EngZOWbUmWo");
		driver=BaseClass.Nivapay_Wallet_launch(0, 0, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	
	@BeforeMethod
	public void clickonProceddbutton() throws InterruptedException {
		
		Proceedbutton_Page_pom1 d1= PageFactory.initElements (driver,Proceedbutton_Page_pom1.class);
		d1.ClickONProceedButton();
		Thread.sleep(3000);
		
		DEmo_DashBoard_page_pom2 s1=PageFactory.initElements (driver,DEmo_DashBoard_page_pom2.class);
		s1.clickon_LTC_PurchaseButton();
	}
	@Test
	public void avilable_balance() throws InterruptedException {
		
		Purchase_screen_crypto_to_usd_swap s2=PageFactory.initElements (driver,Purchase_screen_crypto_to_usd_swap.class);
		s2.Enter_crypto();
		Thread.sleep(3000);
		s2.Status_purchase_buttto();
		Thread.sleep(3000);
	}
	@AfterMethod
	public void takescreenshot() throws IOException {
		//Reporter.log("Passed-Verify that user should not enter String value in amount field then purchase button is enable.(BTC)",true);

		BaseClass.TakesScreenShot();
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
	
}








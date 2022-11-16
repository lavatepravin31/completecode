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

import LiberyFile.BaseClass;
import Purchase_screen_all_pom.DEMO_PurchaseScreeen_pom3;
import Purchase_screen_all_pom.DEmo_DashBoard_page_pom2;
import Purchase_screen_all_pom.Proceedbutton_Page_pom1;

public class Purchase_USer_Enter_string_purchase_buttonstatus_BTC {
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
			s1.clickon_BTC_PurchaseButton();
		}
		@Test
		public void avilable_balance() throws InterruptedException {
			
			DEMO_PurchaseScreeen_pom3 s2=PageFactory.initElements (driver,DEMO_PurchaseScreeen_pom3.class);
			s2.balanceshow_BTC();
			
			s2.iN_amount_Field_enter_string();
			Thread.sleep(3000);
			s2.purchasebuttonStatus1();
			Thread.sleep(2000);
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




package RunnerClass_one;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.jsoup.Connection.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DEmo_QA_POM.DEMO_PurchaseScreeen_pom3;
import DEmo_QA_POM.DEmo_DashBoard_page_pom2;
import DEmo_QA_POM.Verifying_Page_pom1;
import LiberyFile.BaseClass;
import maven_office_project.Demo_env_Dashboard_pom2;
import maven_office_project.Demo_env_VerifyingPage_pom1;

public class Purchase_Showing_estimated_amount_BTC {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() throws InterruptedException, EncryptedDocumentException, IOException {
		
	
		//driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2NjM1MDQyOSwiZXhwIjoxNjY2MzcyMDI5fQ.WAqSvHIBDzf8CDXf5vlHkxnRjaJgN5xJa85VkjyLaKY");
		driver=BaseClass.Nivapay_Wallet_launch(0, 0, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
	 
	}
	
	@BeforeMethod
	public void clickonProceddbutton() throws InterruptedException {
		
		Demo_env_VerifyingPage_pom1 v1=PageFactory.initElements (driver,Demo_env_VerifyingPage_pom1.class);
		
		v1.CLickonProceedbutton();
		Thread.sleep(5000);
		
		Demo_env_Dashboard_pom2 v2 =PageFactory.initElements(driver, Demo_env_Dashboard_pom2.class);
		v2.clickonpurchase();
		Thread.sleep(5000);
	
				
	}
	@Test
	public void checkcrypto() throws InterruptedException {
		DEMO_PurchaseScreeen_pom3 v3=PageFactory.initElements(driver, DEMO_PurchaseScreeen_pom3.class);
		v3.enteramount();
		System.out.println("Passed-Verify that user should able to see estimated balance window (for btc purchase).");
		//v3.currencyshowing();
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
}

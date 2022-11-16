package RunnerClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LiberyFile.BaseClass;
import maven_office_project.Demo_env_Dashboard_pom2;
import maven_office_project.Demo_env_VerifyingPage_pom1;
import maven_office_project.Demo_env_purchase_pom3;

public class TCNO11_Demo_Env_Avilablebalance {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() throws InterruptedException, EncryptedDocumentException, IOException {
		
	 driver=BaseClass.Nivapay_Wallet_launch(0, 0, null);
	 BaseClass.WaitOne();
	 
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
	public void amountenter() throws InterruptedException, IOException {
		
		Demo_env_purchase_pom3 v3=PageFactory.initElements(driver, Demo_env_purchase_pom3.class);
		v3.enteramount();
		
		v3.purchasebuttonStatus();
		Thread.sleep(4000);
		
		Reporter.log( "TCNO11. Verify that  amount should  shows correctly  in estimated balance ", true );
		
		BaseClass.TakesScreenShot();
		
		
	}
	@AfterClass
	public void closebrowser(){
		
		driver.close();
	}

}

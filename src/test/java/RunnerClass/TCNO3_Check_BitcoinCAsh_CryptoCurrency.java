package RunnerClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LiberyFile.BaseClass;
import deposit_bc.LoginPageBTC_pom1;
import deposit_bc.PaymentRecipt_pom2;
import deposit_bc.QuickpayBTC_pom3;
import deposit_bc.QuickpayBitcoinCASH_pom6;

public class TCNO3_Check_BitcoinCAsh_CryptoCurrency {
	WebDriver driver;
	
	@BeforeClass
	public void launchBroswser() throws InterruptedException {
		
		driver=BaseClass.Launchbrowserall("http://demo-web-alb-293560000.us-east-1.elb.amazonaws.com:3000/");
		Thread.sleep(3000);
	}
  
	@BeforeMethod
	public void clickononpaybutton() throws InterruptedException {
		
		LoginPageBTC_pom1 p1=PageFactory.initElements(driver, LoginPageBTC_pom1.class);
		p1.clickOnaPaytoMerchant();
		
		PaymentRecipt_pom2 p2=PageFactory.initElements(driver, PaymentRecipt_pom2.class);
		p2.paymentbuttonclick();
		
		
		QuickpayBTC_pom3 p3=PageFactory.initElements(driver, QuickpayBTC_pom3.class);
		p3.selectbtccurrency();
		Thread.sleep(3000);
		p3.paybuttonclick();
	
	}
	
	@Test
	public void btccryptocurrency() throws InterruptedException {
		Thread.sleep(3000);
		QuickpayBitcoinCASH_pom6 p4=PageFactory.initElements(driver, QuickpayBitcoinCASH_pom6.class);
		p4.cryptocurrecyobtc();
		
	}
	
	
	@AfterMethod
	public void screenshot() throws IOException {
		BaseClass.TakesScreenShot();
		
		
		Reporter.log( "TCNO3_Verify that same currency should shows which currency selected by user. ", true );
	}

	@AfterClass
	public void closebrowser() {
		
		driver.close();
	}
}

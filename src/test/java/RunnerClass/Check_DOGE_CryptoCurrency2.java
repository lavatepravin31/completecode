package RunnerClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
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
import deposit_bc.QuickpayDOGE_pom7;

public class Check_DOGE_CryptoCurrency2 {
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
		
		
		QuickpayDOGE_pom7 p3=PageFactory.initElements(driver, QuickpayDOGE_pom7.class);
		p3.selectdogecurrency();
		Thread.sleep(3000);
		p3.paybuttonclick();
		
		
	}
	
	@Test
	public void DOGEcryptocurrency() throws InterruptedException {
		Thread.sleep(3000);
		QuickpayDOGE_pom7 p4=PageFactory.initElements(driver, QuickpayDOGE_pom7.class);
		p4.cryptocurrecyodoge();
		
	}
	
	
	@AfterMethod
	public void screenshot() throws IOException {
		BaseClass.TakesScreenShot();
	}

	@AfterClass
	public void closebrowser() {
		
		driver.close();
	}
}

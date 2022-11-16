package RunnerClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v100.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LiberyFile.BaseClass;
import deposit_bc.PaymentRecipt_pom2;
import deposit_bc.PaywithnivapayWallet5;
import deposit_bc.TransferScreen_Pom8;
import pay_and_paywithnivapay_button_status.LoginPagebuttonfunctinality_pom1;
import pay_and_paywithnivapay_button_status.PaymentReciptbuttonfunctinality_pom2;

public class Sucessful_Txn_paywithniva_pay {
	WebDriver driver;
	
  @BeforeClass
  public void launchBroWser() throws InterruptedException {
	  
	  driver=BaseClass.Launchbrowserall("http://demo-web-alb-293560000.us-east-1.elb.amazonaws.com:3000/");
		Thread.sleep(3000);
  }
  
  @BeforeMethod
  public void clickOnQuickpaybutton() throws InterruptedException {
	  LoginPagebuttonfunctinality_pom1 p1= PageFactory.initElements (driver,LoginPagebuttonfunctinality_pom1.class);
	  p1.clickOnaPaytoMerchant();
	  
	  PaymentRecipt_pom2 p2=PageFactory.initElements(driver, PaymentRecipt_pom2.class);
	  p2.paymentbuttonclick();
	  Thread.sleep(3000);
	 
  }
  @Test
  public void paywithnivaPaybuttonclick() throws InterruptedException {
	  PaywithnivapayWallet5 p3=PageFactory.initElements(driver, PaywithnivapayWallet5.class);
	  
	  p3.clickonBITCOINLOGO();
	  Thread.sleep(5000);
	  p3.clickonPaywithNivapaybuttton();
	  Thread.sleep(6000);
	  
	  TransferScreen_Pom8 p4=PageFactory.initElements(driver, TransferScreen_Pom8.class);
	
	  p4.FetchData_onTransferScreen();
	  
	  p4.clickon_QuicktransferButton();
	  
  }
  
  @AfterMethod
  public void takescrenshotonpop() throws IOException {
	  BaseClass.TakesScreenShot();
	  
	  System.out.println("test case is pass ");
  }
  
  @AfterClass
  public void closebrowser() {
	  driver.close();
  }
 
}

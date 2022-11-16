package RunnerClass;

import java.io.IOException;
import java.time.Duration;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LiberyFile.BaseClass;
import withdrwal.Pay_to_userWithdral_pom1;
import withdrwal.Withdrwal_page_pom;

public class TCNO5_withdrawl_test_Wrong_Address_failedMesg {
  
	WebDriver driver;
	@BeforeClass
    public void launchBrowser() throws InterruptedException {
	 driver =BaseClass.Launchbrowserall("http://demo-web-alb-293560000.us-east-1.elb.amazonaws.com:3000/");
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
     
		} 
	@BeforeMethod
	public void dataenter() {
		Pay_to_userWithdral_pom1 p1=PageFactory.initElements(driver, Pay_to_userWithdral_pom1.class);
		p1.clickonpaytouserwithdralbutton();
	
	}
	@Test
	public void enteradresss1() throws InterruptedException, IOException {
		Withdrwal_page_pom p2=PageFactory.initElements(driver, Withdrwal_page_pom.class);
		
		p2.clickonlitcoin();                              // checking here first click on logo after putting address
		p2.enterwallet_invlaidaddress1();
		Thread.sleep(4000);
		//p2.enteramount();
		
		p2.avilablebalnce();
		
		p2.paybutton();                                                 // menthid is null pleae put xpath
		
		Thread.sleep(8000);
		BaseClass.TakesScreenShot();
		
		Reporter.log( "TCNO6_when user enter invalid address then system should show failed popup", true );
		
		
		
	}
	
	@AfterClass
	public void Closebrowser() {
		driver.close();
	}
}

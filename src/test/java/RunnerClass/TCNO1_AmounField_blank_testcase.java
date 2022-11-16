package RunnerClass;

import java.io.IOException;
import java.time.Duration;

import org.jsoup.Connection.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LiberyFile.BaseClass;
import Nivapay_error_Message_ON_amont.PaymentRecipt_page2;
import deposit_bc.LoginPageBTC_pom1;
import maven_office_project.LoginPage;

public class TCNO1_AmounField_blank_testcase {
 
	static WebDriver driver;
	
	@BeforeClass
    public void launchBrowser() throws InterruptedException {
	 driver =BaseClass.Launchbrowserall("http://demo-web-alb-293560000.us-east-1.elb.amazonaws.com:3000/");
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		}
	
	@BeforeMethod
	public void paybutton() {
		LoginPage p1 = PageFactory.initElements(driver, LoginPage.class);
		 p1.clickOnaPaytoMerchant();
      }
	@Test
	public void AMOunt_field_blank_error_message() throws InterruptedException {
		PaymentRecipt_page2 b2=PageFactory.initElements(driver, PaymentRecipt_page2.class);
	b2.namefield();
	}
	@AfterMethod
	public void error_message() throws InterruptedException, IOException {
		PaymentRecipt_page2 b3=PageFactory.initElements(driver, PaymentRecipt_page2.class);
		b3.errormsg();
		Thread.sleep(3000);
		
		BaseClass.TakesScreenShot();
	}
	@AfterClass
	public  static void cloesbrowser() {
	
		Reporter.log("TCNO1_Check that  Without entering amount error message should be show is passed", true);
		driver.close();
		
		
	}
}
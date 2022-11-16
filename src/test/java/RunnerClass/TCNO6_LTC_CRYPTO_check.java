package RunnerClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LiberyFile.BaseClass;
import maven_office_project.LoginPage;
import maven_office_project.PaymentRecipt;
import maven_office_project.Quickpaypom;
import net.bytebuddy.utility.RandomString;

public class TCNO6_LTC_CRYPTO_check  {

	WebDriver driver;
	@BeforeClass
    public void launchBrowser() throws InterruptedException {
	 driver =BaseClass.Launchbrowserall("http://demo-web-alb-293560000.us-east-1.elb.amazonaws.com:3000/");
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		} 
	
	@BeforeClass
    public void loginpage() {
	 LoginPage p1 = PageFactory.initElements(driver, LoginPage.class);
	 p1.clickOnaPaytoMerchant();
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	 
	 PaymentRecipt p2 = PageFactory.initElements(driver, PaymentRecipt.class);
	 p2.paymentbuttonclick();
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    }
	
	@Test
	 public void AvilableBalanace() throws InterruptedException, IOException {
	 Quickpaypom p3 = PageFactory.initElements(driver, Quickpaypom.class);
	 
	 p3.paybutton();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
	 }
	 
	
	@BeforeMethod
	 public void screenshotmethod() throws IOException { 
		 
		BaseClass.TakesScreenShot();
		 Reporter.log( "TCNO6. Verify that same currency should shows which currency selected by user. (for LTC)", true );
		 
		 
	 }
	  
	 @AfterClass
	 public void closeBrowser() throws IOException {
		 System.out.println("Test case pass");
		
	     driver.close();
	 }
	

}

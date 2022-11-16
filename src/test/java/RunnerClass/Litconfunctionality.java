package RunnerClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LiberyFile.BaseClass;
import maven_office_project.LoginPage;
import maven_office_project.PaymentRecipt;
import maven_office_project.Quickpaypom;
import maven_office_project.Quickpaypom_Paybutton;
import net.bytebuddy.utility.RandomString;

public class Litconfunctionality  {

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
	 public void AvilableBalanace() throws InterruptedException {
	 Quickpaypom p3 = PageFactory.initElements(driver, Quickpaypom.class);
	
	 }
	
	@Test
	public void LitcoinBalanceCheck() throws InterruptedException {
		Quickpaypom_Paybutton p4 = PageFactory.initElements(driver, Quickpaypom_Paybutton.class);
		p4.Quickpaybuttonclick();
		
		
	}
	 
	
	@BeforeMethod
	 public void screenshotmethod() throws IOException, InterruptedException { 
		 Thread.sleep(3000);
		 BaseClass.TakesScreenShot(); 
	 }
	  
	 @AfterClass
	 public void closeBrowser() {
		 System.out.println("Test case pass");
	     driver.close();
	 }
	

}

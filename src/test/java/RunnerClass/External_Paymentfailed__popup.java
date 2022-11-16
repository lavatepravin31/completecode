package RunnerClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LiberyFile.BaseClass;
import maven_office_project.External_uat_deposit_onePom;
import maven_office_project.External_uat_deposit_paygatway;
import maven_office_project.External_uat_deposit_thirdpom;
import maven_office_project.LoginPage;

public class External_Paymentfailed__popup {

	
	WebDriver driver;
	@BeforeClass
    public void launchBrowser() throws InterruptedException {
	 driver =BaseClass.Launchbrowserall("https://uat.mycryptobunny.com/#/dev/buyCrypto?username=hamster&casino=extreme&secret=64306814ddd6247fc62a56278173b3a2");
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		}
	
	@BeforeMethod
	public void enterdata() throws InterruptedException
	{
		External_uat_deposit_onePom p1 = PageFactory.initElements(driver, External_uat_deposit_onePom.class);
		
//		p1.firstpageaction();
		p1.CheeckboxClick();
		p1.Click_onDepositbutton();
	}
	
	@Test
	public void checkfuctinality() throws InterruptedException {
		External_uat_deposit_paygatway p2 = PageFactory.initElements(driver, External_uat_deposit_paygatway.class);
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		p2.dataenter();
		p2.cityfield();
		p2.continuebuttonclick();
		Thread.sleep(2000);
	}
	
	@Test
	public void checkpopmessage() {
		External_uat_deposit_thirdpom p3 = PageFactory.initElements(driver, External_uat_deposit_thirdpom.class);
		
		p3.dsPaymentfailedmessage();
		  
		
	}
	
	@AfterClass
	public void closebutton() {
		driver.close();
	}
}

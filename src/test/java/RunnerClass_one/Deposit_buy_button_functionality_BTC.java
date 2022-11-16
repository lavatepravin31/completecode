package RunnerClass_one;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Deposit_all_pom.Back_button_functinality_pom4;
import Deposit_all_pom.Deposit_buybutton_functionality_pom5;
import Deposit_all_pom.Deposit_dashboard_pom2;
import Deposit_all_pom.Deposit_pom1;
import LiberyFile.BaseClass;

public class Deposit_buy_button_functionality_BTC {
	WebDriver driver;
	@BeforeClass
	public void launchbrowser() throws InterruptedException, EncryptedDocumentException, IOException {

		//driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2NjMyODM0NiwiZXhwIjoxNjY2MzQ5OTQ2fQ.x37amfOLl_kdn8dKNCaafSf8DeGiho9TJQi04fpbTDk");
		driver=BaseClass.Nivapay_Wallet_launch(0, 0, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));	
	
	}
	@BeforeMethod
	public void proceedbutonclick() {
		Deposit_pom1 p1 = PageFactory.initElements(driver, Deposit_pom1.class);
		  p1.ClickONProceedButton();
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));	
		  Deposit_dashboard_pom2 p2=PageFactory.initElements(driver, Deposit_dashboard_pom2.class);
		  p2.ClickONdepositButton();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
		  @Test
			public void launchBroswser() throws InterruptedException {
				
			  Deposit_buybutton_functionality_pom5 p5=PageFactory.initElements(driver, Deposit_buybutton_functionality_pom5.class);
			  p5.depositpage();
			  p5.validation();
			  p5.clickon_buybutton();
			  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));	
			  p5.afterclickon_buy_button_landing();  
		  }
		  @AfterMethod
		  public void takescreenshot() throws IOException {
				// Reporter.log("Passed- Check that Buy button functionality.(BTC).",true);

			  BaseClass.TakesScreenShot();
		  }
		  @AfterClass
		  public void closebrowser() {
			  driver.close();
		  }
	}

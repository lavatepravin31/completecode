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

import LiberyFile.BaseClass;
import New_user_all_pom.New_user_page_pom3;
import New_user_all_pom.New_user_pom1;
import New_user_all_pom.New_user_profile_page_pom2;

public class New_user_successful_flow_nextbutton_status {
 
	WebDriver driver;
	@BeforeClass
	public void openbrowser() throws InterruptedException, EncryptedDocumentException, IOException {
	//	driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InZ5eHlsdWt1QGVtYS1zb2ZpYS5ldSIsImlhdCI6MTY2Njk0Mzk2OSwiZXhwIjoxNjY2OTY1NTY5fQ.v6BkbDnzSBpXDc5ISGqw-N3eog1v8fMMyLXTNIacS3A");
		driver=BaseClass.Nivapay_Wallet_launch(0, 1, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
	}
	
	@BeforeMethod
	public void clickponproceedbutton() throws InterruptedException {
		New_user_pom1 s1=PageFactory.initElements(driver, New_user_pom1.class);
		s1.ClickONProceedButton();
		Thread.sleep(2000);
	}
	@Test
	public void datefield_blank_button_status() throws InterruptedException {
		
		New_user_profile_page_pom2 s2=PageFactory.initElements(driver, New_user_profile_page_pom2.class);
		//s2.first_name_validation();
		s2.enter_first_name1();
		s2.enter_last_name1();
		s2.selectcountry();
		Thread.sleep(3000);
		s2.valid_date_selectdate();
		Thread.sleep(3000);
		
	}
	@AfterMethod
	public void takescreenshot() throws IOException, InterruptedException {
		New_user_profile_page_pom2 s3=PageFactory.initElements(driver, New_user_profile_page_pom2.class);
	//	s3.errormessagefirstName();
		s3.nextbutton_status();
		
		Thread.sleep(4000);
		s3.click_on_next_button();
		Reporter.log("Next button is clickable ",true);
		Thread.sleep(6000);
		
		New_user_page_pom3 s4=PageFactory.initElements(driver, New_user_page_pom3.class);
		s4.profilepage_validation();
		Thread.sleep(3000);
		BaseClass.TakesScreenShot();
	}
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
	
}

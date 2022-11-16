package RunnerClass_one;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DEmo_QA_POM.DEMO_PurchaseScreeen_pom3;
import DEmo_QA_POM.DEMO_paymentGATEWAY_SCreenPOM4;
import DEmo_QA_POM.DEmo_DashBoard_page_pom2;
import DEmo_QA_POM.Verifying_Page_pom1;
import LiberyFile.BaseClass;

public class PAymentGateway_invalid_card_3DS_popup {
WebDriver driver;
	
	@BeforeClass
	public void launchBroswser() throws InterruptedException, EncryptedDocumentException, IOException {
		driver=BaseClass.Nivapay_Wallet_launch(0, 0, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	
	@BeforeMethod
	public void clickonprocesdbuttton() throws InterruptedException, IOException {
		Verifying_Page_pom1 p1 = PageFactory.initElements(driver, Verifying_Page_pom1.class);
		p1.ClickONProceedButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		DEmo_DashBoard_page_pom2 p2 = PageFactory.initElements(driver, DEmo_DashBoard_page_pom2.class);
		p2.clickonLTCPurchaseButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		DEMO_PurchaseScreeen_pom3 p3 = PageFactory.initElements(driver, DEMO_PurchaseScreeen_pom3.class);
		p3.enteramount();
		p3.clickONPurchaseBUtton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		DEMO_paymentGATEWAY_SCreenPOM4 p4 = PageFactory.initElements(driver, DEMO_paymentGATEWAY_SCreenPOM4.class);
		p4.enterDATA();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		p4.clickoncontinuebutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(13000));
		BaseClass.TakesScreenShot();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3000));

		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='The card you have entered is either incorrect or does not support 3DS. Please try again with a different card.']")));
	}
	
	@Test
	public void CHEckedStauts() throws IOException {
		
		
//		
//		POPup_pom5 p5 = PageFactory.initElements(driver, POPup_pom5.class);
//		p5.handle_pop();
		
		System.out.println("falied popup show ");
		BaseClass.TakesScreenShot();
		
		
		Reporter.log( "Passed- When user use invalid card that time error message should show and payment will be failed is passed.", true ); 

	}
	
	@AfterClass
	public void closebrowser() {
		
		
		driver.close();
	}
}



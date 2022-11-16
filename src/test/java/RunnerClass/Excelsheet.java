package RunnerClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import EXcel_pom.EXCEL_LoginPageBTC_pom1;
import EXcel_pom.EXCEL_PaymentRecipt_pom2;
import EXecldata.UtilityClass_one;
import LiberyFile.BaseClass;
import deposit_bc.PaywithnivapayWallet5;

public class Excelsheet  {
  WebDriver driver;
	
@BeforeClass
public void launchbRowser() throws InterruptedException {
	
	driver=BaseClass.Launchbrowserall("http://demo-web-alb-293560000.us-east-1.elb.amazonaws.com:3000/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
}


@BeforeMethod
public void payto_merchantbutton() {
	
	 EXCEL_LoginPageBTC_pom1 p3=PageFactory.initElements(driver, EXCEL_LoginPageBTC_pom1.class);
	 
	 p3.clickOnaPaytoMerchant();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	 
	
}
@Test
public void enterdata() throws EncryptedDocumentException, IOException, InterruptedException {
	
	EXCEL_PaymentRecipt_pom2 p4=PageFactory.initElements(driver, EXCEL_PaymentRecipt_pom2.class);
	
	p4.namefiled(UtilityClass_one.readfromexel(0, 1));
	
	p4.mailfield(UtilityClass_one.readfromexel(0, 2));
}

//@AfterClass
//public void closebrowser() {
//	driver.close();
//}
}

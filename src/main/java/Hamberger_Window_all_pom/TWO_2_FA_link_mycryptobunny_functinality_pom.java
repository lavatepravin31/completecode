package Hamberger_Window_all_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class TWO_2_FA_link_mycryptobunny_functinality_pom {
WebDriver driver ;
	
	@FindBy(xpath="//li[text()='Preferences']")
	WebElement Two_FA_button;
	
	@FindBy(xpath = "//span[text()='2FA']")
	WebElement userlandingon2fa;
	
	@FindBy(xpath = "//span[@class='mat-slide-toggle-thumb']")
	WebElement enabla2FA;
	
	@FindBy(xpath = "//button[text()='Back']")
	WebElement backbutton;
	
	@FindBy(xpath = "//div[@class='nav-bar']")
	WebElement clickonhabugermenu;
	
	
	@FindBy(xpath="//span[text()='My Balance']")
	WebElement   dashboardpage;
	
	@FindBy(xpath="//a[text()='support@mycryptobunny.com']")
	WebElement   link_mycrypto_bunny;
	
	
	@FindBy(xpath="//span[text()='Scan the below QR code']")
	WebElement   QRcode_dispaly;
	
	//a[text()='support@mycryptobunny.com']
	
	public TWO_2_FA_link_mycryptobunny_functinality_pom(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click_on_mycryptobunny_link() {
		
		link_mycrypto_bunny.click();
	}
	
	public void validation_link() throws InterruptedException {
		
		String mw = driver.getWindowHandle();
		
		driver.switchTo().window(mw);
		
		Thread.sleep(6000);
		WebElement googelpage = driver.findElement(By.xpath("//span[text()='Sign in']"));
		
		String s3 = googelpage.getText();
		Reporter.log("user landing on google signup page :"+s3,true);
		
		if (googelpage.isDisplayed()) {
			Reporter.log("passed- link is clickable :"+s3,true);	
		}
		else {
			Reporter.log("failed- link is clickable :",true);	
		}
	}
	
	
	public void enable_click() {
		enabla2FA.click();
	}
	
	
	
	public void enable_Status_functinality_check() {
		if (enabla2FA.isEnabled()) {
			Reporter.log("2 FA is enable,button is working ",true);
			Reporter.log("Passed- 2FA enable functionality is working ",true);
		}
		else {
			Reporter.log("2 FA is not enable,button is  not working ",true);
			Reporter.log("Failed- 2FA enable functionality is working ",true);
		}
	}
	public void disable_Status_functinality_check() {
		if (enabla2FA.isEnabled()) {
			Reporter.log("2 FA is not enable,button is  not working ",true);
			Reporter.log("Failed- 2FA enable functionality is working ",true);
		}
		else {
		
			Reporter.log("2 FA is disable,button is working ",true);
			Reporter.log("Passed- 2FA disable, functionality is working ",true);
		}
	}
	
	public void QR_code_display_functinality() {
		String mesg = QRcode_dispaly.getText();
		
		
		if (QRcode_dispaly.isDisplayed()) {
			Reporter.log("2 FA is enable,QR code is dispaly ",true);
			Reporter.log("QR code is dispaly message is showing : "+mesg,true);
			Reporter.log("Passed- QR code is display after click on 2FA enable  ",true);
			
		}
		else {
			Reporter.log("2 FA is not enable,QR code is not dispaly ",true);
			Reporter.log("failed- QR code is display after click on 2FA enable  ",true);
		}
	}
}

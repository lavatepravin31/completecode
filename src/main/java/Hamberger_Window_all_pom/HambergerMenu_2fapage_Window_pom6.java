package Hamberger_Window_all_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Factory;

public class HambergerMenu_2fapage_Window_pom6 {

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
	
	public HambergerMenu_2fapage_Window_pom6(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void hambergerButton_preference() {
		
		Two_FA_button.click();
	}
	
	
	public void userlandingpage() {
		
		String u1 = userlandingon2fa.getText();
		System.out.println("user is landing on : "+u1);
		Reporter.log("user is landing on : "+u1,true);
	}
	
	public void TWO_fa_enable_functinality() throws InterruptedException {
		
		WebElement QR_code_message = driver.findElement(By.xpath("//span[text()='Scan the below QR code']"));
		String we = QR_code_message.getText();
		enabla2FA.click();
		Thread.sleep(2000);
		
		boolean a1 = enabla2FA.isEnabled();
		System.out.println("2fa status in boolean:  "+a1);
		Reporter.log("2fa status in boolean:"+a1);
		if (QR_code_message.isDisplayed()) {
			Reporter.log("QR code is showing with message :"+we);
		
		}
		else {
			Reporter.log("QR code is not showing with message :"+we);
		}
		
		enabla2FA.click();
		Thread.sleep(4000);
		
		boolean a2 = enabla2FA.isEnabled();
		System.out.println("2fa status in boolean:  "+a2);
		Reporter.log("2fa status in boolean:"+a2);
	}
	
	public void backnuttoncheck() {
		backbutton.click();
		
	}
	public void validation01() {
		
		
		if (userlandingon2fa.isDisplayed()) {
			System.out.println(" 2 FA 0r prefernce button is clickable");
			Reporter.log("prefernce  button is clickable",true);
			Reporter.log("Passed-Check that functinality of prefernce  buttton",true);
		}
		else {
			System.out.println("2 FA 0r prefernce button is not clickable");
			Reporter.log("prefernce  button is not  clickable",true);
			Reporter.log("failed-Check that functinality of prefernce  buttton",true);
		}
		
	}
	
	public void validation2() {
		if (dashboardpage.isDisplayed()) {
			System.out.println("back button functinality is working or back button is clickable");
			
		}
		else {
			System.out.println("back button functinality is not working or back button is not clickable");
			
		}
	}
	
	public void hamburgermenuclick() {
		clickonhabugermenu.click();
		
	}
	
	
	
	

}

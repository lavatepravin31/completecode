package maven_office_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class External_uat_deposit_onePom {
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c68-0']")
	WebElement enterAMountfield;
	
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container']")
	WebElement Checkbox;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	WebElement depositbutton;
	
	public External_uat_deposit_onePom(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void firstpageaction() throws InterruptedException {
		Thread.sleep(5000);
		enterAMountfield.clear();
		enterAMountfield.sendKeys("10.5");
	}
	
	public void CheeckboxClick() {
		Checkbox.click();
	}
	
	public void Click_onDepositbutton() {
		depositbutton.click();
	}
}

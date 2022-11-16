package maven_office_project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class External_uat_deposit_paygatway {
WebDriver driver;
	
	@FindBy (id="cardNumber")
	WebElement cardnumberfield;
	
	@FindBy(id="mat-input-2")
	WebElement expirydatefield;
	
	@FindBy(xpath="//input[@data-placeholder='cvv*']")
	WebElement cvvfield;
	
	@FindBy(id="mat-select-4")
	WebElement city;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement continuebutton;
	
	
	public External_uat_deposit_paygatway (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void dataenter() throws InterruptedException {
		Thread.sleep(7000);
		cardnumberfield.sendKeys("4001919257537193");
	    Thread.sleep(3000);
	    cardnumberfield.sendKeys(Keys.TAB);
	    Thread.sleep(3000);
		expirydatefield.sendKeys("12/26");
		Thread.sleep(3000);
		cardnumberfield.sendKeys(Keys.TAB);
		cvvfield.sendKeys("465");
		
		cardnumberfield.sendKeys(Keys.TAB);cardnumberfield.sendKeys(Keys.TAB);cardnumberfield.sendKeys(Keys.TAB);cardnumberfield.sendKeys(Keys.TAB);cardnumberfield.sendKeys(Keys.TAB);
		
	}
	public void cityfield() throws InterruptedException {
		
		
		city.sendKeys(Keys.ENTER);city.sendKeys(Keys.ENTER);
		
//		Actions act=new Actions(driver);
//		act.doubleClick(city);
//		Thread.sleep(3000);
//		
	}
	public void continuebuttonclick() {
		continuebutton.click();
	}
	
}

package EXcel_pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import EXecldata.UtilityClass_one;

public class EXCEL_PaymentRecipt_pom2 extends UtilityClass_one {

	WebDriver driver;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement namefiled;
//	
	@FindBy(xpath="//input[@name='email']") 
	WebElement mailfield;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement paybutton;
//	
//	@FindBy (xpath="//button[@type='submit']")
//	WebElement amountfield;
	
	
	public EXCEL_PaymentRecipt_pom2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void namefiled(String name) throws InterruptedException {
		namefiled.click();
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		act.click(namefiled).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
	    Thread.sleep(2000);
		namefiled.sendKeys(name);
	}
	public void mailfield(String mailid) {
		mailfield.click();
		mailfield.sendKeys(mailid);
	}
	public void paymentbuttonclick() {
		
		paybutton.click();
	}
	
}

package Nivapay_error_Message_ON_amont;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PaymentRecipt_page2 {
	WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement entername;
	
	@FindBy(xpath="(//input[@type='number'])[1]" )
	WebElement enteramount;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement paybutton;
	
	@FindBy(xpath="//p[text()='Amount is required']")
	WebElement errormsg;
	
	
	
	public PaymentRecipt_page2(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void namefield() throws InterruptedException {
		 Actions act= new Actions(driver);
		 Thread.sleep(2000);
			act.click(entername).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(2000);
			entername.sendKeys("pravin");
		}
	
	public void errormsg() throws InterruptedException {
	        Actions act= new Actions(driver);
	        Thread.sleep(2000);
	        act.click(enteramount).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		    Thread.sleep(5000);
		    Boolean msg= errormsg.isDisplayed();
		 if(msg) {
	           System.out.println("Yes ! Error is showing ");
	     }
	     else {
	           System.out.println("NO ! Error is not showing");
	     }
}
}

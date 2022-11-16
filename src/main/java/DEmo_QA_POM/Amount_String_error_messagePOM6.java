package DEmo_QA_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class Amount_String_error_messagePOM6 {
	WebDriver driver;
	@FindBy(xpath="//input[@formcontrolname='fiatAmount']")
	WebElement amountfield;
	
	@FindBy(xpath="(//span[@class='font-bold'])[3]")
	WebElement aftercrptocurrncy;
	
	@FindBy(xpath="(//span[@class='font-bold'])[4]")
	WebElement afterusd;
	
	@FindBy(xpath="//button[text()='Purchase']")
	WebElement Purchasebutton;
	
	@FindBy(xpath="(//span[text()='Purchase'])[2]")
	WebElement LTCpurchase;
	

	public Amount_String_error_messagePOM6(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void enteramount0() throws InterruptedException {
		
		LTCpurchase.click();
		Thread.sleep(4400);
		amountfield.sendKeys("@#@#@#&*");
		
		Thread.sleep(4000);

}
public void enteramount1() throws InterruptedException {
		
		LTCpurchase.click();
		Thread.sleep(4400);
		amountfield.sendKeys("heqifh");
		Reporter.log(" Enter string value in Amount field ",true);
		
		Thread.sleep(4000);

}
public void enteramount2() throws InterruptedException {
	
	LTCpurchase.click();
	Thread.sleep(4400);
	amountfield.sendKeys("11.50");
	
	Reporter.log("Enter valid amount in amount field ",true);
	
	Thread.sleep(4000);

}
	public void functionality_pruchseButton() {
		boolean status = Purchasebutton.isEnabled();
		
		Assert.assertTrue(status);
		
		if (Purchasebutton.isEnabled()) {
			System.out.println("purchase button is enable ");
			Reporter.log("Passed-Verify that user enter valid amount in amount field then purchase button is enable.",true);
		}
		else {
			System.out.println("purchase button is disable ");
		}
	}
	}

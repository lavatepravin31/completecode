package DEmo_QA_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ErrorMessage_pom11 {
	WebDriver driver;
	
	@FindBy(xpath = "//mat-error[text()='Please enter valid Card Number']")
	WebElement cardnumber_Errormesage;
	
	@FindBy(id="cardNumber")
	WebElement cardnumber;
	
	@FindBy(xpath="//input[@placeholder='Expiry']")
	WebElement Expirydate;
	
	@FindBy(xpath="//input[@placeholder='cvv*']")
	WebElement CVV;
	
	public ErrorMessage_pom11(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void dataenter() {
		cardnumber.sendKeys("400");
		Expirydate.sendKeys("12/26");
		CVV.sendKeys("465");
	}
	

	public void errormessage() {
		
		String c2 = cardnumber_Errormesage.getText();
		
		System.out.println("error text is  : "+c2);
		
	}
	public void statuserrormessage() {
		
		if (cardnumber_Errormesage.isDisplayed()) {
			
			System.out.println("error message is display");
			
		}
		else {
			System.out.println("error message is not display");
			
		}
	}
}

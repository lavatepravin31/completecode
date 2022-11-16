package DAshBoard_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BTc_LTC_crypto_balance {

WebDriver driver;
	
	@FindBy(xpath = "(//span[text()='0.00000000'])[1]")
	WebElement btc_crypto_balance;
	

	@FindBy(xpath = "(//span[text()='0.00000000'])[2]")
	WebElement ltc_crypto_balance;
	
	
	@FindBy(xpath = "//button[text()='Proceed']")
	WebElement proceeedbutton;
	
	public BTc_LTC_crypto_balance(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void click_on_proceed_button() {
		proceeedbutton.click();
	}
	
	public void btc_crypto_balance() {
		String a1 = btc_crypto_balance.getText();
		System.out.println("ltc crypto balance is :  "+a1);
		Reporter.log("ltc crypto balance is : "+a1,true);
	}
	public void ltc_crypto_balance() {
		String a2 = ltc_crypto_balance.getText();
		System.out.println("btc crypto balance is :  "+a2);
		Reporter.log("btc crypto balance is : "+a2,true);
	}
	

}

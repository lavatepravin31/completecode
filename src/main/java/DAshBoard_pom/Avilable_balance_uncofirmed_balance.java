package DAshBoard_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Avilable_balance_uncofirmed_balance {
WebDriver driver;
	
	@FindBy(xpath = "(//span[@class='info'])[1]")
	WebElement avilable_balance;
	

	@FindBy(xpath = "(//span[@class='info'])[2]")
	WebElement unconfirmed_balance;
	
	
	@FindBy(xpath = "//button[text()='Proceed']")
	WebElement proceeedbutton;
	
	public Avilable_balance_uncofirmed_balance(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void click_on_proceed_button() {
		proceeedbutton.click();
	}
	
	public void avilable_balance_showing() {
		String a1 = avilable_balance.getText();
		System.out.println("avilable balance :  "+a1);
		Reporter.log("avilable balance : "+a1,true);
	}
	public void unconfirmed_balance_showing() {
		String a2 = unconfirmed_balance.getText();
		System.out.println("unconfirmed_balance is :  "+a2);
		Reporter.log("unconfirmed_balance : "+a2,true);
	}
	
}

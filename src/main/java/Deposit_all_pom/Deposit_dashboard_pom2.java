package Deposit_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Deposit_dashboard_pom2 {

	WebDriver driver ;
	@FindBy(xpath="//span[text()='Deposit']")
	WebElement depositbutton;
	
	@FindBy(xpath = "(//span[text()='Deposit'])[1]")
	WebElement depositbutton_BTC;
	
	@FindBy(xpath = "(//span[text()='Deposit'])[2]")
	WebElement depositbutton_LTC;
	
	public Deposit_dashboard_pom2(WebDriver driver)
	{
		this.driver=driver;
	}
	
   public void ClickONdepositButton() {
		
		depositbutton_BTC.click();
	}
	
	public void ClickONdepositButton_BTC() {
		
		depositbutton_BTC.click();
	}
	
	
    public void ClickONdepositButton_LTC() {
		
	depositbutton_LTC.click();
	}
	
}

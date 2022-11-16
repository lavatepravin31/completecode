package Purchase_screen_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DEmo_DashBoard_page_pom2 {
	WebDriver driver;
	
	@FindBy(xpath="(//span[text()='Purchase'])[2]")
	WebElement LTCpurchase;
	
	@FindBy(xpath="(//span[text()='Purchase'])[1]")
	WebElement BTCpurchase;
	
	public DEmo_DashBoard_page_pom2(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickon_LTC_PurchaseButton() {
		
		LTCpurchase.click();
	}
	
    public void clickon_BTC_PurchaseButton() {
		
	     BTCpurchase.click();
	}
	
}

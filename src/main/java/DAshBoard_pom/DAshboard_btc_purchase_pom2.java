package DAshBoard_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DAshboard_btc_purchase_pom2 {
	
WebDriver driver;
	
	@FindBy(xpath="(//span[text()='Purchase'])[2]")
	WebElement lTCpurchase;
	
	@FindBy(xpath= "(//span[text()='Purchase'])[1]")
	WebElement BTCpurchase;
	
	public DAshboard_btc_purchase_pom2(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickonLTCPurchaseButton() {
		
		lTCpurchase.click();
	}

     public void clickonbTCPurchaseButton() {
		
	BTCpurchase.click();
	}

}

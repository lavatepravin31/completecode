package Payment_gatwway_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentGateway_Dashboard_pom2 {

WebDriver driver;
	
	@FindBy(xpath="(//span[text()='Purchase'])[2]")
	WebElement LTCpurchase;
	
	@FindBy(xpath="(//span[text()='Purchase'])[1]")
	WebElement BTCpurchase;
	
	
	
	public PaymentGateway_Dashboard_pom2(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickonLTCPurchaseButton() {
		
		LTCpurchase.click();
	}
public void clickon_BTC_PurchaseButton() {
		
	BTCpurchase.click();
	}
	
}

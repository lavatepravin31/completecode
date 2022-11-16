package deposit_bc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaywithnivapayWallet5 {
	WebDriver driver;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium makeStyles-btn-7 css-1veuwys-MuiButtonBase-root-MuiButton-root']")
    WebElement paywithnivapayButton;
	
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-column css-t0zib5-MuiGrid-root'])[2]")
	WebElement  bitcoinlogo;
	
	public PaywithnivapayWallet5(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void clickonBITCOINLOGO() {
		bitcoinlogo.click();
	}
	public void clickonPaywithNivapaybuttton() {
		
		paywithnivapayButton.click();
	}
}

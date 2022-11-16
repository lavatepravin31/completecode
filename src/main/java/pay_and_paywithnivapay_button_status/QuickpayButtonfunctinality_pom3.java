package pay_and_paywithnivapay_button_status;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickpayButtonfunctinality_pom3 {
	
	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-item css-13i4rnv-MuiGrid-root'])[3]")
	WebElement btccoinlogo;
	
	@FindBy(xpath="//a[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium makeStyles-btn-7 css-11xeemu-MuiButtonBase-root-MuiButton-root']")
	WebElement paybutton;
	
	
	public QuickpayButtonfunctinality_pom3(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void selectbtccurrency() {
		btccoinlogo.click();
	}
	
	public void paybuttonclick() {
		
		paybutton.click();
	}
}

package deposit_bc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickpayBTC_pom3 {
	
	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-item css-13i4rnv-MuiGrid-root'])[5]")
	WebElement btccoinCASHlogo;
	
	//@FindBy(xpath="//a[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium makeStyles-btn-7 css-11xeemu-MuiButtonBase-root-MuiButton-root']")
	@FindBy(xpath="//a[text()='Pay']")
	WebElement paybutton;
	
	
	public QuickpayBTC_pom3(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void selectbtccurrency() {
		btccoinCASHlogo.click();
	}
	
	public void paybuttonclick() {
		
		paybutton.click();
	}
}

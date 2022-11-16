package deposit_bc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickpayBitcoinCASH_pom6 {
	
	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-item css-13i4rnv-MuiGrid-root'])[3]")
	WebElement btccoinlogo;
	
	@FindBy(xpath="//a[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium makeStyles-btn-7 css-11xeemu-MuiButtonBase-root-MuiButton-root']")
	WebElement paybutton;
	
	
	@FindBy(xpath="(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[2]")
	WebElement cryptocurrencybtc;
	
	public QuickpayBitcoinCASH_pom6(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void selectbtccurrency() {
		btccoinlogo.click();
	}
	
	public void paybuttonclick() {
		
		paybutton.click();
	}
	
	
	public void cryptocurrecyobtc() {
		String curency = cryptocurrencybtc.getText();
		
		System.out.println("currency is : "+curency);
	}
	
}

package EXcel_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EXCEL_LoginPageBTC_pom1 {
	
	WebDriver driver;
	
	@FindBy(xpath="(//button[@type='button'])[1]") 
	WebElement paytomerchantbutton;
	
	
		public EXCEL_LoginPageBTC_pom1(WebDriver driver)
		{
			this.driver=driver;
		}
	
	public void clickOnaPaytoMerchant() {
		
		paytomerchantbutton.click();
	}

}

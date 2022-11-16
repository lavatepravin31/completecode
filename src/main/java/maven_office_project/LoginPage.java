package maven_office_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="(//button[@type='button'])[1]") 
	WebElement paytomerchantbutton;
	
	
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
	
	public void clickOnaPaytoMerchant() {
		
		paytomerchantbutton.click();
	}

}

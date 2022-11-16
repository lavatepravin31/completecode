package Transfer_Window_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Click_on_tranfer_pom2 {

	WebDriver driver ;
	
	@FindBy(xpath="(//span[text()='Transfer'])[2]")
	WebElement Click_on_ltc_transfer_button;
	
	@FindBy(xpath="(//span[text()='Transfer'])[1]")
	WebElement Click_on_btc_transfer_button;
	
	@FindBy(xpath = "//span[text()='My Balance']")
	WebElement Dashboard;
	
	
	
	
	public Click_on_tranfer_pom2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void ClickON_Transfer() {
		
		Click_on_ltc_transfer_button.click();
	}
	
    public void ClickON_Transfer_btc() {
		
    	Click_on_btc_transfer_button.click();
	}
	
	public void userlandingon_status() {
		
		boolean actual = Dashboard.isDisplayed();
		
		Assert.assertTrue(actual);
		
		
		if (Dashboard.isDisplayed()) {
			String d1 = Dashboard.getText();
			System.out.println(d1);
			System.out.println("after Clicking on back button ,user landing on dashboard");
		}
		else {
			System.out.println("user is not landing on dashboard");
		}
         
		
	}
}

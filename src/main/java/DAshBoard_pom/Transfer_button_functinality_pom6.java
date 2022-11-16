package DAshBoard_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Transfer_button_functinality_pom6 {

WebDriver driver;
	
	@FindBy(xpath="(//span[text()='Transfer'])[1]")
	WebElement BTC_Transfer;
	
	@FindBy(xpath="(//span[text()='Transfer'])[2]")
	WebElement LTC_Transfer;
	
	
	
	
	public Transfer_button_functinality_pom6(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickonBTC_Transfer_Button() {
		
		BTC_Transfer.click();
	}

     public void clickonLTC_Transfer_Button() {
		
    	 LTC_Transfer.click();
	}
     
	
}

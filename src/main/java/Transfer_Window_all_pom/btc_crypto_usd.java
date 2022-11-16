package Transfer_Window_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class btc_crypto_usd {
WebDriver driver ;
	
	@FindBy(xpath="(//div[@class='text-end']//h5)[1]")
	WebElement ltc_crypto;
	
	@FindBy(xpath="(//div[@class='text-end']//h5)[2]")
	WebElement ltc_usd;
	
	@FindBy(xpath="(//div[@class='ng-star-inserted'])[2]")
	WebElement backbutton;
	
	@FindBy(xpath = "((//div[@class='ng-star-inserted'])//img)[1]")
	WebElement backbutton1;
	
	public btc_crypto_usd(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void btc_crypto_usd() {
		
		String l1 = ltc_crypto.getText();
		System.out.println("btc crypto is  : "+l1);
        Reporter.log("btc crypto is  :"+l1,true);
		
		
		String l2 = ltc_usd.getText();
		System.out.println("btc in usd  is  : "+l2);
		Reporter.log("btc in usd  is  :"+l2,true);
	}
	
  public void Click_on_backnutton_() {
	  backbutton1.click();
  }
	
}



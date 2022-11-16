package Transfer_Window_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class avilable_balance_pom6 {
WebDriver driver ;
	
	@FindBy(xpath="(//div[@class='text-end']//h5)[1]")
	WebElement ltc_crypto;
	
	@FindBy(xpath="(//div[@class='text-end']//h5)[2]")
	WebElement ltc_usd;
	
	@FindBy(xpath="(//div[@class='ng-star-inserted'])[2]")
	WebElement backbutton;
	
	@FindBy(xpath = "((//div[@class='ng-star-inserted'])//img)[1]")
	WebElement backbutton1;
	
	public avilable_balance_pom6(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void ltc_crypto_usd() {
		
		String l1 = ltc_crypto.getText();
		System.out.println("ltc crypto is  : "+l1);
		
		
		String l2 = ltc_usd.getText();
		System.out.println("ltc in usd  is  : "+l2);
	}
	
  public void Click_on_backnutton_() {
	  backbutton1.click();
  }
	
}

package Purchase_screen_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class Paymentgatway_screen_pom {


	WebDriver driver ;
	@FindBy(xpath="//span[text()='Add Card']")
	WebElement add_card_page;
	
	
	public Paymentgatway_screen_pom(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void validation_purchase_button() {
		
		String s1 = add_card_page.getText();
		Reporter.log("window  :   "+s1,true);
		
		
		boolean actual = add_card_page.isDisplayed();
		Assert.assertTrue(actual);
		
		
	 if (add_card_page.isDisplayed()) {
		 
		 Reporter.log("User landing on ,add card window ",true);
		 
		 Reporter.log("Passed- Check that purchase buttton functionality ",true);
		
	}
	 else {
           Reporter.log("User is not  landing on ,add card window ",true);
		 
		 Reporter.log("failed- Check that purchase buttton functionality ",true);
		
	}
	}
	

}

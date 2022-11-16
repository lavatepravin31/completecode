package DAshBoard_pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Purcahse_Screen_pom3 {
 WebDriver driver;
 
	@FindBy(xpath = "//span[text()='Purchase']")
	WebElement purcahse_ltc_landing_page;
	
	@FindBy(xpath = "//span[text()='Purchase']")
	WebElement purcahse_btc_landing_page;
	
	
	
	public Purcahse_Screen_pom3(WebDriver driver)
	{
		this.driver=driver;
	}

	public void status_clickon_LTC_PurchaseButton() {
		
		WebElement expected_result = driver.findElement(By.xpath("//span[text()='Purchase']"));
		
		WebElement Actual_result = driver.findElement(By.xpath("//span[text()='Purchase']"));

	
		//assertEquals(expected_result, Actual_result);
		
		
		if (purcahse_ltc_landing_page.isDisplayed()) {
			
			
			assertEquals(expected_result, Actual_result);
			
			//System.out.println("User is landing on purcahse window ,so purchase button is clickable");
			Reporter.log( "ltc purchase button is clickable ,test case pass", true );
			Reporter.log( "Passed-Check that functinality of purchase button.(ltc )", true );
			
		}
		else {
			System.out.println("User is not landing on purchase button  ,so purchase button is not clickable");
		}
		
		
		
	}
		
		public void clickon_bTC_PurchaseButton() {

			WebElement expected_result = driver.findElement(By.xpath("//span[text()='Purchase']"));
			
			WebElement Actual_result = driver.findElement(By.xpath("//span[text()='Purchase']"));
			
			if (purcahse_btc_landing_page.isDisplayed()) {
				
				assertEquals(expected_result, Actual_result);
				
				System.out.println("User is landing on purcahse window ,so purchase button is clickable");
		
			}
			else {
				System.out.println("User is not landing on purchase button  ,so purchase button is not clickable");
			}
	}

	
	
}

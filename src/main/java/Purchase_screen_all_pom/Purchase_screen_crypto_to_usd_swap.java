package Purchase_screen_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Purchase_screen_crypto_to_usd_swap {

	WebDriver driver;
	@FindBy(xpath="//input[@formcontrolname='fiatAmount']")
	WebElement amountfield;
	
	@FindBy(xpath="(//span[@class='font-bold'])[3]")
	WebElement aftercrptocurrncy;
	
	@FindBy(xpath="(//span[@class='font-bold'])[4]")
	WebElement afterusd;
	
	@FindBy(xpath="//button[text()='Purchase']")
	WebElement Purchasebutton;
	
	@FindBy(xpath = "(//span[@class='font-bold'])[1]")
	WebElement avilable_balance_crypto;
	
	@FindBy(xpath = "(//span[@class='font-bold'])[2]")
	WebElement avilable_balance_usd;
	
	
	@FindBy(xpath = "(//span[@class='font-bold'])[3]")
	WebElement estimated_balance_crypto;
	
	@FindBy(xpath = "(//span[@class='font-bold'])[4]")
	WebElement estimated_balance_usd;
	
	@FindBy(xpath = "//input[@formcontrolname='cryptoAmount']")
	WebElement enter_crypto_amount;
	
	@FindBy(xpath = "//input[@formcontrolname='fiatAmount']")
	WebElement AMount_in_usd;
	
	@FindBy(xpath = "//div[@class='d-flex justify-content-between my-3']//input[@type='number']")
	WebElement AMount_in_usd1;
	
	
	
	
	//input[@formcontrolname='cryptoAmount']
	//input[@formcontrolname='fiatAmount']

	public Purchase_screen_crypto_to_usd_swap(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	public void Enter_crypto() throws InterruptedException {
		
		enter_crypto_amount.sendKeys("0.00068227");
		Thread.sleep(5000);
		
		Reporter.log("Enter crypto amount : 0.00068227 ",true);
		
//		String s1 = AMount_in_usd1.getText();
//		System.out.println("amount is "+s1);
//		Reporter.log("usd amount showing  :"+s1,true);
//		
	}
	
	
	public void Status_purchase_buttto() {
		
		if (Purchasebutton.isEnabled()) {
			
			Reporter.log("Purchase button is enable",true);
			Reporter.log("Passed- Verify that entering crypto amount usd amount showing and purchase button is enable ",true);
		}
		else {
			Reporter.log("Purchase button is Disable",true);
			Reporter.log("failed- Verify that entering crypto amount usd amount showing and purchase button is enable ",true);
		}
		
	}
	
	
	
}

package Purchase_screen_all_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class DEMO_PurchaseScreeen_pom3 {

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

	public DEMO_PurchaseScreeen_pom3(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void balanceshow_BTC() {
		String s1 = avilable_balance_crypto.getText();
		System.out.println("avilable balance(crypto)  btc  : "+s1);
		Reporter.log("avilable balance(crypto)  btc :"+s1,true);
		String s2 = avilable_balance_usd.getText();
		System.out.println("avilable balance (usd) btc : "+s2);
		Reporter.log("avilable balance (usd) btc :"+s2,true);
		
	}
	public void balanceshow_lTC() {
		String s1 = avilable_balance_crypto.getText();
		System.out.println("avilable balance(crypto)  ltc  : "+s1);
		Reporter.log("avilable balance(crypto)  ltc :"+s1,true);
		
		String s2 = avilable_balance_usd.getText();
		System.out.println("avilable balance (usd) ltc : "+s2);
		Reporter.log("avilable balance (usd) ltc :"+s2,true);
	}
	
	public void iN_amount_Field_enter_string() {
		amountfield.sendKeys("e");
		Reporter.log("Enter string vale in amount field",true);
		
	}
	  public void purchasebuttonStatus1() {
		boolean stATUS = Purchasebutton.isEnabled();
		System.out.println("button status is :"+stATUS);
		
		Assert.assertFalse(stATUS);
	
		if(Purchasebutton.isEnabled()) {
			System.out.println(" purchase button is enable ");
			Reporter.log("Purchase button is enable ",true);
			
			
		}
		else{
			System.out.println(" purchase button is disable ");
			Reporter.log("Purchase button is disable ",true);
			Reporter.log("Passed- after entring string value ,Purchase button is disable",true);
		}
	
	  }
	  
	  
	  public void amount_Field_enter_value() {
			amountfield.sendKeys("12.5");
			Reporter.log("Enter valid amount [12.5]",true);
			
		}
	  
	  public void POST_estimated_Value() {
		  String e1 = estimated_balance_crypto.getText();
		  System.out.println("POst estimated value (crypto) : "+e1);
		  Reporter.log("POst estimated value (crypto) :"+e1,true);
		  
		  
		  String e2 = estimated_balance_usd.getText();
		  System.out.println("POst estimated value (usd) : "+e2);
		  Reporter.log("POst estimated value (usd) : :"+e2,true);
	  }
	
	
	
	public void enteramount() throws InterruptedException {
		amountfield.sendKeys("10.5");
		Thread.sleep(4000);
		String afcrypto = aftercrptocurrncy.getText();
		System.out.println("after amount enter crrpto currency :"+afcrypto);
		Reporter.log("after amount enter crrpto currency :"+afcrypto,true);
		
		String afused = afterusd.getText();
		System.out.println("after amount enter crrpto currency: "+afused);
		Reporter.log("after amount enter crrpto currency: :"+afused,true);
		
	}
	public void purchasebuttonStatus() {
		boolean stATUS = Purchasebutton.isEnabled();
		
		
		
		System.out.println("button status is :"+stATUS);
		
		if(stATUS=true) {
			System.out.println(" purchase button is enable ");
			Reporter.log("purchase button is enable  :",true);
		}
		else{
			System.out.println(" purchase button is disable ");
			Reporter.log("purchase button is disable :",true);
		}
		
	}
	
	public void clickONPurchaseBUtton() {
		
		Purchasebutton.click();
	}
	
	public void currencyshowing() {
		
		String val = driver.findElement(By.xpath("//input[@formcontrolname='cryptoAmount' and @class='ng-untouched ng-pristine ng-valid' ]")).getText();
		System.out.println("User enter amount  :"+val);
		
		String val1 = driver.findElement(By.xpath("//input[@formcontrolname='fiatAmount' and @class='ng-dirty ng-valid ng-touched' ]")).getText();
		System.out.println("User enter amount  :"+val1);
		
		
	}
	
}

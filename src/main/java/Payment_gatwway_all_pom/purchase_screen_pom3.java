package Payment_gatwway_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class purchase_screen_pom3 {
	WebDriver driver;
	@FindBy(xpath="//input[@formcontrolname='fiatAmount']")
	WebElement amountfield;
	
	@FindBy(xpath="(//span[@class='font-bold'])[3]")
	WebElement aftercrptocurrncy;
	
	@FindBy(xpath="(//span[@class='font-bold'])[4]")
	WebElement afterusd;
	
	@FindBy(xpath="//button[text()='Purchase']")
	WebElement Purchasebutton;
	

	public purchase_screen_pom3(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void enteramount() throws InterruptedException {
		
		amountfield.sendKeys("10.5");
		
		Thread.sleep(4000);
		
		String afcrypto = aftercrptocurrncy.getText();
		System.out.println("after amount enter crrpto currency :"+afcrypto);
		
		String afused = afterusd.getText();
		System.out.println("after amount enter crrpto currency: "+afused);
		
		
	}
	public void purchasebuttonStatus() {
		boolean stATUS = Purchasebutton.isEnabled();
		
		System.out.println("button status is :"+stATUS);
		
		if(stATUS=true) {
			System.out.println(" purchase button is enable ");
		}
		else{
			System.out.println(" purchase button is disable ");
		}
		
	}
	
	public void clickONPurchaseBUtton() {
		
		Purchasebutton.click();
	}
}

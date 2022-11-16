package DEmo_QA_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	

	public DEMO_PurchaseScreeen_pom3(WebDriver driver) {
		
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
	
	public void currencyshowing() {
		
		String val = driver.findElement(By.xpath("//input[@formcontrolname='cryptoAmount' and @class='ng-untouched ng-pristine ng-valid' ]")).getText();
		System.out.println("User enter amount  :"+val);
		
		String val1 = driver.findElement(By.xpath("//input[@formcontrolname='fiatAmount' and @class='ng-dirty ng-valid ng-touched' ]")).getText();
		System.out.println("User enter amount  :"+val1);
		
		
	}
	
}

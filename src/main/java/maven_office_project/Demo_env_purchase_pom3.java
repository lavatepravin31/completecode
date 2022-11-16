package maven_office_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Demo_env_purchase_pom3 {
	WebDriver driver;
	@FindBy(xpath="//input[@formcontrolname='fiatAmount']")
	WebElement amountfield;
	
	@FindBy(xpath="(//span[@class='font-bold'])[3]")
	WebElement aftercrptocurrncy;
	
	@FindBy(xpath="(//span[@class='font-bold'])[4]")
	WebElement afterusd;
	
	@FindBy(xpath="//button[text()='Purchase']")
	WebElement Purchasebutton;
	

	public Demo_env_purchase_pom3(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void enteramount() throws InterruptedException {
		
		amountfield.sendKeys("10");
		Reporter.log("Enter valid amount - 10 ",true);
		Thread.sleep(4000);
		
		String afcrypto = aftercrptocurrncy.getText();
		System.out.println("after amount enter crrpto currency :"+afcrypto);
		Reporter.log("after amount enter crrpto currency : "+afcrypto,true);
		
		String afused = afterusd.getText();
		System.out.println("after amount enter usd currency: "+afused);
		Reporter.log("after amount enter usd currency : "+afused,true);
		
	}
	public void purchasebuttonStatus() {
		boolean stATUS = Purchasebutton.isEnabled();
		
		System.out.println("button status is :"+stATUS);
		
		if(stATUS=true) {
			System.out.println(" purchase button is enable ");
			Reporter.log("purchase button is enable  ",true);
		}
		else{
			System.out.println(" purchase button is disable ");
			Reporter.log("purchase button is disable  ",true);
		}
		
	}
	
}



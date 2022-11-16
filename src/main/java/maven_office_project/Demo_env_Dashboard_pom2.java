package maven_office_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demo_env_Dashboard_pom2 {
	WebDriver driver;
	
	@FindBy(xpath="(//span[text()='Purchase'])[1]")
	WebElement purchasebutton;
	
	@FindBy(xpath="(//span[@class='font-bold'])[1]")
	WebElement cryptobalance;
	
	@FindBy(xpath="(//span[@class='font-bold'])[2]")
	WebElement usdbalance;
	
	public Demo_env_Dashboard_pom2(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void clickonpurchase() throws InterruptedException {
		purchasebutton.click();
		
		Thread.sleep(7000);
		
		String cr = cryptobalance.getText();
		System.out.println("crypto balance is "+cr);
		
		String usd = usdbalance.getText();
		System.out.println("usd amount is "+usd);
		
	}

}

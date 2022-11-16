package Hamberger_Window_all_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HambergerMenu_mybalance_Window_pom4 {

	
WebDriver driver ;
	
	@FindBy(xpath="//li[text()='My Balance']")
	WebElement mybalancebutton;
	
	@FindBy(xpath = "(//span[@class='info'])[1]")
	WebElement avilablebalance;
	
	@FindBy(xpath = "(//span[@class='info'])[2]")
	WebElement unconfirmedbalance;
	
	
	
	public HambergerMenu_mybalance_Window_pom4(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void maybalance_button() {
		
		mybalancebutton.click();
	}
	
	public void avilabalbalance() {
		String p2 = avilablebalance.getText();
		System.out.println("User avilable balance  :"+p2);
		Reporter.log("User avilable balance : "+p2,true);
		
		String p3 = unconfirmedbalance.getText();
		System.out.println("User unconfirme balance  :"+p3);
		Reporter.log("User unconfirme balance : "+p3,true);
	}
	public void validation() {
		
     WebElement mybalance_window = driver.findElement(By.xpath("//span[text()='My Balance']"));
		
		if (mybalance_window.isDisplayed()) {
			System.out.println(" my balance button is clickable");
			Reporter.log("My balance  button is clickable",true);
			Reporter.log("Passed-Check that functinality of My balance buttton",true);
		}
		else {
			System.out.println("my balance button is not clickable");
			Reporter.log("My balance  button is not  clickable",true);
			Reporter.log("Failed-Check that functinality of My balance buttton",true);
		}
	}
}


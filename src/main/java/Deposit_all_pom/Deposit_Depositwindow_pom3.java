package Deposit_all_pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Factory;

public class Deposit_Depositwindow_pom3 {


	WebDriver driver ;
	@FindBy(xpath="//span[text()='Deposit']")
	WebElement depoistPAge;
	
	
	@FindBy(xpath = "//span[text()='0.00000000']")
	WebElement eightdigitcurrency;
	
	@FindBy(xpath ="(//div[@class='summary-details d-flex justify-content-between']//span)[2]")
	WebElement balance ;

	
	public Deposit_Depositwindow_pom3(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void DepositBalance() {
		String s27 = balance.getText();
		System.out.println("User balance  :"+s27);
		Reporter.log(s27,true);
		
	}
	
	
	
	public void userLanding_depositpage() {
		
		String p1 = depoistPAge.getText();
		System.out.println("user landing on  :"+p1);
	}
	
	public void validation() {
		boolean actual = depoistPAge.isDisplayed();
	
		Assert.assertTrue(actual);
		
		if (depoistPAge.isDisplayed()) {
			System.out.println(" deposit button is clickable");
			Reporter.log("After clicking on deposit buttton ,user landing on deposit window",true);
			Reporter.log("Passed-Check that Deposit button functionality",true);
			
		}
		else {
			System.out.println("deposit button is not clickable");
			Reporter.log("After clicking on deposit buttton ,user is not landing on deposit window",true);
			Reporter.log("Failed-Check that Deposit button functionality",true);
		}
		
	}
	public void numberofdigitcurrency() {
		
		List<WebElement> a1 = driver.findElements(By.xpath("eightdigitcurrency"));
		
		int size1 = a1.size();
		
		
		System.out.println("Size of crypto currency :"+size1);
		
	}
	
}

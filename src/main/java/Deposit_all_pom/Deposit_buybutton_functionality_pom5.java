package Deposit_all_pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class Deposit_buybutton_functionality_pom5 {



	WebDriver driver ;
	@FindBy(xpath="//span[text()='Deposit']")
	WebElement depoistPAge;
	
	
	@FindBy(xpath = "//span[text()='0.00000000']")
	WebElement eightdigitcurrency;
	
	@FindBy(xpath = "//button[text()='Back']")
	WebElement backbutton;
	
	@FindBy(xpath = "//a[text()='Buy']")
	WebElement buy_button;
	
	
	@FindBy(xpath = "//span[text()='Purchase']")
	WebElement landing_page;
	
	public Deposit_buybutton_functionality_pom5(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void depositpage() {
		
		String p1 = depoistPAge.getText();
		System.out.println("user landing on  :"+p1);
	}
	
	public void validation() {
		
		
		if (depoistPAge.isDisplayed()) {
			System.out.println(" deposit button is clickable");
			
			
		}
		else {
			System.out.println("deposit button is not clickable");
		}
		
	}
	public void clickon_buybutton() {
		buy_button.click();
	}
	
	public void userlandingpage_status() {
		String p1 = landing_page.getText();
		System.out.println("User is landing on page :"+p1);
	}
	
	public void afterclickon_buy_button_landing() {
		
		boolean actual = landing_page.isDisplayed();
		
		Assert.assertTrue(actual);
		
		if (landing_page.isDisplayed()) {
			System.out.println("BUY  button is working ,test case pass ");	
			Reporter.log("Buy button is clickable ,user is landing on purchase window ",true);
			Reporter.log("Passed-Check that Buy button functionality.",true);
		}
		else {
			System.out.println("BUY button is not  working ");
			Reporter.log("Buy button is not  clickable ,user is not landing on purchase window ",true);
			Reporter.log("failed-Check that Buy button functionality.",true);
		}
	}
	
}

package Deposit_all_pom;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class Back_button_functinality_pom4 {

	WebDriver driver ;
	@FindBy(xpath="//span[text()='Deposit']")
	WebElement depoistPAge;
	
	
	@FindBy(xpath = "//span[text()='0.00000000']")
	WebElement eightdigitcurrency;
	
	@FindBy(xpath = "//button[text()='Back']")
	WebElement backbutton;
	
	
	@FindBy(xpath = "//span[text()='My Balance']")
	WebElement landingonbashbaord;
	
	public Back_button_functinality_pom4(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void depositpage() {
		
		String p1 = depoistPAge.getText();
		System.out.println("user landing on  :"+p1);
	}
	
//	public void validation() {
//		if (depoistPAge.isDisplayed()) {
//			System.out.println(" deposit button is clickable");
//			
//		}
//		else {
//			System.out.println("deposit button is not clickable");
//		}
//		
//	}
	
	public void validation1() {
		boolean actual=depoistPAge.isDisplayed();

        Assert.assertTrue(actual);
        
   if(actual==true) {
	   Reporter.log("Back button is clickable");
   }
   else {
	   Reporter.log("Back button is not clickable");
   }
	}
	
	
	public void backbutton_click() {
		backbutton.click();
	}
	
	public void userlandingpage_status() {
		String p1 = landingonbashbaord.getText();
		System.out.println("User is landing on page :"+p1);
		
	}
	
	public void afterclickon_back_button_landing() {
		
		if (landingonbashbaord.isDisplayed()) {
			System.out.println("back button is working ");	
			Reporter.log("After clicking on back button user is land on Dashboard",true);
			Reporter.log("Passed-Check that Back button functionality",true);
		}
		else {
			System.out.println("back button is not  working ");
			Reporter.log("After clicking on back button user is not land on Dashboard",true);
			Reporter.log("Failed-Check that Back button functionality",true);
		}
	}
	
}

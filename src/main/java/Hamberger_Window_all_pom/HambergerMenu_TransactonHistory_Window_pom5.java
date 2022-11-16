package Hamberger_Window_all_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HambergerMenu_TransactonHistory_Window_pom5 {
	
WebDriver driver ;
	
	@FindBy(xpath="//li[text()='Transaction History']")
	WebElement transaction_historybuttton;
	
	@FindBy(xpath="//span[text()='Transaction History']")
	WebElement landing_page;
	
	@FindBy(xpath="(//h3[text()='LTC'])[1]")
	WebElement click_on_transaction;
	
	
	public HambergerMenu_TransactonHistory_Window_pom5(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void hambergerButton() {
		
		transaction_historybuttton.click();
	}
	
	public void landing_pagename() {
		
		String l1 = landing_page.getText();
		System.out.println("user landing on :"+l1);
		Reporter.log("user landing on :" +l1,true);
	}
	public void validation() {
		WebElement Transaction_History = driver.findElement(By.xpath("//span[text()='Transaction History']"));

		if (Transaction_History.isDisplayed()) {
			System.out.println(" transaction history button is clickable");
			Reporter.log("Transaction history  button is clickable",true);
			Reporter.log("Passed-Check that functinality of Transaction history buttton",true);
		}
		else {
			System.out.println("transaction history button is not clickable");
			Reporter.log("Transaction history  button is  not clickable",true);
			Reporter.log("Failed-Check that functinality of Transaction history buttton",true);
		}
	}
	
	public void click_transaction()
	{
		click_on_transaction.click();
		
	}
	
}



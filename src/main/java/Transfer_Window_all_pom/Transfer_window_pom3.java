package Transfer_Window_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Transfer_window_pom3 {

	
   WebDriver driver ;
	
	@FindBy(xpath="//select[@name='favorite']")
	WebElement Click_on_dropdown_button;
	
	@FindBy(xpath = "//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']")
	WebElement processing_fee;
	
	@FindBy(xpath = "//div[@class='input-field']//input[@id='mat-input-0']")
	WebElement processingfee1;
	 double w1=5.0E-4;
	 double w2=0;
	
	public Transfer_window_pom3(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void ClickON_Dropdown() {
		
		Select s=new Select(Click_on_dropdown_button);
	     s.selectByVisibleText(" 3rd Party ");   
	}
	
	
	public void Third_party_processing_fee_validation() {
		boolean s1 = processingfee1.isDisplayed();
		System.out.println("processing fee showing "+s1);
		String s2 = processingfee1.getText();
		Assert.assertEquals(s2, w1,"processing fee 0.0005 not match ");
		
		
		if (processingfee1.isDisplayed()) {
			String s21 = processingfee1.getText();
			System.out.println(s21);
			System.out.println("processing fee for 3 rd party is showing  ");
			Reporter.log("processing fee for 3 rd party is showing ",true);
			
		}
		else {
			System.out.println("processing fee is not showing ");
		}
		
	}
	
	public void casino_processing_fee_validation() {
		Select s6=new Select(Click_on_dropdown_button);
		s6.selectByVisibleText(" Extreme ");
		String s11 = processing_fee.getText();
		Assert.assertEquals(s11, w2,"processing fee 0 not match ");
		
		if (processing_fee.isDisplayed()) {
			String s111 = processing_fee.getText();
			System.out.println(s111);
			System.out.println("processing fee for extreme casino is showing zero");
			Reporter.log("processing fee for extreme casino is showing zero ",true);
		}
		else {
			System.out.println("processing fee is not showing ");
		}
	}
}

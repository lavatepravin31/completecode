package Hamberger_Window_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Transaaction_history_popup {

WebDriver driver ;
    @FindBy(xpath="(//div[@class='items']//h2)[1]")
    WebElement type1;
	@FindBy(xpath="(//div[@class='items']//h2)[2]")
	WebElement type2;
	@FindBy(xpath="(//div[@class='items']//h2)[3]")
	WebElement type3;
	@FindBy(xpath="(//div[@class='items']//h2)[4]")
	WebElement type4;
	@FindBy(xpath="(//div[@class='items']//h2)[5]")
	WebElement type5;
	@FindBy(xpath="(//div[@class='items']//h2)[6]")
	WebElement type6;
	@FindBy(xpath="(//div[@class='items']//h2)[7]")
	WebElement type7;
	
	@FindBy(xpath="(//div[@class='items']//h4)[1]")
	WebElement type8;
	
	
	
	public Transaaction_history_popup(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void data_on_popup() {
		
		String pp0 = type1.getText();
		Reporter.log("Currency is : "+pp0,true);
		
		String pp1 = type2.getText();
		Reporter.log("Type is : "+pp1,true);
		
		String pp2 = type3.getText();
		Reporter.log("amount is : "+pp2,true);
		
		String pp3 = type4.getText();
		Reporter.log("fiat value is  : "+pp3,true);
		
		String pp4 = type5.getText();
		Reporter.log("date is : "+pp4,true);
		
		String pp8 = type6.getText();
		Reporter.log("transaction hash is  : "+pp8,true);
		
		String pp9 = type7.getText();
		Reporter.log("status is : "+pp9,true);
		
		Reporter.log("passed- Verify that user see transaction detail "+pp9,true);
	}
	
	public void validation_123data() {
		
		if (type8.isDisplayed()) {
			
			Reporter.log("Passed-After click on transaction txn popup is  open");
		}
		
		else {
			Reporter.log("Failed-After click on transaction txn popup is not open");
		}
	}
	
}

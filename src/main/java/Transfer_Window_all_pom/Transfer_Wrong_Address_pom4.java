package Transfer_Window_all_pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Transfer_Wrong_Address_pom4 {

WebDriver driver ;
	
	@FindBy(xpath="//input[@placeholder='Destination Address']")
	WebElement Destination_address_field;
	
	@FindBy(xpath="//select[@name='favorite']")
	WebElement Click_on_dropdown_button;
	
	@FindBy(xpath="//input[@formcontrolname='fiatAmount']")
	WebElement Enter_amount;
	
	@FindBy(xpath="//button[text()='Quick Transfer']")
	WebElement quickTransfer_buttton;
	
	@FindBy(xpath="//button[text()='Quick Transfer']")
	WebElement Failed_Popup;
	
	public Transfer_Wrong_Address_pom4(WebDriver driver)
	{
		this.driver=driver;
	}
	
     public void ClickON_Dropdown() {
		
		Select s=new Select(Click_on_dropdown_button);
	     s.selectByVisibleText(" 3rd Party ");   
	}
	
	public void Ltc_transfer_btc_address_enter_error() throws InterruptedException {
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		act.click(Destination_address_field).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		
		Destination_address_field.sendKeys("bc1qwtrs7f42f9fl3339rg4kruy678d6q9eake5ww5");
		Reporter.log("Enter BTC address on LTC address Field",true);
	}
	public void Btc_transfer_ltc_address_enter_error() throws InterruptedException {
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		act.click(Destination_address_field).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		
		Destination_address_field.sendKeys("LQDAeNZFWXYEA4k4zaSyZ4rpfrWPbU1bGS");
		Reporter.log("Enter LTC address on BTC address Field",true);
	}
	
	
	public void enter_amount() {
		Enter_amount.sendKeys("5");
	}
	
	public void clickon_quick_transfer_buttn() throws InterruptedException {
		quickTransfer_buttton.click();
		Thread.sleep(2000);
		
	}
	
	public void failed_popup_validation() {
		
		boolean f1 = Failed_Popup.isDisplayed();
		if (Failed_Popup.isDisplayed()) {
			String v1 = Failed_Popup.getText();
			Reporter.log(v1,true);
			//System.out.println(" failed pop :  "+v1);
			System.out.println(" failed pop is display");
			Reporter.log("failed pop is display"+v1,true);
			
			Reporter.log("Passed- Verify that user should not able to enter LTC address in destination address field  of BTC transfer window( BTC).",true);
		}
		else {
			System.out.println("failed pop is not display");
		}
		
		
	}
	
	
}

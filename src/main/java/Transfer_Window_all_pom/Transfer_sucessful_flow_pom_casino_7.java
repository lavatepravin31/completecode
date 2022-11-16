package Transfer_Window_all_pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Transfer_sucessful_flow_pom_casino_7 {
WebDriver driver ;
	
	@FindBy(xpath="(//span[text()='Transfer'])[2]")
	WebElement Click_on_ltc_transfer_button;
	
	@FindBy(xpath="//select[@name='favorite']")
	WebElement Click_on_dropdown_button;
	
	@FindBy(xpath="//input[@formcontrolname='fiatAmount']")
	WebElement Enter_amount;
	
	@FindBy(xpath = "//mat-error[text()='Insufficiant Balance']")
	WebElement errormessg;
	
	@FindBy(xpath="//button[text()='Quick Transfer']")
	WebElement quickTransfer_buttton;
	
	@FindBy(xpath="(//div[@class='text-end']//h5)[2]")
	WebElement Avilable_balance ;
	
	
	
	public Transfer_sucessful_flow_pom_casino_7(WebDriver driver)
	{
		this.driver=driver;
	}
	  public void ClickON_Dropdown() {
			
			Select s=new Select(Click_on_dropdown_button);
			s.selectByVisibleText(" Extreme "); 	
		}
	     public void enter_amount() {
	    		Enter_amount.sendKeys("5");
	    		Reporter.log("Enter maximum amount in amount field : 5");
	   
	     if (quickTransfer_buttton.isEnabled()) {
 			
 			System.out.println("quick transfer button is enabled " );
 			Reporter.log("Quick transfer button is enabled",true);
	     }
	     
	     else {
 			System.err.println(" quick transfer button is disabled");
 			Reporter.log("Quick transfer button is disabled",true);
	     } 
	     
	     
	     }
	     public void clickon_quick_transfer_buttn() throws InterruptedException {
	 		quickTransfer_buttton.click();
	 		
	 		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	     }
	 		
}

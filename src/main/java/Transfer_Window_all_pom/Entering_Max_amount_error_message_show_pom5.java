package Transfer_Window_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class Entering_Max_amount_error_message_show_pom5 {

	 @DataProvider(name="SearchProvider1")
	    public static Object[][] getDataFromDataprovider(){
	        return new Object[][] {
	            { "11"},
	            { "12" },
	            { "13"},
	            
	        }; 

		 }

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
	
	
	
	public Entering_Max_amount_error_message_show_pom5(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
       public void ClickON_Dropdown() {
		
		Select s=new Select(Click_on_dropdown_button);
		s.selectByVisibleText(" Extreme "); 	
	}
        public void enter_amount() {
   		Enter_amount.sendKeys("111");
   		Reporter.log("Enter maximum amount in amount field : 111");
   	}
        
        
        public void Dataprovider_enter_amount(int amount) {
       		Enter_amount.sendKeys("amount");
       	}
        public void errormessage_validation() {
        	String e = errormessg.getText();
        	
        	
        	if (errormessg.isDisplayed()) {
        		System.out.println("error message is:  "+e);
        		System.out.println("error message is showing for max amount");
        		
        		Reporter.log("Error message is :"+e,true);
        		//Reporter.log("Passed-Check the user can not able to enter amount more than available balance.",true);
			}
        	
        	else {
        		System.out.println("error message is not showing for max amount");	
			}
        }
        
        public void Quicktransfer_button_status() {
        	
        	if (quickTransfer_buttton.isEnabled()) {
    			
    			System.out.println("quick transfer button is enabled " );
    			Reporter.log("Quick transfer button is enabled",true);
    			Reporter.log("FAiled- Check the user can not able to enter amount more than available balance.",true);
    			
    				
    		}
    		else {
    			System.err.println(" quick transfer button is disabled");
    			Reporter.log("Quick transfer button is disabled",true);
    			//Reporter.log("Failed- After entring valid amount ,Quick transfer button is disabled",true);
    			Reporter.log("Passed- Check the user can not able to enter amount more than available balance .",true);
    		}
        	
        }
    public void Errormessage_status() {
        	
        	if (errormessg.isDisplayed()) {
    			
    			System.out.println("quick transfer button is enabled " );
    				
    		}
    		else {
    			System.err.println(" quick transfer button is disabled");
    		}
        	
        }
        
        
        public void enter_correct_amount() {
       		Enter_amount.sendKeys("5");
       		Reporter.log("Enter valid amount : 5",true);
	
}
       public void avilable_balance() {
    	   
    	   String s1 = Avilable_balance.getText();
    	   Reporter.log("avaliabale balance: "+s1,true);
       }
}

package withdrwal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pay_to_userWithdral_pom1 {
	WebDriver driver;
	
	@FindBy(xpath="//button[@type='button'][2]")
	WebElement Pay_to_User_withdwarlButton;
	
	
	public Pay_to_userWithdral_pom1(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickonpaytouserwithdralbutton() {
		
		Pay_to_User_withdwarlButton.click();
	}
	
}

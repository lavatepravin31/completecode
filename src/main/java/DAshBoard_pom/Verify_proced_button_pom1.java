package DAshBoard_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Verify_proced_button_pom1 {
	WebDriver driver ;
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement ProceedButton;
	
	
	public Verify_proced_button_pom1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void ClickONProceedButton() {
		
		ProceedButton.click();
	}
	

	

}

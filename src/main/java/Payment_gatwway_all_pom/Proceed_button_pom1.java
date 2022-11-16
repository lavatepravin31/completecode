package Payment_gatwway_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Proceed_button_pom1 {
	
	WebDriver driver ;
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement ProceedButton;
	
	
	public Proceed_button_pom1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void ClickONProceedButton() {
		
		ProceedButton.click();
	}
	
}

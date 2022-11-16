package Transfer_Window_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Transfer_pom1 {


	WebDriver driver ;
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement ProceedButton;
	
	
	public Transfer_pom1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void ClickONProceedButton() {
		
		ProceedButton.click();
	}
	
}


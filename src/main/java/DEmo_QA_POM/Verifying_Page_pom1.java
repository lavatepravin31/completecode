package DEmo_QA_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Verifying_Page_pom1 {
	
	WebDriver driver ;
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement ProceedButton;
	
	
	public Verifying_Page_pom1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void ClickONProceedButton() {
		
		ProceedButton.click();
	}
	

}

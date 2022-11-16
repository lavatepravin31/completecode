package maven_office_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demo_env_VerifyingPage_pom1 {
	
	WebDriver driver;
	
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceedbutton;
	
	public Demo_env_VerifyingPage_pom1 (WebDriver driver) {
		this.driver=driver;
	}
	
	public void CLickonProceedbutton() {
		
		proceedbutton.click();
	}
	
	

}

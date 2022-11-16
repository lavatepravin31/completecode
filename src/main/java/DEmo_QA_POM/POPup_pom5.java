package DEmo_QA_POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POPup_pom5 {
	WebDriver driver;
	
	@FindBy(xpath="//h3[text()='Payment Failed']")
	WebElement popupText;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement CloseButton;
	
	public POPup_pom5(WebDriver driver) {
		this.driver=driver;
	}
	
	public void handle_pop() {
		
//		String one = popupText.getText();
//		System.out.println("status is : "+one);
		
		CloseButton.click();
		
	}

}

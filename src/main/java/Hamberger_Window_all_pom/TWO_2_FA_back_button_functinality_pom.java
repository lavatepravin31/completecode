package Hamberger_Window_all_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class TWO_2_FA_back_button_functinality_pom {

WebDriver driver ;
	
	@FindBy(xpath="//li[text()='Preferences']")
	WebElement Two_FA_button;
	
	@FindBy(xpath = "//span[text()='2FA']")
	WebElement userlandingon2fa;
	
	@FindBy(xpath = "//span[@class='mat-slide-toggle-thumb']")
	WebElement enabla2FA;
	
	@FindBy(xpath = "//button[text()='Back']")
	WebElement backbutton;
	
	@FindBy(xpath = "//div[@class='nav-bar']")
	WebElement clickonhabugermenu;
	
	
	@FindBy(xpath="//span[text()='My Balance']")
	WebElement   dashboardpage;
	
	public TWO_2_FA_back_button_functinality_pom(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void TWO_2fa_backbutton_click() {
		backbutton.click();
		
	}
	public void validation_backbutton() {
		
		WebElement mybalance = driver.findElement(By.xpath("//span[text()='My Balance']"));
		String pp = mybalance.getText();
		if (mybalance.isDisplayed()) {
			Reporter.log("Back button is working,meaning user landing on :"+pp,true);
			Reporter.log("Passed- 2 FA back button is working",true);
		}
		else {
			Reporter.log(" failed-Back button is not working, ",true);
			Reporter.log("Failed- 2 FA back button is working",true);
		}
	}
}

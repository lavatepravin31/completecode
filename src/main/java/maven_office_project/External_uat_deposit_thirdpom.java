package maven_office_project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class External_uat_deposit_thirdpom {

WebDriver driver;


	@FindBy(xpath="//h3[text()='The card you have entered is either incorrect or does not support 3DS. Please try again with a different card.']")
	WebElement popmessage;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement closebutton;
	
	
	public External_uat_deposit_thirdpom (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void dsPaymentfailedmessage()
	{
		String dsmessage = popmessage.getText();
		System.out.println("3 ds payment message is "+dsmessage);
		
		closebutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
	}
	
	
}

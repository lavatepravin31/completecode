package Hamberger_Window_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HambergerMenu_profile_Window_pom3 {

WebDriver driver ;
	
	@FindBy(xpath="//li[text()='Profile']")
	WebElement ProfileButton;
	
	@FindBy(xpath = "//span[text()='My Profile']")
	WebElement profilepage;
	
	@FindBy(xpath = "(//div[@class='input-field']//input)[1]")
	WebElement email;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@placeholder='Country']")
	WebElement country;
	
	@FindBy(xpath = "//input[@formcontrolname='dob']")
	WebElement dob;
	
	
	
	public HambergerMenu_profile_Window_pom3(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void ClickONProfileButton() {
		
		ProfileButton.click();
	}
	
	public void LAnding_profilepage() {
		
		String p1 = profilepage.getText();
		
		System.out.println("user landing on  :"+p1);
		
	}
	
	public void profiledata() {
		String p2 = email.getText();
		System.out.println("User email  :"+p2);
		
		String p3 = firstname.getText();
		System.out.println("user First name  :"+p3);
		
		String p4 = lastname.getText();
		System.out.println("user last name  :"+p4);
		
		String p5 = country.getText();
		System.out.println("user country  :"+p5);
		
		String p6 = dob.getText();
		System.out.println("user dob  :"+p6);
	}
	
	public void validation() {
		
		if (profilepage.isDisplayed()) {
			System.out.println(" profile button is clickable");
			Reporter.log("profile button is clickable",true);
			Reporter.log("Passed-Check that functinality of profile buttton",true);
		}
		else {
			System.out.println("profile button is not clickable");
			Reporter.log("profile button is not clickable",true);
			Reporter.log("Failed-Check that functinality of profile buttton",true);
		}
	}
	
}

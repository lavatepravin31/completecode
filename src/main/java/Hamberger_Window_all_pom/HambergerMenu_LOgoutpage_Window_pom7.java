package Hamberger_Window_all_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HambergerMenu_LOgoutpage_Window_pom7 {

	
WebDriver driver ;
	
	@FindBy(xpath="//span[text()='Logout']")
	WebElement Logoutbutton;
	
	@FindBy(xpath = "//button[text()='Close']")
	WebElement closebuttonpopup;
	
	@FindBy(xpath = "//button[text()='Logout']")
	WebElement logoutpopup;
	
	
	@FindBy(xpath = "//input[@placeholder='Email Address']")
	WebElement emailfiledvisible;
	
	
	public HambergerMenu_LOgoutpage_Window_pom7(WebDriver driver)
	{
		this.driver=driver;
	}
	
    public void logoutbuttonclick() {
		
		Logoutbutton.click();
	}
	public void closebuttonpopup() {
		closebuttonpopup.click();
		
	}
	public void logoutbuttonclick1popup() {
		
		logoutpopup.click();
		
		
	}
	public void validation() {
		
		WebElement landingpage = driver.findElement(By.xpath("//h3[text()='Do you want to logout ?']"));
		String text = landingpage.getText();
		Reporter.log("User is landing on  : "+text,true);
		
		
	if (landingpage.isDisplayed()) {
		System.out.println(" logout button is clickable");
		Reporter.log("logout button is clickable",true);
		
		Reporter.log("Passed-Check that functinality of logout button",true);
		
		
		
	}
	else {
		System.out.println("logout button  is not clickable");
		Reporter.log("logout button is not clickable",true);
		
		Reporter.log("Failed-Check that functinality of logout button",true);
	}
	
	}
	
	public void after_click_on_logoutpop_validation() {
		WebElement page = driver.findElement(By.xpath("//span[text()='Welcome to']"));
		String lading1 = driver.findElement(By.xpath("//span[text()='Welcome to']")).getText();
		String lading2 = driver.findElement(By.xpath("//span[text()='NivaPay']")).getText();
		Reporter.log("user landing on "+lading1,true);
		
		if (page.isDisplayed()) {
			Reporter.log("logout button is clickable,user is landing on welcome to niva pay page",true);
			
			Reporter.log("Passed-Check that functinality of logout button",true);
		
		}
		else {
            Reporter.log("logout button is not clickable,user is not landing on welcome to niva pay page",true);
			
			Reporter.log("Failed-Check that functinality of logout button",true);
			
		}
	}
	
	
	public void closebutton_fuctionality_popup() {
		
WebElement logout = driver.findElement(By.xpath("//li[text()='Profile']"));
		
if (logout.isDisplayed()) {
	Reporter.log("close  button is clickable,user is landing on hamberger menu ",true);
	
	Reporter.log("Passed-Check that functinality of close button",true);
	
}
else {
    Reporter.log("close  button is not  clickable,user is not landing on hamberger menu ",true);
	
	Reporter.log("Failed-Check that functinality of close button",true);
}
	}
}


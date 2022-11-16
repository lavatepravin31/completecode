package Hamberger_Window_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hamberger_landing_on_dashboard_pom2 {


	WebDriver driver ;
	
	@FindBy(xpath="//div[@class='header']//div[@class='nav-bar']")
	WebElement hambermenu;
	
	@FindBy(xpath="//img[@src='./../../../../assets/icons/nav-icon.svg']")
	WebElement hambermenu_click_1;
	
	
	public Hamberger_landing_on_dashboard_pom2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void ClickON_HambergerMenu() {
		
		hambermenu.click();
	}
	
public void ClickON_HambergerMenu_new1() {
		
	hambermenu_click_1.click();
	}
	
}

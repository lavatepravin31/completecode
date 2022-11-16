package New_user_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class New_user_page_pom3 {

	WebDriver driver ;
	@FindBy(xpath="//span[text()='My Balance']")
	WebElement mybalancepage;
	
	@FindBy(xpath = "//h2[text()='Welcome rrrrr']")
	WebElement Newusername;
	
	
	
	public New_user_page_pom3(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void profilepage_validation() {
		
		if (mybalancepage.isDisplayed()) {
			String status = mybalancepage.getText();
			System.out.println("New user landing on my balance page   ::  "+status);
			
			String name = Newusername.getText();
			System.out.println("New user name is    ::  "+name);	
		}
		else {
			System.out.println("New user not landing on my balance page");
		}
	}
	
}

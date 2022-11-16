package New_user_all_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Factory;

public class New_user_profile_page_pom2 {
WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement first_name;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement last_name;
	
	@FindBy(xpath="//select[@formcontrolname='country']")
	WebElement countrydropdown;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement datepicker;
	
	@FindBy(xpath = "//span[@id='mat-calendar-button-0']")
	WebElement selectyear;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement backyear;
	
	@FindBy(xpath = "//div[text()=' 1994 ']")
	WebElement selectyear1994;
	
	@FindBy(xpath = "//div[text()=' JAN ']")
	WebElement seleectmonth;
	
	@FindBy(xpath = "//div[text()=' 29 ']")
	WebElement selectdate;
	

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextbutton_status;
	
	@FindBy(xpath = "//mat-error[text()='Enter valid First Name']")
	WebElement errormessageFirstNAme;
	
	@FindBy(xpath = "//mat-error[text()='Enter valid Last Name']")
	WebElement errormessage_LastNAme;
	
	
	
	public New_user_profile_page_pom2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enter_first_name1() {
		first_name.sendKeys("pravin");
	}
	public void first_name_validation() {
		first_name.sendKeys("!@#$%^&*(");
	}
	public void enter_last_name1() {
		last_name.sendKeys("lavate");
	}
	public void last_name_validation() {
		last_name.sendKeys("123456");
	}
	
	public void selectcountry() {
		
		Select s=new Select(countrydropdown);
		s.selectByIndex(25);
	}
	
	public void valid_date_selectdate() {
		datepicker.click();
		selectyear.click();
		backyear.click();
		selectyear1994.click();
		seleectmonth.click();
		selectdate.click();
	}
	
	public void nextbutton_status() {
		
	if (nextbutton_status.isEnabled()) {
		
		System.out.println("Next button is enable");	
	}
	else {
		System.out.println("Next button is disable");
	}
	}
	
	public void errormessagefirstName() {
		if (errormessageFirstNAme.isDisplayed()) {
			String status = errormessageFirstNAme.getText();
			System.out.println("error mesage is  ::  "+status);
				
		}
		else {
			System.out.println("Next button is disable");
		}
	}
	
	public void errormessage_lastName() {
		if (errormessage_LastNAme.isDisplayed()) {
			String status = errormessage_LastNAme.getText();
			System.out.println("error mesage is  ::  "+status);
				
		}
		else {
			System.out.println("Next button is disable");
		}
	}
	
	public void click_on_next_button() {
		nextbutton_status.click();
	}
	
}

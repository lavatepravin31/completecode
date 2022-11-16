package maven_office_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Quickpaypom {
	
	WebDriver driver;
	
	
	@FindBy (xpath="(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[1]")
	WebElement depositamount;
	
	
	@FindBy (xpath="(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[2]")
	WebElement avilablebalance;
	
	
	@FindBy(xpath = "//a[text()='Pay']")
	WebElement paybutton;
	
	@FindBy(xpath = "(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[2]")
	WebElement ltcbalance;
	
	public Quickpaypom(WebDriver driver) {
	this.driver=driver;
	}
	
	
	
	public void paybutton () throws InterruptedException {
		paybutton.click();
		Thread.sleep(5000);
		String ltc = ltcbalance.getText();
		
		System.out.println("ltc crypto is : "+ltc);
		
		
	}
}

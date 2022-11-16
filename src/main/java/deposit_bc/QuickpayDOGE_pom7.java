package deposit_bc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickpayDOGE_pom7 {
	
	WebDriver driver;
	
//	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-item css-13i4rnv-MuiGrid-root'])[7]")
//	WebElement dogelogo1;
	
	@FindBy(xpath="(//div[ @class='MuiGrid-root MuiGrid-item css-13i4rnv-MuiGrid-root']//span)[4]")
	WebElement dogelogo12;
	
	@FindBy(xpath="//a[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium makeStyles-btn-7 css-11xeemu-MuiButtonBase-root-MuiButton-root']")
	WebElement paybutton;
	
	
	@FindBy(xpath="(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[2]")
	WebElement cryptocurrencydoge;
	
	public QuickpayDOGE_pom7(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void selectdogecurrency() {
		//driver.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item css-13i4rnv-MuiGrid-root'])[7]")).click();
		dogelogo12.click();
		
	}
	
	public void paybuttonclick() {
		
		paybutton.click();
	}
	
	
	public void cryptocurrecyodoge() {
		String curency = cryptocurrencydoge.getText();
		
		System.out.println("currency is : "+curency);
	}


	
	
}

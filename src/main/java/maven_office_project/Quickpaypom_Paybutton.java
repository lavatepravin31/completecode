package maven_office_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Quickpaypom_Paybutton {
	
	WebDriver driver;
	
	
	@FindBy (xpath="(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[1]")
	WebElement depositamount;
	
	
	@FindBy (xpath="(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[2]")
	WebElement avilablebalance;
	
	
	public Quickpaypom_Paybutton(WebDriver driver) {
	this.driver=driver;
	}
	
	
	public  void resultshow() throws InterruptedException
	{
		String result1 = depositamount.getText();
		
		Thread.sleep(10000);
		String result2 = avilablebalance.getText();
		
		System.out.println("enter amount by user"+result1);
		System.out.println("avilable balance in wallet"+result2);
	}
	
	public void Quickpaybuttonclick() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Pay']")).click();
		Thread.sleep(5000);
		WebElement resultltc = driver.findElement(By.xpath("(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[2]"));
		
		String ltc = resultltc.getText();
		System.out.println(" Litcoin is : "+ltc);
	}
	
	
}

package deposit_bc;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.base.Ticker;

public class PaywithBITcoin_pom4 {
	WebDriver driver;
	
	@FindBy(xpath="(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[2]")
	WebElement btccryptobalance;
	
	@FindBy(xpath="//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1hqmx7p-MuiTypography-root']")
	WebElement bitcoinpage;
	
	public PaywithBITcoin_pom4(WebDriver driver) {
		this.driver=driver;
	}

	public void balance1() {
		WebElement one = driver.findElement(By.xpath("(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[2]"));
		String btc = one.getText();
		System.out.println(btc);
	}
	public void balance2() {
		WebElement two = driver.findElement(By.xpath("(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[2]"));
		String two1=	two.getText();
		System.out.println(two1);
		
			}
	
//	public void btc() {
//		
//		//WebElement aa = driver.findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-d2b72f-MuiButtonBase-root-MuiMenuItem-root'])[2]"));
//		WebElement aa=driver.findElement(By.xpath("(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[2]"));
//		String sy = aa.getText();
//		System.out.println(sy);
//	}
	
}

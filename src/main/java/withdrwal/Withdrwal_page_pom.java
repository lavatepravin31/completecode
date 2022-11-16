package withdrwal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Withdrwal_page_pom {
	WebDriver driver;
	@FindBy(xpath="(//input[@aria-invalid='false'])[1]")
	WebElement walletaddressfild;
	
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1n4twyu-MuiInputBase-input-MuiOutlinedInput-input']")
	WebElement amountfield;
	

	
	
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-item css-13i4rnv-MuiGrid-root'])[3]")
	WebElement litcoinlogoclick;
	
	@FindBy(xpath="(//p[@class='MuiTypography-root MuiTypography-body1 css-cysylm-MuiTypography-root'])[2]")
	WebElement avilbalance;
	
	public Withdrwal_page_pom(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void enterwallet_validaddress1() throws InterruptedException {
		Actions act= new Actions(driver);
		act.click(walletaddressfild).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		walletaddressfild.sendKeys("LQNb9DFSuNAzMBYNG4VAkDHytNpVm3d1Ry");
		
		Thread.sleep(6000);
	}
		public void enterwallet_invlaidaddress1() throws InterruptedException {
			Actions act= new Actions(driver);
			act.click(walletaddressfild).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(2000);
			walletaddressfild.sendKeys("b1LQNb9DFSuNAzMBYNG4VAkDHytNpVm3d1Ry");
			
			Thread.sleep(6000);
		
	}

//	public void enteramount() throws InterruptedException
//	{
//		//Actions act= new Actions(driver);
//		
//		//act.click(amountfield).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
//		Thread.sleep(2000);
//		amountfield.sendKeys("11.5");
	//}
	
	public void clickonlitcoin() {
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item css-13i4rnv-MuiGrid-root'])[3]")).click();
		
	}
	public void avilablebalnce () {
		String ltc = avilbalance.getText();
		System.out.println("avilable balance ltc is :"+ltc);
	}
		
	public void paybutton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	

}

package deposit_bc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferScreen_Pom8 {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Destination Address']")
	WebElement Destinationaddress;
	
	@FindBy(xpath="//input[@formcontrolname='fiatAmount']")
	WebElement AmountField;
	
	@FindBy(xpath="//input[@formcontrolname='cryptoAmount']")
	WebElement cryptoAmount;
	
	@FindBy(xpath="//input[@id='mat-input-0']")
    WebElement Processing_Fee;
	
	
	@FindBy(xpath="//button[text()='Quick Transfer']")
	WebElement Quick_Transfer;
	
	
	
	
	public TransferScreen_Pom8(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void FetchData_onTransferScreen() {
		String first = Destinationaddress.getText();
		System.out.println("Destinationaddress is :"+first);
		
		String second = AmountField.getText();
		System.out.println("AmountField is :"+second);
		
		String Third = cryptoAmount.getText();
		System.out.println("cryptoAmount is :"+Third);
		
		String Fourth = Processing_Fee.getText();
		System.out.println("Processing_Fee is :"+Fourth);
	}
	
	public void clickon_QuicktransferButton() {
		Quick_Transfer.click();
	}
}

package Park;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import LiberyFile.BaseClass;

public class Test123 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2ODEzODc0OSwiZXhwIjoxNjY4MTYwMzQ5fQ.IwE8MH4aBP3_uA-FVqmgX6V-yOz1lfZhNM-Y-alr5pE");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	  Reporter.log(" passed-proceed button is working");
	  Thread.sleep(5000); 
	  driver.findElement(By.xpath("//div[@class='header']//div[@class='nav-bar']")).click();
	  
	  
  }
}

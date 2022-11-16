package RunnerClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_testNG {
	WebDriver driver;
	
	 @DataProvider(name="SearchProvider")
     public static Object[][] getDataFromDataprovider(){
         return new Object[][] {
             { "pravin", "pravinl@nu10.co", "11"},
             { "ruchita", "ruchitap@nu10.co", "12" },
             { "shankar", "shankarm@nu10.co","13"}
         }; 

	 }
	
  @Test
  public void dataproviderExample() {
	  
	 
  }
}

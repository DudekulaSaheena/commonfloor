package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DSAHEENA\\Desktop\\seleniump1\\chrome driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.commonfloor.com/");
//	
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "n");
	
			
//		Thread.sleep(3000);
		for(String winHandle:driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			
		}
		driver.get("https://demo.opencart.com/");
//		driver.close();


	}
  }


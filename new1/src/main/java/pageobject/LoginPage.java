

package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	
		
		public void loginDetails() throws Exception {
			  
			  WebElement user=driver.findElement(By.xpath("//input[@name='userName']"));
			  user.sendKeys("tutorial");
			  Thread.sleep(1000);
			  
			  WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
			  pass.sendKeys("tutorial");
			  Thread.sleep(1000);
			  
			  WebElement subm=driver.findElement(By.xpath("//input[@name='submit']"));
			  subm.click();
			  Thread.sleep(1000);
		}
		public LoginPage(WebDriver driver) {
			this.driver=driver;
		}
	

}
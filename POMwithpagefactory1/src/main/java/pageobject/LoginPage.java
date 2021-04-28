package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath="//input[@name='userName']")
	WebElement ob;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement ob1;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement subm;

	public void loginDetails() throws InterruptedException {
		ob.sendKeys("tutorial");
		Thread.sleep(1000);
		ob1.sendKeys("tutorial");
		Thread.sleep(1000);
		subm.click();
		Thread.sleep(1000);
			
			
		}
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
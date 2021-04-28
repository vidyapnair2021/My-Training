package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
		public void flight() throws Exception {
			WebElement ra=driver.findElement(By.xpath("//a[@href='reservation.php']"));
			ra.click();
			Thread.sleep(1000);
		}
		public void type() throws Exception {
			
			List<WebElement> radio1=driver.findElements(By.xpath("//input[@name='tripType']"));
			  radio1.get(1).click();
			  Thread.sleep(1000);
		}
		public void passengers() throws Exception {
			
			 WebElement drop=driver.findElement(By.xpath("//select[@name='passCount']"));
			 Select s=new Select(drop);
			 s.selectByValue("3");
			 Thread.sleep(1000);
		}
		public void depart() throws Exception {
			
			WebElement departure=driver.findElement(By.xpath("//select[@name='fromPort']"));
			  Select s2=new Select(departure);
			  s2.selectByValue("San Francisco");
			  Thread.sleep(1000);
		}
		public void frommonth() throws Exception {
			
			WebElement month=driver.findElement(By.xpath("//select[@name='fromMonth']"));
			Select mon=new Select(month);
			mon.selectByValue("6");
			Thread.sleep(1000);
			
		}
		public void today() throws Exception {
			WebElement day=driver.findElement(By.xpath("//select[@name='fromDay']"));
			Select date=new Select(day);
			date.selectByValue("22");
			Thread.sleep(1000);
		}
		public void toport() throws Exception {
			WebElement arrival=driver.findElement(By.xpath("//select[@name='toPort']"));
			Select port=new Select(arrival);
			port.selectByValue("Paris");
			Thread.sleep(1000);
		}
		public void returnmonth() throws Exception {
			
			WebElement month1=driver.findElement(By.xpath("//select[@name='toMonth']"));
			Select mon=new Select(month1);
			mon.selectByValue("11");
			Thread.sleep(1000);
			
		}
		public void returnday() throws Exception {
			WebElement day=driver.findElement(By.xpath("//select[@name='toDay']"));
			Select date=new Select(day);
			date.selectByValue("29");
			Thread.sleep(1000);
		}
		public void service() throws Exception {
			
			List<WebElement> radio=driver.findElements(By.xpath("//input[@name='servClass']"));
			radio.get(2).click();
			Thread.sleep(1000);
		}
		public void airline() throws Exception {
			WebElement airline=driver.findElement(By.xpath("//select[@name='airline']"));
			  Select s8=new Select(airline);
			  s8.selectByVisibleText("Pangea Airlines");
			  Thread.sleep(1000);
		}
		public void submit() throws Exception {
			WebElement con=driver.findElement(By.xpath("//input[@name='findFlights']"));
			con.click();
			Thread.sleep(1000);
		}

}
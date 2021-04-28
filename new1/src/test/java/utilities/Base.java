package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Base {
	public WebDriver driver;
  
  @AfterMethod
  public void afterMethod() {
	  //screenshot
  }
 
  
 @BeforeTest
  public void beforeTest() throws Exception {
	 
	
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\RESHMI\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		  
		    driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/newtours/index.php");
			Thread.sleep(1000);
			driver.manage().window().maximize();  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
package mygitpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewGitTest {
	 WebDriver driver;
  @Test
  public void f() throws AWTException, InterruptedException {
 
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_T);
	  Thread.sleep(1000);
	  
	  String p=driver.getWindowHandle();
	  Set<String>s=driver.getWindowHandles();
	  Iterator<String>i=s.iterator();
	  while(i.hasNext()) 
	  {
		  String c=i.next();
		  if(!(p.equals(c))) {
			  driver.switchTo().window(c);
			  Thread.sleep(1000);
			  	 driver.get("http://demo.guru99.com/test/newtours/index.php");
			  Thread.sleep(1000);
			  driver.switchTo().window(p);
			  Thread.sleep(1000);
		  }
		  
			  }
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RESHMI\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	  
	  driver=new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}


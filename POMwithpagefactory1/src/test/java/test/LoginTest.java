package test;

import org.testng.annotations.Test;


import pageobject.LoginPage;
import utilities.Base;

public class LoginTest extends Base{
  @Test
  public void login() throws InterruptedException {
	  LoginPage ob=new LoginPage(driver);
	  ob.loginDetails();
	  
	  
  }
}

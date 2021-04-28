package test;

import org.testng.annotations.Test;

import pageobject.HomePage;
import utilities.Base;


 
  public class HomeTest extends Base{
	  @Test
	  public void Home() throws Exception {
		  
		  HomePage ob1=new HomePage(driver);
		  ob1.flight();
		  ob1.type();
		  ob1.passengers();
		  ob1.depart();
		  ob1.frommonth();
		  ob1.today();
		  ob1.toport();
		  ob1.returnmonth();
		  ob1.returnday();
		  ob1.service();
		  ob1.airline();
		  ob1.submit();
		  
	  }}
	
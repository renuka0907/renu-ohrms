package Testcasescripts;

import org.testng.annotations.Test;

import Baseclass.Baseclass;
import Pages.HomePage;
import Pages.Loginpage;
import junit.framework.Assert;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HomepageTest extends Baseclass {
	HomePage hp;
	Loginpage lp;
	public HomepageTest()throws IOException{
		super();
	}
  
  @BeforeMethod
  public void setup() throws Exception {
	  initialization();
	  lp=new Loginpage();
	  hp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
	  String HomePageimg=null;
	  takesscreenshot("Homepageimg");
  }
@Test(priority=1)
public void verifyHomepagetitleTest() {
	String homepagetitle=hp.verifyHomePageTitle();
	Assert.assertEquals(homepagetitle,"orangehrms","homepage title not matched");
}
@AfterMethod
public void teardown() {
	
}
}

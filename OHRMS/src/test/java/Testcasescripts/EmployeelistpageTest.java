package Testcasescripts;

import org.testng.annotations.Test;

import Baseclass.Baseclass;
import Pages.Employeelistpage;
import Pages.HomePage;
import Pages.Loginpage;

import org.testng.annotations.BeforeTest;

public class EmployeelistpageTest extends Baseclass {
	HomePage hp;
	Loginpage lp;
	Employeelistpage emplist;
	public EmployeelistpageTest()throws Exception{
		super();
	}
  @BeforeTest
  public void setup() throws Exception {
	  initialization();
	  lp=new Loginpage();
	  hp=lp.login(prop.getProperty("username"),prop.getProperty("password"));	  
  }

  @Test(priority=0)
  public void clickonPIMModule()throws Exception{
	  hp.pimmodulelink();
  }
@Test(priority=1)
public void clickonAddbuttonmodule()throws Exception{
	emplist.clickonAddbutton();
}
}

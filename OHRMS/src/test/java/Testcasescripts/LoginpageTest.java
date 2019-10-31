package Testcasescripts;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import Baseclass.Baseclass;
import Pages.HomePage;
import Pages.Loginpage;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
public class LoginpageTest extends Baseclass {
	HomePage hp;
	Loginpage lp;
	private String Loginpageimg;
	Logger logger=Logger.getLogger(LoginpageTest.class);
String configurepath=System.getProperty("D:\\eclipse-workspace\\OHRMS\\src\\main\\log4j.properties");
	public LoginpageTest()throws IOException{
		super();
	}
  @BeforeMethod
  public void setup() throws Exception {
	  logger.info("initialization method started");
	  initialization();
	  lp=new Loginpage();
  }
  @Test(priority=1)
  public void LoginpageTest() {
	  logger.info("loginpagetitle validation started");
	  String title=lp.validateloginpageTitle();
	  Assert.assertEquals(title,"OrangeHRM");
  }
@Test(priority=2)
public void LoginTest()throws Exception{
	takesscreenshot("loginpageimg");
	logger.info("screenshot captured");
	hp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
	logger.info("login testcase completed");
}
  @AfterMethod
  public void teardown() {
  }

}

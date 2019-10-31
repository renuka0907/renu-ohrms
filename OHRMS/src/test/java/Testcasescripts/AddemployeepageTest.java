package Testcasescripts;
import org.testng.annotations.Test;
import Baseclass.Baseclass;
import Pages.Addemployeepage;
import Pages.Employeelistpage;
import Pages.HomePage;
import Pages.Loginpage;
import Pages.Personaldetailspage;
import java.io.IOException;
import org.testng.annotations.BeforeTest;

public class AddemployeepageTest extends Baseclass{
	HomePage hp;
	Loginpage lp;
	Employeelistpage emplist;
	Addemployeepage addemp;
	Personaldetailspage personaldetailspage;
	public AddemployeepageTest() throws IOException{
		super();
	}
  @BeforeTest
  public void setup()throws Exception{
	  initialization();
	 lp = new Loginpage();
	 hp = lp.login(prop.getProperty("username"),prop.getProperty("password"));
	 emplist=new Employeelistpage();
	 addemp=new Addemployeepage();
	 personaldetailspage=new Personaldetailspage();
  }
  @Test(priority=0)
  public void clickPimmodulelink() throws Exception{
  	hp.pimmodulelink();
  }
  
@Test(priority=1)
public void clickaddbutton() throws Exception{
	hp.Addbuttonlink();
}

@Test(priority=2)
public void createnewuser()throws Exception{
personaldetailspage=addemp.createnewuser(prop.getProperty("firstname"),prop.getProperty("middlename"),prop.getProperty("lastname"));
}
}

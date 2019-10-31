package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class HomePage extends Baseclass {
	public HomePage()throws IOException{
		super();
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Welcome Admin")
	WebElement WelcomeAdmin;
	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement AdminModule;
	@FindBy(xpath="//b[contains(text(),'PIM')]")
	WebElement PIMModule;
	@FindBy(xpath="//b[contains(text(),'Leave')]")
	WebElement LeaveModule;
	@FindBy(xpath="//b[contains(text(),'Time')]")
	WebElement TimeModule;
	@FindBy(xpath="//b[contains(text(),'Recruitment')]")
	WebElement RecruitmentModule;
	@FindBy(xpath="//b[contains(text(),'Performance')]")
	WebElement PerformanceModule;
	@FindBy(xpath="//b[contains(text(),'Dashboard')]")
	WebElement DashboardModule;
	@FindBy(xpath="//b[contains(text(),'Directory')]")
	WebElement DirectoryModule;
	@FindBy(xpath="//input[@value='Add'][@name='btnAdd']")
	WebElement Addbutton;
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
}
  public Userspage Adminmodulelink()throws Exception{
	  AdminModule.click();
	  return new Userspage();
  }
  public Employeelistpage pimmodulelink()throws Exception{
	  PIMModule.click();
	  return new Employeelistpage();
  }
  public Addemployeepage Addbuttonlink()throws Exception{
	  Addbutton.click();
	  return new Addemployeepage();
  }
}
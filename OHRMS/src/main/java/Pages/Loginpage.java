package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class Loginpage extends Baseclass {
	public Loginpage()throws Exception{
		super();
		PageFactory.initElements(driver,this);
	}
@FindBy(name="txtUsername")
WebElement txtUsername;
@FindBy(name="txtPassword")
WebElement txtPassword;
@FindBy(xpath="//input[@id='btnLogin']")
WebElement LoginButton;
public String validateloginpageTitle() {
	return driver.getTitle();
}
public HomePage login(String un,String pwd) throws Exception{
	txtUsername.sendKeys(un);
	txtPassword.sendKeys(pwd);
	LoginButton.click();
	return new HomePage();
}
}

package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class Marketplacepage extends Baseclass {
	public Marketplacepage()throws IOException{
		super();
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//div[@id='MP_btn']/input[@class='button']")
WebElement marketplace;
}

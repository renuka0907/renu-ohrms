package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Baseclass.Baseclass;

public class Employeelistpage extends Baseclass {
	public Employeelistpage() throws IOException{
		super();
	}
@FindBy(xpath="//input[@value='Add'][@name='btnAdd']")
WebElement Addbutton;
@FindBy(xpath=".//*[@id='searchbtn'][@value='search']")
WebElement Searchbutton;
@FindBy(xpath=".//*[@id='resetbtn'][@value='Reset']")
WebElement Resetbutton;
@FindBy(xpath=".//*[@id='btnDelete'][@value='Delete']")
WebElement Deletebutton;
@FindBy(xpath=".//*[@id='empsearch_employee_name_empName']")
WebElement SearchEmployeeName;
public String EmployeelistpageTitle() {
	return driver.getTitle();
}
public Addemployeepage clickonAddbutton()throws Exception{
	Addbutton.click();
	return new Addemployeepage();
}
}

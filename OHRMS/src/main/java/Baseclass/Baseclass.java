package Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import Util.Testutil;

public class Baseclass {

	public static WebDriver driver;
	public static Properties prop;
	public Baseclass()throws IOException{
		prop=new Properties();
		FileInputStream fip=new FileInputStream("D:\\eclipse-workspace\\OHRMS\\src\\main\\java\\Config");
		prop.load(fip);
	}
	public static void initialization() {
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	public void takesscreenshot(String url)throws Exception{
		DateFormat df=new SimpleDateFormat("yyyy_MM_dd hh_mm_ss");
		Date d=new Date();
		String time=df.format(d);
		System.out.println(time);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File("D:\\eclipse-workspace\\OHRMS\\Screenshot"));
		
	}
}

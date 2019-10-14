package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pom1.Homepage;

public class Running
{

	public static void main (String [] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "./draw/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://192.168.0.5:9002");
		
		Homepage hp=new Homepage(driver);
		
		
		
	}
}

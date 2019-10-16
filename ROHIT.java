package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.Unpage;
import pom.registerpage;
public class Mainprogram{

	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.chrome.driver", "E:\\SELENI\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.zoopla.co.uk");
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//button [.='Accept']")).click();
	   
	   Unpage up=new Unpage(driver);
	   up.clickSgn_btn();
	   up.clickReg_link();
	   
	   registerpage rp=new registerpage(driver);
	   rp.setEmail("pavanpeshve99@gmail.com");
	   rp.setPwd("samurai89");
	   rp.clickDrp_dn();
	   rp.slct_option();
	   rp.regbtn_click();
	   
	}

}

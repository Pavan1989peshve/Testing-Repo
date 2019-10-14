package Pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Actioncut;

public class Homepage extends Actioncut 
{
	WebDriver driver;
	
	@FindBy (xpath="//a[.='Log in']")
	private WebElement loginlink;
	
	@FindBy (xpath="//input[@id='edit-name--2']")
	private WebElement Untxtbox;
	
	@FindBy (xpath="//input[@id='edit-pass--2']")
	private WebElement pwdtxtbox;
	
	@FindBy (xpath="//input[@id='edit-submit--17']")
	private WebElement loginbtn;
	
	@FindBy (xpath="//a[.='Store']")
	private WebElement storedropdown;
	
	@FindBy (xpath="//a[.='Products']")
	private WebElement prdtdropdown;
	
	@FindBy (xpath="//a[.='Add a product']")
	private WebElement addprodropdown;
	
	@FindBy (xpath="//a[.='Create Product']")
	private WebElement createproductpglnk;
	
	public Homepage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clkloginlink()
	{
		loginlink.click();
	}
      
	public void setUn(String user)
	{
		Untxtbox.sendKeys(user);
	}

	public void setPwd(String pwd)
	{
		pwdtxtbox.sendKeys(pwd);
	}

	public void logBtn()
	{
		loginbtn.click();;
	}
	
	public void storeDrpdn(WebDriver driver)
	{
		actionsOnele(storedropdown,driver );
	}
	public void productopt(WebDriver driver)
	{
		Actions a=new Actions(driver);
        a.moveToElement(prdtdropdown).perform();
		
	}
	public void addprdt(WebDriver driver)
	{
		Actions a=new Actions(driver);
        a.moveToElement(addprodropdown).perform();
	}
	public void createprdt()
	{
		createproductpglnk.click();
	}
}

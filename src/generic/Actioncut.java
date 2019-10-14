package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actioncut 
{
	 public Actions ac;
        public void actionsOnele (WebElement ele, WebDriver driver)
        {
        	ac= new Actions(driver);
        	ac.moveToElement(ele);
        	ac.contextClick(ele);
        	ac.doubleClick(ele);
        
        	
        }
     public void dragAndDrop (WebElement src,WebElement dst, WebDriver driver)
     {
    	 ac= new Actions(driver);
    	 ac.dragAndDrop(src, dst);
    	 
     }

}

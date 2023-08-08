package Generic_Utitlity;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_Utility 
{
	/**
	 * @author anubhav
	 * this method is use to provide time to load the webpage
	 * @param driver
	 */
	public void implicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	/**
	 * this method is used for switching windows
	 * @author anubhav
	 * @param driver
	 * @param PartialWindowTitle
	 */
	public void switchToWindow(WebDriver driver, String PartialWindowTitle)
	{
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> it = windowhandles.iterator();
		while(it.hasNext())
		{		String wid = it.next();
			driver.switchTo().window(wid);
			String title = driver.getTitle();
			if(title.contains(PartialWindowTitle))
			{
				break;
			}
		}
	}
	/**
	 * used to switch to Alertwindow and accept(click on OK button)
	 * @author anubhav
	 * @param driver
	 */
	public void switchToAlertAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * used to switch to Alertwindow and Dismiss(click on Cancel button)
	 * @author anubhav
	 * @param driver
	 */
	public void switchToAlertAndDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * Used to switch to frame window based on index
	 * @author anubhav
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * Used to switch to frame window based on id or name Attribute
	 * @author anubhav
	 * @param driver
	 * @param id_name_Attribute
	 */
	
	public void switchToFrame(WebDriver driver,String id_name_Attribute)
	{
		driver.switchTo().frame(id_name_Attribute);
	}
	/**
	 * Used to select the value from drop down based on index
	 * @author anubhav
	 * @param element
	 * @param index
	 */
	
	public void select(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 *Used to select the value from drop down based on text 
	 * @author anubhav
	 * @param element
	 * @param text
	 */
	
	public void select(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	/**
	 * Used to place mouse cursor on specified element
	 * @author anubhav
	 * @param driver
	 * @param element
	 */
	
	public void mouseHoverOnElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * Used to right click on specific element
	 * @author anubhav
	 * @param driver
	 * @param element
	 */
	
	public void rightClickOnElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	

}

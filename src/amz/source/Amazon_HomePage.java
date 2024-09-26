package amz.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_HomePage 
{
	WebDriver driver;
	//1
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement accountsandlist;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement signin_button;
	
	public void accountandlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountsandlist).perform();
	}
	
	public void signin() throws InterruptedException
	{
		Thread.sleep(2000);
		signin_button.click();
	}
	 
	public Amazon_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}

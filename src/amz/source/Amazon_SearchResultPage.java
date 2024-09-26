package amz.source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResultPage 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchproduct;

	public void searchproduct()
	{
		searchproduct.sendKeys("womens sneakers" + Keys.ENTER);
		
	}
	public Amazon_SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}

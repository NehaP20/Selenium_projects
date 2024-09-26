package Assgmnt_Testng; //Write a program using Assertion methods for any Application and use integration scenario and pick the proper features to verify the Assertions methods

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstCryScenarios_DPAssertion {
	WebDriver driver;
	@Test(dataProvider="shopping")
	public void testcase1(String input) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/");
		driver.getTitle();
		
		WebElement search=driver.findElement(By.id("search_box"));
		search.sendKeys(input + Keys.ENTER);
		Assert.assertEquals(search.isDisplayed(), true, "Not Displayed the Channels");
		Thread.sleep(4000);
		
		driver.quit();
	}
	
	@DataProvider(name="shopping")
	public Object[][] testing1()
	{
		return new Object[][] {{"Baby soap"},{"Johnson powder"}, {"Toys"}, {"Kids wears"}};
		
	}

}

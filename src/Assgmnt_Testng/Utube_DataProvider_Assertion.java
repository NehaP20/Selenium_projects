package Assgmnt_Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Utube_DataProvider_Assertion {
	@DataProvider(name="Channels")
	public Object[][] method1()
	{
		return new Object[][] { {"Grotechminds"},{"CodeStudio"},{"take U forward"},{"SoftwaretestingbyMKT"},{"Striver"}};
	}
	
	@Test(dataProvider="Channels")
	public void testcase1(String input) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.click();
		search.sendKeys(input +Keys.ENTER);
		Assert.assertEquals(search.isDisplayed(), true, "Not Displayed the Channels");
		Thread.sleep(4000);
		
		driver.quit();
	}

}

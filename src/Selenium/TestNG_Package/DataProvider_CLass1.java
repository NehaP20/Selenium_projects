package Selenium.TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_CLass1 
{
	@DataProvider(name="names")
	public Object[][] method1()
	{
		return new Object[][] {{"Neha"},{"Nitesh"},{"Bhavna"},{"Smitha"}};
	}
	
	@Test(dataProvider="names")
	public void testcase1(String input ) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys(input + Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
		
	}
	
}

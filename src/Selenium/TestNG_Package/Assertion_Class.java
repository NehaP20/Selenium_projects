package Selenium.TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Class {
	@Test
	public void test1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement signdirect=driver.findElement(By.partialLinkText("Sign in"));
		signdirect.click();
		Thread.sleep(2000);
		WebElement mailid=driver.findElement(By.name("email"));
		mailid.sendKeys("8668375440");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();		
		Thread.sleep(2000);
		WebElement pwdr=driver.findElement(By.name("password"));																												pwdr.sendKeys("@mazon2016");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Sorry but the test case is failed");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertEquals(search.isDisplayed(), true);
		Thread.sleep(2000);
		driver.quit();
	}
}

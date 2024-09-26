package ItestListerner_Class;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ItestListerner_Class.Listener_class.class)
public class TestCasess1 extends Listener_class
{
	@Test
	public void logintoamazon() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement signdirect=driver.findElement(By.partialLinkText("Sign in"));
		signdirect.click();
		WebElement mailid=driver.findElement(By.name("email"));
		mailid.sendKeys("8668375440");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();		
		WebElement pwdr=driver.findElement(By.name("password"));
																																	pwdr.sendKeys("@mazon2016");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
		//Assert.assertTrue(false);
		//driver.quit();
	}
	
	@Test
	public void logintoflipkart()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.name("email"));
		w1.sendKeys("nehapatil@gmail.com");
		WebElement w2=driver.findElement(By.name("pass"));
		w2.sendKeys("N25480");
		WebElement w3=driver.findElement(By.name("login"));
		w3.click();
		driver.quit();
	}

}

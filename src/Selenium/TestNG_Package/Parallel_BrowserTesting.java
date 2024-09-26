package Selenium.TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_BrowserTesting {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void testcase1(String nameofbrowser) throws InterruptedException
	{
		if(nameofbrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(nameofbrowser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement signdirect=driver.findElement(By.partialLinkText("Sign in"));
		signdirect.click();
		Thread.sleep(2000);
		WebElement mailid=driver.findElement(By.name("email"));
		mailid.sendKeys("8668375440");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();		
		Thread.sleep(2000);
		WebElement pwdr=driver.findElement(By.name("password"));
		pwdr.sendKeys("@mazon2016");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
	}
}

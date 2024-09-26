package Selenium.TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Testing {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void testcase1(String nameofbrowser)
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
		driver.get("https://www.flipkart.com");
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("women watches" + Keys.ENTER);
		/*WebElement watch=driver.findElement(By.xpath("(//div[@class='gqcSqV YGE0gZ'])[3]"));
		watch.click();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String parentid=(String)i1.next();
		String childid=(String)i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		WebElement addcart=driver.findElement(By.xpath("//button[.='Add to cart']"));
		addcart.click();*/
		driver.quit();
	}

}

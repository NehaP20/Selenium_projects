package Testing5TC;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser {
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
	}
		@BeforeMethod
		public void launching() 
		{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.swiggy.com/");
		}
		
		@AfterMethod
		public void Quit() 
		{
			//driver.quit();
		}
}

package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch {
	ChromeDriver driver;
	@BeforeMethod
	public void launching() 
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	}
	@AfterMethod
	public void Quit() 
	{
		//driver.quit();
	}

}

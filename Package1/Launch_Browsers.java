package Package1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch_Browsers 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Program for methods of Selenium
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//Thread.sleep(2000);
		driver.getWindowHandles();
		driver.getWindowHandle();
		//driver.close();
		//driver.quit();
		
		//Program for is.displayed / is.enabled
		WebElement w1=driver.findElement(By.name("q"));
		boolean b1=w1.isDisplayed();
		boolean b2=w1.isEnabled();
		System.out.println(b1);
		System.out.println(b2);
		
		if(w1.isDisplayed() && w1.isEnabled())
		{
			w1.sendKeys("Indian Army"+Keys.ENTER);
		}
	}
}

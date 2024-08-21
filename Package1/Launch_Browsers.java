package Package1;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch_Browsers 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		//driver.close();
		//driver.quit();
		driver.manage().window().maximize();
		driver.getWindowHandles();
		//driver.getWindowHandle();
		driver.manage().window().minimize();
	}
}

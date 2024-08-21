package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login_relativexpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement mailid=driver.findElement(By.xpath("//input[@name='email']"));
		mailid.sendKeys("np@rediffmail.com");
		Thread.sleep(1000);
		
		WebElement pwd=driver.findElement(By.xpath("//input[@name='pass']"));
		pwd.sendKeys("AB$d426");
		
		WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
		button.click();
	}
}

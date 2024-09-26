package Selenium_Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LoginPage 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("nehapatil@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.name("pass")).sendKeys("N25480");
		driver.findElement(By.name("login")).click();
		
		
	}

}

package Selenium_Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_Loginpage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Login=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		Login.click();
		WebElement un=driver.findElement(By.name("userName"));
		un.sendKeys("XYZKL");
		WebElement pwrd=driver.findElement(By.name("password"));
		pwrd.sendKeys("124N6R42R");

	}

}

package RetryFailedCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google_Test 
{
@Test(retryAnalyzer=RetryFailedCase.Retry_Logic.class)
public void methd1()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("queue")).sendKeys("India");
	driver.findElement(By.name("queue")).sendKeys(Keys.ENTER);	
}
}

package Selenium_Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Google_ArrowButton {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.name("q"));
		e1.sendKeys("India");
		Thread.sleep(2000);
		//e1.sendKeys(Keys.ARROW_DOWN+""+Keys.ARROW_DOWN); 
		
		e1.sendKeys(Keys.ARROW_DOWN); 
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.quit();
		
		
		
		

	}

}

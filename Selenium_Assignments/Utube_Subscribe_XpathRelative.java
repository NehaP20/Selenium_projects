package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Utube_Subscribe_XpathRelative {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.click();
		search.sendKeys("Grotechminds"+Keys.ENTER);
		Thread.sleep(6000);
		
		WebElement subscbutton=driver.findElement(By.partialLinkText("Subscribe"));
		subscbutton.click();
		
		Actions a1=new Actions(driver);
		a1.moveToElement(subscbutton).perform();

	}

}

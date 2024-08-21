package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Amz_AcntList {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(4000);
		WebElement e2=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		e2.click();
	}
}

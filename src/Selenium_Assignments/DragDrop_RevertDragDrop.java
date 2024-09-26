package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_RevertDragDrop {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
	WebElement drag=	driver.findElement(By.id("drag5"));	
	WebElement drop=	driver.findElement(By.xpath("(//div[@class='w3-container '])[2]"));	

	Actions a1=new Actions(driver);
	a1.dragAndDrop(drag, drop).perform();
	
	
	}

}

package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HO_HO_Flipkart {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement e1=	driver.findElement(By.xpath("(//span[.='Home & Furniture'])[2]"));
		Actions a2=new Actions(driver);
		a2.moveToElement(e1).perform();
		
		Thread.sleep(1000);
		WebElement e2=	driver.findElement(By.linkText("Home Decor"));
		a2.moveToElement(e2).perform();
		
		WebElement e3=driver.findElement(By.linkText("Clocks"));
		e3.click();

	}

}

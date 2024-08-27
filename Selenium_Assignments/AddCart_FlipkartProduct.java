package Selenium_Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart_FlipkartProduct {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("women watches" + Keys.ENTER);
		
		WebElement watch=driver.findElement(By.xpath("(//div[@class='gqcSqV YGE0gZ'])[3]"));
		watch.click();
		
		Set<String> s1=driver.getWindowHandles();
		Iterator i1=s1.iterator();
		
		String parentid=(String)i1.next();
		String childid=(String)i1.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		
		
		WebElement addcart=driver.findElement(By.xpath("//button[.='Add to cart']"));
		addcart.click();
		
	}

}

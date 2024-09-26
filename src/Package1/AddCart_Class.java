package Package1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart_Class {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
         driver.get("https://www.amazon.in");
		  driver.manage().window().maximize();
		  WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		  e1.sendKeys("shoe");
		  Thread.sleep(2000);
		  
		 List<WebElement> e2= driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		 
		 int count =e2.size();
		 System.out.println(count);
		 e2.get(3).click();
		 
		 WebElement e3 =driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]"));
		 e3.click();

		Set<String> s1=driver.getWindowHandles();
		
		Iterator i1=s1.iterator();
		
		String parentid=(String) i1.next();
		String childid=(String) i1.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		 
		WebElement e4=driver.findElement(By.id("add-to-cart-button"));
		e4.click();	
	}

}

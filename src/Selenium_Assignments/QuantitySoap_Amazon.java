package Selenium_Assignments;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QuantitySoap_Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("soaps for bath");
		Thread.sleep(2000);
		
		List<WebElement> e2= driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		 int count =e2.size();
		 System.out.println(count);
		 e2.get(count-10).click();
		
		 WebElement soap=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[10]"));
		 soap.click();
		 
		 Set<String> s1=driver.getWindowHandles();
			
			Iterator<String> i1=s1.iterator();
			
			String parentid=(String) i1.next();
			String childid=(String) i1.next();
			
			System.out.println(parentid);
			System.out.println(childid);
			
			driver.switchTo().window(childid);
			Thread.sleep(2000);
			
			WebElement quantity=driver.findElement(By.id("quantity"));
			Select s0=new Select(quantity);
			s0.selectByIndex(5);
			
		

	}

}

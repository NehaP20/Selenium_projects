package Selenium_Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_NaukriPage {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com");
		
		WebElement register=driver.findElement(By.id("register_Layer"));
		register.click();
		Thread.sleep(2000);
		
		WebElement CntGoogle=driver.findElement(By.name("google-register"));
		CntGoogle.click();
		
		Set<String>s=driver.getWindowHandles();
		Iterator i=s.iterator();
		
		String parentid=(String) i.next();
		String childid=(String) i.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		
		WebElement mailid=driver.findElement(By.name("identifier"));
		mailid.sendKeys("imnehapatil@gmail.com");
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentid);
		
		WebElement fn=driver.findElement(By.id("name"));
		fn.sendKeys("NEHA");
	}

}

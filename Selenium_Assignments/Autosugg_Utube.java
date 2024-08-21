package Selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugg_Utube {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.click();
		search.sendKeys("Modi");
		
		Thread.sleep(8000);
		List<WebElement> u1= driver.findElements(By.xpath("//div[@class='sbsb_a']/ul/li"));
		int count=u1.size();
		System.out.println(count);
		
		u1.get(4).click();
	
	}

}

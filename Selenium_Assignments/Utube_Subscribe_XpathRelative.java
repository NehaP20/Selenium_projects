package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utube_Subscribe_XpathRelative {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.click();
		search.sendKeys("Grotechminds"+Keys.ENTER);
		
		WebElement subscbutton=driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[10]"));
		subscbutton.click();
		

	}

}

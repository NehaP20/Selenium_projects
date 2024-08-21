package Selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_AmazonShoe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("shoes");
		
		Thread.sleep(4000);
		List<WebElement> a1= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=a1.size();
		System.out.println(count);
		
		a1.get(count-7).click();
	}

}

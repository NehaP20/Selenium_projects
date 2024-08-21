package Selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Amz_Mobiles_Refrig {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		//searchbox.sendKeys("mobiles");
		searchbox.sendKeys("refrigerators");
		
		Thread.sleep(2000);
		List<WebElement> a1= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=a1.size();
		System.out.println(count);
		
		//a1.get(count-5).click();// mobiles checking
		a1.get(count-3).click();// refrigerator checking


	}

}

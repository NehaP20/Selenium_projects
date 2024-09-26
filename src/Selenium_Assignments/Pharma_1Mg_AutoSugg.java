package Selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Pharma_1Mg_AutoSugg {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.1mg.com");
	
		WebElement search=driver.findElement(By.name("name"));
		search.sendKeys("Cholesterol");
		
		Thread.sleep(6000);
		List<WebElement> f1= driver.findElements(By.xpath("//div[@class='styles__search-results-container___3OUHy']/ul/li"));
		int count=f1.size();
		System.out.println(count);
		
		f1.get(2).click();

	}

}

package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingAmazon_FeaturesNewArrivals {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("boat earbuds" + Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement sort=driver.findElement(By.id("s-result-sort-select"));
		Select s1=new Select(sort);
		s1.selectByVisibleText("Newest Arrivals");
	}
}

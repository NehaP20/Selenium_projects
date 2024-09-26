package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apollo_xpathRelative 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apollopharmacy.in/");
		
		WebElement search = driver.findElement(By.xpath("(//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq'])[1]"));
		search.click();
		
		WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search medicines, brands and more']"));
		//search1.click();
		search1.sendKeys("Pcm"+Keys.ENTER);
		
		//Thread.sleep(1000);
	
		WebElement Medicine = driver.findElement(By.xpath("(//div[@class='ProductCard_productCardGrid__NHfRH   '])[6]"));
		Medicine.click();
		
	}

}

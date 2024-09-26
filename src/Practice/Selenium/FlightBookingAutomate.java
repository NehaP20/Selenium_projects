package Practice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FlightBookingAutomate {
	@Test(timeOut=25000)
	public void booking()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/flights/");
		WebElement radioB=driver.findElement(By.xpath("(//input[@name='radio-646'])[2]"));
		radioB.click();
		Select s1=new Select(driver.findElement(By.name("From")));
		s1.selectByValue("BOM - Mumbai, IN");
		Select s2=new Select(driver.findElement(By.name("To")));
		s2.selectByValue("GOI - Goa, IN");
		WebElement Date=driver.findElement(By.name("Departon"));
		Date.sendKeys("01-09-2024");
		WebElement Return=driver.findElement(By.name("Returnon"));
		Return.sendKeys("10-09-2024");
		Select s3=new Select(driver.findElement(By.name("Adults")));
		s3.selectByIndex(3);
		Select s4=new Select(driver.findElement(By.name("Children")));
		s4.selectByIndex(0);
		Select s5=new Select(driver.findElement(By.name("Infants")));
		s5.selectByIndex(0);	
		WebElement searchflights=driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-submit has-spinner btn btn-default']"));
		searchflights.click();
		//driver.quit();
	}

}

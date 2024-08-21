package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GChrome_India_Enter {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		

	}

}

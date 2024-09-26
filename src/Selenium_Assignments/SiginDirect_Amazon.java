package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiginDirect_Amazon {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement signdirect=driver.findElement(By.partialLinkText("Sign in"));
		signdirect.click();
		
		/*Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();*/
		
		Thread.sleep(2000);
		
		WebElement mailid=driver.findElement(By.name("email"));
		mailid.sendKeys("imnehapatil20@gmail.com");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		
		Thread.sleep(2000);
		
		WebElement pwdr=driver.findElement(By.name("password"));
																										pwdr.sendKeys("@mazon2016");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();

	}

}

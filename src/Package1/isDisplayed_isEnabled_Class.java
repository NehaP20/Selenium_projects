package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_isEnabled_Class {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Asus/Downloads/learningHTML1.html");
		
		WebElement lastname=driver.findElement(By.id("121"));
		
		boolean b1=lastname.isDisplayed();
		boolean b2=lastname.isEnabled();
		System.out.println(b1);
		System.out.println(b1);
		
		if (lastname.isDisplayed() && lastname.isEnabled())
		{
			lastname.sendKeys("Patil");
		}
		else
		{
			System.out.println("Sorry but please check the element once");
		}
	}
}

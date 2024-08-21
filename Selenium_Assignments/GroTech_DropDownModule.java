package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTech_DropDownModule {
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown/");
		
/*Q1    WebElement demo=driver.findElement(By.id("Choice1"));
		Select s1=new Select(demo);
		s1.selectByVisibleText("Demo2"); */
		
/*Q1	WebElement sql=driver.findElement(By.id("Choice9"));
		Select s2=new Select(sql);
		s1.selectByValue("SQL15"); */
		
/*Q3	WebElement night=driver.findElement(By.id("Choice6"));
		Select s3=new Select(night);
		//s3.selectByValue("Night10");
		//s3.selectByIndex(9);
		//s3.selectByVisibleText("Night10"); */
		
		WebElement QTP=driver.findElement(By.id("Choice8"));
		WebElement Energy=driver.findElement(By.id("Choice4"));
		Select s4=new Select(QTP);
		s4.selectByVisibleText("QTP10");
		Select ss4=new Select(Energy);
		ss4.selectByVisibleText("Energy15");

	}

}

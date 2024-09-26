package ExplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_ExplicitWait {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.name("q"));
	
	WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
	w1.until(ExpectedConditions.titleIs("Google"));
	//w1.until(ExpectedConditions.titleContains("Goo"));
	//w1.until(ExpectedConditions.alertIsPresent());
	
	e1.sendKeys("Bangalore");
	//driver.quit();
	
}
}

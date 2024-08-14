package Selenium_Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class FB_regpage 
{
	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement createact=driver.findElement(By.linkText("Create new account"));
		createact.click();
		Thread.sleep(2000);
		WebElement fn=driver.findElement(By.name("firstname"));
		fn.sendKeys("Neha");
		Thread.sleep(2000);
		WebElement ln=driver.findElement(By.name("lastname"));
		ln.sendKeys("Patil");
		WebElement mailid=driver.findElement(By.name("reg_email__"));
		mailid.sendKeys("neha.patil@gmail.com");
		WebElement confirmmailid=driver.findElement(By.name("reg_email_confirmation__"));
		confirmmailid.sendKeys("neha.patil@gmail.com");
		Thread.sleep(2000);
		WebElement pwrd=driver.findElement(By.id("password_step_input"));
		pwrd.sendKeys("20N$N5");
		
	}

}

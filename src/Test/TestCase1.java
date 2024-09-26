package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends Launch{
	@Test
	public void login() throws InterruptedException
	{
		WebElement signdirect=driver.findElement(By.partialLinkText("Sign in"));
		signdirect.click();
		Thread.sleep(2000);
		WebElement mailid=driver.findElement(By.name("email"));
		mailid.sendKeys("8668375440");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();		
		Thread.sleep(2000);
		WebElement pwdr=driver.findElement(By.name("password"));
		pwdr.sendKeys("@mazon2016");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
	}

}

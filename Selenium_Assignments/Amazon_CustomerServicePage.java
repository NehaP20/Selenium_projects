package Selenium_Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Amazon_CustomerServicePage
{
	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement cust=driver.findElement(By.partialLinkText("Customer Service"));
		cust.click();
		
		
	}

}

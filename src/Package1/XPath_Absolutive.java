package Package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class XPath_Absolutive
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Asus/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement un=driver.findElement(By.xpath("(/html/body/input)[1]"));
		un.sendKeys("nehap20");
		
		WebElement hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("my name");
		
		WebElement pwsrd=driver.findElement(By.xpath("(/html/body/input)[3]"));
		pwsrd.sendKeys("N8626$6p");
		
		WebElement fn=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		fn.sendKeys("Neha");
		
		WebElement girl=driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		girl.click();
		
		WebElement gender=driver.findElement(By.xpath("(/html/body/input)[5]"));
		gender.click();
		
		WebElement checkbox=driver.findElement(By.xpath("(/html/body/input)[6]"));
		checkbox.click();
		
		Thread.sleep(5000);
		WebElement readmore=driver.findElement(By.linkText("Click to know about us"));
		readmore.click();
		
	}

}

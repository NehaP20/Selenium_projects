package Package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPath_problem {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Asus/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("(//input)[1]"));
		e1.sendKeys("nehap20");
		
		WebElement e2=driver.findElement(By.xpath("(//input)[2]"));
		e2.sendKeys("my name");
		
		WebElement e3=driver.findElement(By.xpath("(//input)[3]"));
		e3.sendKeys("2548626$6b");
		
		WebElement e4=driver.findElement(By.xpath("(//input)[4]"));
		e4.sendKeys("Neha");
		
		/*WebElement e6=driver.findElement(By.xpath("(//input)[6]"));
		e6.click();*/
		
		WebElement e7=driver.findElement(By.xpath("(//input)[7]"));
		e7.click();
		
		/*WebElement e8=driver.findElement(By.xpath("(//input)[10]"));
		e8.click();*/
		
		WebElement e9=driver.findElement(By.xpath("(//input)[12]"));
		e9.click();
		
		WebElement e10=driver.findElement(By.xpath("(//input)[13]"));
		e10.click();
		
		Select Relegion=new Select (driver.findElement(By.id("Relegion")));
		Relegion.selectByIndex(1);
	}

}

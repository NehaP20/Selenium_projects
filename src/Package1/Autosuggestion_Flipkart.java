package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestion_Flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
	
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Ethnic wear for girls");
		
		Thread.sleep(2000);
		List<WebElement> f1= driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int count=f1.size();
		System.out.println(count);
		
		f1.get(5).click();
		


	}

}

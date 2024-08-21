package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flpkrt_Shoe_XpathRel {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("shoe" + Keys.ENTER);
		
		WebElement shoe=driver.findElement(By.xpath("(//div[@class='gqcSqV YGE0gZ'])[19]"));
		shoe.click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}

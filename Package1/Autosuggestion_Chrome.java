package Package1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Chrome {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Nagpur");
		
		Thread.sleep(4000);
		List<WebElement> g1= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=g1.size();
		System.out.println(count);
		
		g1.get(3).click(); // 3rd search we need to select
		//a1.get(count-10).click(); // 0 index select
	}
}

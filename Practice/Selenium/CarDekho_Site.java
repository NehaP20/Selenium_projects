package Practice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarDekho_Site {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cardekho.com");
		
		Thread.sleep(2000);
		WebElement w1= driver.findElement(By.xpath("(//div[@class='gsc_ta_scroll   ']/ul/li)[2]"));
		w1.click();
		
		WebElement w2= driver.findElement(By.xpath("//input[@id='ucBudget']"));
		//w2.click();
		Select s1=new Select(w2);
		s1.selectByIndex(2);
		
		
		

	}

}

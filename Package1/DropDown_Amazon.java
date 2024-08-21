package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Amazon {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement w1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(w1);
		s1.selectByVisibleText("Books");
		//s1.selectByIndex(0);
		//s1.selectByValue("search-alias=baby");
		
		WebElement w2=driver.findElement(By.id("twotabsearchtextbox"));
		w2.sendKeys("Harry Potter" + Keys.ENTER);
	}
}

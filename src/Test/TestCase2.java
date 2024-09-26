package Test;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends Launch{
@Test
public void search_cart() throws InterruptedException
{
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("womens sneakers");
	Thread.sleep(2000);
	List<WebElement> shoe= driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));	 
	int count =shoe.size();
	System.out.println(count);
	shoe.get(3).click();
	WebElement e4 =driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]"));
	e4.click();
	Set<String> s1=driver.getWindowHandles();
	Iterator<String> i1=s1.iterator();
	String parentid=(String) i1.next();
	String childid=(String) i1.next();
	System.out.println(parentid);
	System.out.println(childid);
	driver.switchTo().window(childid);
	Thread.sleep(2000);
	WebElement cart=driver.findElement(By.id("add-to-cart-button"));
	cart.click();	
	WebElement buy=driver.findElement(By.name("proceedToRetailCheckout"));
	buy.click();
}

}

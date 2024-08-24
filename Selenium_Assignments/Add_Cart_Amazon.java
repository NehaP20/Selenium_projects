package Selenium_Assignments;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Add_Cart_Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);
		
		WebElement HOsignin=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		HOsignin.click();
		WebElement e3=driver.findElement(By.name("email"));
		e3.sendKeys("imnehapatil20@gmail.com");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		Thread.sleep(2000);
		WebElement pwdr=driver.findElement(By.name("password"));
		pwdr.sendKeys("@mazon2016");
		
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
		
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
		Iterator i1=s1.iterator();
		
		String parentid=(String) i1.next();
		String childid=(String) i1.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		 
		/*WebElement cart=driver.findElement(By.id("add-to-cart-button"));
		cart.click();	
		
		WebElement buy=driver.findElement(By.name("proceedToRetailCheckout"));
		buy.click();
		
		WebElement buynow=driver.findElement(By.id("buy-now-button"));
		buynow.click();*/
		
		WebElement wishlist=driver.findElement(By.xpath("//span[@id='wishListMainButton']"));
		wishlist.click();
		
	}

}

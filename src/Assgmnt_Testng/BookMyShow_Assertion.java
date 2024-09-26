package Assgmnt_Testng;
/*Test scenarios for the Search functionality in BookMyShow
TS1-Verify that a user can search for movies by title,language,location,date and time, & ratings.-
TS2-Verify that a user can search for events by name, location, date and time, category, team or player name.
TS3-Verify that a user can filter search results by relevance, rating, or popularity.
TS4-Verify that a user can sort search results by date, name, or rating.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookMyShow_Assertion {
	WebDriver driver;
	@Test
	public void testcase1() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
	
		Assert.assertEquals(driver.getTitle(), "Movie Tickets, Plays, Sports, Events & Cinemas nearby - BookMyShow", "Sorry visited on wrong page");
		WebElement w1= driver.findElement(By.xpath("//span[.='View All Cities']")); // location pop up
		Assert.assertEquals(w1.isDisplayed(), true);
		System.out.println("Select location or search for your city Popup is displayed - Assert Passed");
		WebElement city= driver.findElement(By.xpath("//span[.='Mumbai']")); //select any city
		city.click();
		Assert.assertTrue(city.isDisplayed());
		Thread.sleep(2000);
		WebElement movies= driver.findElement(By.partialLinkText("Movies"));
		movies.click();
		Assert.assertEquals(movies.isSelected(), true,"Sorry movies option is not selected");
		Thread.sleep(2000);
		WebElement moviename= driver.findElement(By.xpath("(//div[@class='sc-dv5ht7-0 XmXCP']/div/div)[3]"));
		moviename.click();
		
		WebElement ticketbook= driver.findElement(By.xpath("(//span[.='Book tickets'])[1]"));
		ticketbook.click();
		
}
}
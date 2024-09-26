package Testing5TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3_RestaurantSearch extends Browser {
	@Test(priority = 3)
    public void verifyRestaurantSearch() 
	{
        // Search for restaurants
		 // Assert that search results are shown
        WebElement searchResults = driver.findElement(By.xpath(""));
        Assert.assertTrue(searchResults.isDisplayed(), "Search results not displayed.");
    }

}

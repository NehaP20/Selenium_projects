package Testing5TC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1_HomePageLoad extends Browser{
	@Test(priority = 1)
	public void verifyHomePageTitle() 
	{
	        driver.get("https://www.swiggy.com");
	        Assert.assertEquals(driver.getTitle(), "Order Food Online from India's Best Food Delivery Service | Swiggy", "Home page title does not match.");
	    }
	}


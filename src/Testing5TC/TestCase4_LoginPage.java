package Testing5TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4_LoginPage extends Browser 
{
	@Test(priority = 4)
    public void verifyLoginPage() {
        // Access the login page
        WebElement login = driver.findElement(By.xpath(""));
       
        
        // Assert that the login page is displayed
       
        Assert.assertTrue(login.isDisplayed(), "Login page not displayed.");
    }

}

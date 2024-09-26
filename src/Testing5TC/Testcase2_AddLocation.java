package Testing5TC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase2_AddLocation extends Browser
{
	@Test(priority = 2)
    public void AddLocation() {
        // Input location (Ensure to pick an available location)
        WebElement e1 = driver.findElement(By.xpath("(//span[.='Other'])[2]"));
        e1.click();
        
     // Select the first suggestion and assert the input was accepted
        WebElement location = driver.findElement(By.xpath("//input[@class='_5ZhdF _3GoNS itiW2']"));
        location.sendKeys("Nagpur" + Keys.ARROW_DOWN + Keys.ENTER);
       
       
        // Assert that the location has been set
        WebElement locationConfirmation = driver.findElement(By.xpath("//span[.='Nagpur, Maharashtra, India']"));
        Assert.assertTrue(locationConfirmation.getText().contains("Nagpur"), "Location not set correctly.");
    }

}

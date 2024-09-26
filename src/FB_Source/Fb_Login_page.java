package FB_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login_page 
{
	//step 1: locating each elements using @FindBy
	WebDriver driver;
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login_button;
	
	// Step2: Creating separate ,methods for each components
	
	public void un()
	{
		username.sendKeys("neha304patil@gmail.com");
	}
	public void pwd()
	{
		password.sendKeys("112457323kbdg");
	}
	public void login()
	{
		login_button.click();
	}
	
	//Step3: Initializing the elements
	
	public Fb_Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //this step is same in source 
	}

	
	
	
	
}

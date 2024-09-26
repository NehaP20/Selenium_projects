package FB_Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FB_Source.Fb_Login_page;

public class TestCase1 
{
	@Test
	public void login_to_facebook()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Fb_Login_page fb=new Fb_Login_page(driver);
		fb.un();
		fb.pwd();
		fb.login();
	}

}

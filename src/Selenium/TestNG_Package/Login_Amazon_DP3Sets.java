package Selenium.TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_Amazon_DP3Sets {
	@Test(dataProvider="login_details")
	public void testcase1(String un,String pwd) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.getTitle();
		
		WebElement signdirect=driver.findElement(By.partialLinkText("Sign in"));
		signdirect.click();
		Thread.sleep(2000);
		WebElement mailid=driver.findElement(By.name("email"));
		mailid.sendKeys(un);
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();		
		Thread.sleep(2000);
		WebElement pwdr=driver.findElement(By.name("password"));
		pwdr.sendKeys(pwd);
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
	}
	@DataProvider(name="login_details")
	public Object[][] method1()
	{
		Object[][] data=new Object[3][2]; //3Rows //2Columns
		//Set1
		data[0][0]="8668375440"; //username1
		data[0][1]=																								"@mazon2016"; //password1
		
		//Set2
		data[1][0]="+91 8668375440"; //username2
		data[1][1]=																									"@mazon2016"; //password2
		
		//Set3
		data[2][0]="neha304patil@gmail.com"; //username3
		data[2][1]=																								"@mazon2016"; //password3
		return data;
			
	}
	
}

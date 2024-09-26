package Selenium_Assignments;

import org.openqa.selenium.edge.EdgeDriver;
public class Navigate_methods {
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();

	}

}

package Package1;

import org.openqa.selenium.chrome.ChromeDriver;
public class Launch_Browsers 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		//c1.close();
		driver.quit();
		
		
	}

}

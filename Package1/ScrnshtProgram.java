package Package1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class ScrnshtProgram {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getTitle());
		
		Date d1=new Date();
		System.out.println("Current Time->"+d1);
		String time=d1.toString().replace(":", "").replace(" ", "")+".png";
		System.out.println(time);
		
		TakesScreenshot t1=	driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Asus\\eclipse-workspace\\Selenium\\src\\scrnsht\\neha"+ " "+ time);
		FileHandler.copy(source, destination);
		
		//File destination=new File("C:\\Users\\Asus\\eclipse-workspace\\Selenium\\src\\scrnsht\\neha"+ new ScrnshtProgram().getClass()+".png");
		//File destination=new File("C:\\Users\\Asus\\eclipse-workspace\\Selenium\\src\\scrnsht\\neha"+ Math.random()+".png");
	}
}
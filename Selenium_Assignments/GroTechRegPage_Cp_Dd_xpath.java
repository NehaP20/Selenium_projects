package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTechRegPage_Cp_Dd_xpath // using xpath // dropdown // copy paste 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement fn=driver.findElement(By.xpath("(//input)[29]"));
		fn.sendKeys("Neha");
		WebElement ln=driver.findElement(By.xpath("(//input)[30]"));
		ln.sendKeys("Patil");
		WebElement Id=driver.findElement(By.xpath("(//input)[31]"));
		Id.sendKeys("neha.p@gmail.com");
		WebElement pd=driver.findElement(By.xpath("(//input)[32]"));
		pd.sendKeys("Patil");
		WebElement radiobutton=driver.findElement(By.xpath("(//input)[34]"));
		radiobutton.click();
		
		Select Skills=new Select(driver.findElement(By.name("Skills")));
		Skills.selectByIndex(1);
		
		Select Country=new Select(driver.findElement(By.id("Country")));
		Country.selectByVisibleText("India"); 
		
		WebElement textbox1=driver.findElement(By.name("Present-Address"));
		textbox1.sendKeys("Sitabuldi,Orange Market,Nagpur-27");
		textbox1.sendKeys(Keys.CONTROL+"a"+"c");
		//textbox1.sendKeys(Keys.CONTROL+"c");
		
		WebElement textbox2=driver.findElement(By.name("Permanent-Address"));
		textbox2.sendKeys(Keys.CONTROL+"v");
		
		WebElement pc=driver.findElement(By.id("Pincode"));
		pc.sendKeys("440001");
		
		Select Religion=new Select(driver.findElement(By.id("Relegion")));
		Religion.selectByVisibleText("Hindu"); 
		
		WebElement checkbox=driver.findElement(By.xpath("(//input)[37]"));
		checkbox.click();

	}

}

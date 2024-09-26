package Selenium_Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Bank_RegPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		WebElement Acntnum=driver.findElement(By.id("accountNo"));
		Acntnum.sendKeys("1245782343");
		Thread.sleep(2000);
		
		WebElement Cifnum=driver.findElement(By.id("cifNo"));
		Cifnum.sendKeys("245182943");
		Thread.sleep(2000);
		
		WebElement Branchcode=driver.findElement(By.id("branchCode"));
		Branchcode.sendKeys("15400"); 
		Thread.sleep(2000);
		
		Select Country=new Select(driver.findElement(By.id("selCountry")));
		Country.selectByVisibleText("India"); 
		
		WebElement Mobilenum=driver.findElement(By.name("mobileNo"));
		Mobilenum.sendKeys("9545820014"); 
		
		Select FacilityRequired =new Select(driver.findElement(By.name("txnRights")));
		FacilityRequired.selectByIndex(1);
		
	}

}

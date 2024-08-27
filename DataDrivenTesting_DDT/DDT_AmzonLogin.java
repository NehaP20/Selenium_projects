package DataDrivenTesting_DDT;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_AmzonLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\Selenium\\DataDrivenTesting (DDT)_File\\Neha_SeleniumDDT.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String username=w1.getSheet("login").getRow(2).getCell(0).getStringCellValue();
		String password = w1.getSheet("login").getRow(2).getCell(1).getStringCellValue();
		
		/*System.out.println(username);
		System.out.println(password);*/
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement signdirect=driver.findElement(By.partialLinkText("Sign in"));
		signdirect.click();
		
		Thread.sleep(2000);
		
		WebElement mailid=driver.findElement(By.name("email"));
		mailid.sendKeys(username);
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		
		Thread.sleep(2000);
		
		WebElement pwdr=driver.findElement(By.name("password"));
		pwdr.sendKeys(password);
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();

	}

}

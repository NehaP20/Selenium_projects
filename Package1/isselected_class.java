package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected_class {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Asus/Downloads/learningHTML1.html");
		
		WebElement gender=driver.findElement(By.xpath("(//input)[12]"));
		gender.click();
		
		boolean b1=gender.isSelected();
		 if(b1==true)
		 {
			 System.out.println("checkbox is selected");
		 }
		 else
		 {
			 System.out.println("checkbox is not selected");
		 }
	}

}

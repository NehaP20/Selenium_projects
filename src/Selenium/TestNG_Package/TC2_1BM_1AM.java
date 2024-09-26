package Selenium.TestNG_Package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2_1BM_1AM{
	@Test
	public void searching_the_product()
	{
		System.out.println("Searching the product");
	}
	@Test
	public void searching_to_cart()
	{
		System.out.println("add to cart");
	}
	@BeforeMethod
	public void launch()
	{
		System.out.println("Browser Launch");
	}
	@AfterMethod
	public void quit()
	{
		System.out.println("Browser Quit");
	}

}

package Selenium.TestNG_Package;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2_1BM {
	@Test
	public void searching_the_product()
	{
		System.out.println("add to cart");
	}
	@Test
	public void add_to_cart()
	{
		System.out.println("add to cart");
	}
	@BeforeMethod
	public void launch()
	{
		System.out.println("Browser Launch");
	}

}

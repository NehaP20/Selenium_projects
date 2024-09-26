package Assgmnt_Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testing3TC_1BS_1AS_1AM {
	@Test
	public void Amazon()
	{
		System.out.println("Launch the amazon");
	}
	@Test
	public void FlipKart()
	{
		System.out.println("Launch the flipkart");
	}
	@Test
	public void Myntra()
	{
		System.out.println("Launch the myntra");
	}
	@BeforeSuite
	public void searching_product()
	{
		System.out.println("Searching the new product");
	}
	@AfterSuite
	public void AddCart_product()
	{
		System.out.println("Adding the new product");
	}
	@AfterMethod
	public void Buynow_product()
	{
		System.out.println("Buynow the new product");
	}

}

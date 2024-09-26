package Selenium.TestNG_Package;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups={"smoke","system"})
	public void test1()
	{
		System.out.println("1");
	}
	@Test(groups={"smoke"})
	public void test2()
	{
		System.out.println("2");
	}
	@Test(groups={"smoke"})
	public void test3()
	{
		System.out.println("3");
	}
	@Test(groups= {"system"})
	public void test4()
	{
		System.out.println("4");
	}
	@Test(groups= {"smoke"})
	public void test5()
	{
		System.out.println("5");
	}
	

}

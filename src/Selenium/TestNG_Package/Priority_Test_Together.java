package Selenium.TestNG_Package;

import org.testng.annotations.Test;

public class Priority_Test_Together {
	@Test(priority=-1)
	public void login()
	{
		
	}
	@Test(priority=1)
	public void logout()
	{
		
	}
	@Test(priority=2)
	public void register()
	{
		
	}
	@Test(priority=0)
	public void request()
	{
		
	}

}

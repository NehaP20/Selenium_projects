package Assgmnt_Testng;

import org.testng.annotations.Test;

public class Priority_NegativePostive {
	@Test(priority=0)
	public void login()
	{
		System.out.println("Hello");
	}
	@Test(priority=-1)
	public void logout()
	{
		System.out.println("Good");
	}
	@Test(priority=1)
	public void register()
	{
		System.out.println("Morning");
	}


}

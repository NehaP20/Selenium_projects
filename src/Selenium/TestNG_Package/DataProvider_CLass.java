package Selenium.TestNG_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_CLass {
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[][] {{11},{15},{21},{110},{155},{221},{998},{1501},{20151}};
	}
	@Test(dataProvider="data1")
	public void testcase1(int value)
	{
		int sum=value+100;
		System.out.println(sum);
	}

}

package amz.test;

import org.testng.annotations.Test;

import amz.source.Amazon_HomePage;
import amz.source.Amazon_LoginPage;
import amz.source.Amazon_SearchResultPage;

public class TestCase1 extends Launch_Quit 
{
	@Test
	public void login_to_amazon() throws InterruptedException 
	{
		Amazon_HomePage homepage = new Amazon_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		Amazon_LoginPage loginpage = new Amazon_LoginPage(driver);
		loginpage.login();
		
		Amazon_SearchResultPage search = new Amazon_SearchResultPage(driver);
		search.searchproduct();
		
	}

}

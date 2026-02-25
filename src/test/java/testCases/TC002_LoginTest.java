package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	@Test(groups = {"Sanity","Master"})
	public void verify_login()
	{
		logger.info("**********Log in Test***************");
		try {
		
		HomePage hmp = new HomePage(driver);
		hmp.clickSignUpOrLogin();
		
		LoginPage lg = new LoginPage(driver);
		lg.setemail(p.getProperty("email"));
		lg.setpassword(p.getProperty("password"));
		lg.clickLogin();
		
		MyAccountPage act = new MyAccountPage(driver);
		boolean targetpage = act.isMyAccountPageExist();
	
		
		Assert.assertTrue(targetpage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("**********Finished Login Test***************");
		
	}

}

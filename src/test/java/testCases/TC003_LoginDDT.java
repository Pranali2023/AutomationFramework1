package testCases;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {
	
	@Test(dataProvider = "LoginData",dataProviderClass = DataProviders.class)//getting data provider
	public void verify_loginDDT(String email, String pwd,String exp)
	{
		

		logger.info("*****************Starting TC3****************");
		try {
		HomePage hmp = new HomePage(driver);
		hmp.clickSignUpOrLogin();
		
		LoginPage lg = new LoginPage(driver);
		lg.setemail(p.getProperty("email"));
		lg.setpassword(p.getProperty("password"));
		lg.clickLogin();
		
		MyAccountPage act = new MyAccountPage(driver);
		boolean targetpage = act.isMyAccountPageExist();
	
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage == true)
			{
				act.clicklogout();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage == true)
			{
				act.clicklogout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
	}catch(Exception e)
		{
		Assert.fail();
		}
		logger.info("*****************Starting TC3****************");
	}
	

}

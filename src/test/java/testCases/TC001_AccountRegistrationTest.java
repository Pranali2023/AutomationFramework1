package testCases;

import java.time.Duration;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.AccountRegistration;
import PageObject.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	
	@Test(groups = {"Regression","Master"}) 
	public void verify_account_registration()
	{
		logger.info("************Starting TC001_AccountRegistration********");
		try
		{
		HomePage hm = new HomePage(driver);
		hm.clickSignUpOrLogin();
		hm.setName(randomeString());
		hm.setEmail(randomeString() + "@gmail.com");
		hm.ClickSignUpBtn();
		
		logger.info("********Clicked on Sign In************************");
		
		
		AccountRegistration act = new AccountRegistration(driver);
		act.setTitle();
		act.setPassword(randomealphaNumbers());
		act.selectDaysByText("8");
		act.selectMonthsByText("August");
		act.selectyearsByText("2020");
		act.setfirstName("Pranali");
		act.setlastName("Kulkarni");
		act.setCompany("BigComp");
		act.setAddress1(randomeString());
		act.setAddress2(randomeString());
		act.selectcountryByText("India");
		act.setState(randomeString());
		act.setCity(randomeString());
		act.setzipcode(randomeNumbers());
		act.setMobNum(randomeNumbers());
		act.ClickCreateAcc();
		logger.info("*********Successfully created Account***********");
		
		logger.info("******Validating logs*********");
		String strmsg = act.getConfirmationmsg();
		
		Assert.assertEquals(strmsg, "ACCOUNT CREATED!");
		}
		catch(Exception e)
		{
			logger.error("********Test Failed******");
			logger.debug("*****Debug logs**********");
			Assert.fail();
			
		}
		
		logger.debug("************Finished Account Registration*********");
		
	}
	
}

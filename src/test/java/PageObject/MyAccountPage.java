package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath ="//i[@class=\"fa fa-user\"]/following::b")
	WebElement loggedintxt;
	
	@FindBy(xpath ="//a[contains(text(),' Logout')]")
	WebElement logoutOption;
	
	public boolean isMyAccountPageExist()
	{
		try
		{
			return (loggedintxt.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void clicklogout()
	{
		logoutOption.click();
	}
	

}

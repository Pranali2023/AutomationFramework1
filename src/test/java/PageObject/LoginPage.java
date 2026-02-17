package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement emailAddresstxt;
	
	@FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement passwordtxt;
	
	@FindBy(xpath ="//button[text()='Login']")
	WebElement LoginBtn;
	
	public void setemail(String email)
	{
		emailAddresstxt.sendKeys(email);
	}
	
	public void setpassword(String password)
	{
		passwordtxt.sendKeys(password);
	}
	
	public void clickLogin()
	{
		LoginBtn.click();
	}
	

}

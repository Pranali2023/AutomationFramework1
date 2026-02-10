package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[text()=' Signup / Login']")
	WebElement SignupBtn;
	
	@FindBy(css ="input[data-qa='signup-name']")
	WebElement NameText;
	
	@FindBy(css ="input[data-qa='signup-email']")
	WebElement EmailText;
	
	@FindBy(xpath ="//button[text()='Signup']")
	WebElement SubmitBtn;
	
	public void clickSignUpOrLogin()
	{
		SignupBtn.click();
	}
	
	public void setName(String name)
	{
		NameText.sendKeys(name);
	}
	
	public void setEmail(String email)
	{
		EmailText.sendKeys(email);
	}
	
	public void ClickSignUpBtn()
	{
		SubmitBtn.click();
	}
	
	

}

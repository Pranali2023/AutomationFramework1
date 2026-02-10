package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistration extends BasePage{

	public AccountRegistration(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement titleradio;
	
	@FindBy(css="input[id='password']")
	WebElement passwordText;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement daysDropdown;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement monthsDropdown;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement yearsDropdown;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstNameText;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastNameText;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement compText;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement address1Field;
	
	@FindBy(xpath="//input[@id='address2']")
	WebElement address2Field;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement countryDropddown;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement stateField;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement cityField;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement zipField;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement MobilenumField;
	
	@FindBy(xpath ="//button[text()='Create Account']")
	WebElement createAccBtn;
	
	@FindBy(xpath ="//b[text()='Account Created!']")
	WebElement confirmationMsg;
	
	public void setTitle()
	{
		titleradio.click();
	}
	
	public void setPassword(String password)
	{
		passwordText.sendKeys(password);
	}
	
	
	
	public void selectDaysByText(String day)
	{
		Select select = new Select(daysDropdown);
		select.selectByVisibleText(day);
	}
	
	public void selectMonthsByText(String month)
	{
		Select select = new Select(monthsDropdown);
		select.selectByVisibleText(month);
	}
	
	public void selectyearsByText(String year)
	{
		Select select = new Select(yearsDropdown);
		select.selectByVisibleText(year);
	}
	
	
	
	public void setfirstName(String fname)
	{
		firstNameText.sendKeys(fname);
	}
	
	public void setlastName(String lname)
	{
		lastNameText.sendKeys(lname);
	}
	
	public void setCompany(String compName)
	{
		compText.sendKeys(compName);
	}
	
	public void setAddress1(String address1)
	{
		address1Field.sendKeys(address1);
	}
	
	public void setAddress2(String address2)
	{
		address2Field.sendKeys(address2);
	}
	
	public void selectcountryByText(String country)
	{
		Select select = new Select(countryDropddown);
		select.selectByVisibleText(country);
	}
	
	public void setState(String State)
	{
		stateField.sendKeys(State);
	}
	
	public void setCity(String city)
	{
		cityField.sendKeys(city);
	}
	
	public void setzipcode(String zipcode)
	{
		zipField.sendKeys(zipcode);
	}
	
	public void setMobNum(String MobNum)
	{
		MobilenumField.sendKeys(MobNum);
	}
	
	public void ClickCreateAcc()
	{
		createAccBtn.click();
	}

	public String getConfirmationmsg()
	{
		try {
			return(confirmationMsg.getText());
		}catch( Exception e)
		{
			return(e.getMessage());
		}
	}
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	
	//constructor
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
//Locator
	/*
	By username=By.xpath("//input[@placeholder='Username']");
	By pwd=By.xpath("//input[@name='password']");
	By btn=By.xpath("//button[@type='submit']");
	*/
	
	@FindBy(xpath="//input[@placeholder='E-Mail Address']") WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement pwd;
	@FindBy(xpath="//input[@type='submit']") WebElement btn;
	
	//Action methods
	
	public void setUserName(String user)
	{
		username.sendKeys(user);
	}
	
	public void setPassowrd(String pwd1)
	{
		pwd.sendKeys(pwd1);
	}
	
	public void clickLogin()
	{
		btn.click();
	}




}

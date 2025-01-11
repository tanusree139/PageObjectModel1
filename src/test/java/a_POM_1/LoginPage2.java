package a_POM_1;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	//using Page factory
	
WebDriver driver;
	
	//constructor
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//Locator
	/*
	By username=By.xpath("//input[@placeholder='Username']");
	By pwd=By.xpath("//input[@name='password']");
	By btn=By.xpath("//button[@type='submit']");
	*/
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement pwd;
	@FindBy(xpath="//button[@type='submit']") WebElement btn;
	
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

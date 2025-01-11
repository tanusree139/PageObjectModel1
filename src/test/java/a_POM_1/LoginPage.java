package a_POM_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This is Page Object class

public class LoginPage {
	
	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
//Locator
	
	By username=By.xpath("//input[@placeholder='Username']");
	By pwd=By.xpath("//input[@name='password']");
	By btn=By.xpath("//button[@type='submit']");
	
	//Action methods
	
	public void setUserName(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void setPassowrd(String pwd1)
	{
		driver.findElement(pwd).sendKeys(pwd1);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn).click();
	}
}

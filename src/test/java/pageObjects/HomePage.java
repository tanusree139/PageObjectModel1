package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	

	
	
	//constructor
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
//Locator
	/*
	By username=By.xpath("//input[@placeholder='Username']");
	By pwd=By.xpath("//input[@name='password']");
	By btn=By.xpath("//button[@type='submit']");
	*/
	
	
	@FindBy(xpath="//a[@title='My Account']") WebElement my_acc;
	@FindBy(css="a[href='https://tutorialsninja.com/demo/index.php?route=account/login']") WebElement llogin;
	
	
	
	//Action methods
	
	public void clickMyAcc()
	{
		my_acc.click();
	}
	
	public void clickOnLoginbtn()
	{
		llogin.click();
	}
	
	
}

package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccPage extends BasePage{
	
	//constructor
		public MyAccPage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

		
		
	//Locator
		
		
		
		@FindBy(xpath="//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]") WebElement lllogout;	
		
		
		//Action methods
		
		public void clickLogOut()
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			lllogout.click();
		}
		
		
		


}

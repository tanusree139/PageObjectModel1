 package testCases;

//import java.time.Duration;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccPage;
import testBase.BaseClass;

public class TC001_LoginPageTest extends BaseClass{
	
	
	@Test
	public void testLogin() throws InterruptedException
	{
		logger.info("************* Test Execution started ************");
		
		//sdetadd.blogspot.com
		
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAcc();
		hp.clickOnLoginbtn();
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(pr.getProperty("username"));
		lp.setPassowrd(pr.getProperty("password"));
		Thread.sleep(5000);
		lp.clickLogin();
		
		logger.info("************* Successfully Logged in ************");
		
		System.out.println("getTitle ======= "+driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "My Account");  // https://tutorialsninja.com/demo/
		
		Thread.sleep(5000);
		
		MyAccPage myap=new MyAccPage(driver);

		Thread.sleep(5000);
		myap.clickLogOut();
		
		Thread.sleep(5000);
		
		
		

		
	}
	
	



}

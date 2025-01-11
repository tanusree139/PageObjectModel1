package testCases;

import org.testng.Assert;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccPage;
import testBase.BaseClass;
import utilities.DataProvider;

public class TC002_LoginDDT extends BaseClass {
	
	@Test(dataProvider="Logindata",dataProviderClass=DataProvider.class)
	public void testLoginDDT(String username,String password, String exp) throws InterruptedException
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
		
		MyAccPage myap=new MyAccPage(driver);
		//boolen targetPage= 
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			
		}
		
		System.out.println("getTitle ======= "+driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "My Account");  // https://tutorialsninja.com/demo/
		
		Thread.sleep(5000);
		
		

		Thread.sleep(5000);
		myap.clickLogOut();
		
		Thread.sleep(5000);
		
		
		

		
	}
	
	


}

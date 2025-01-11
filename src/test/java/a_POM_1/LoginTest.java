package a_POM_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	void testLogin()
	{
		LoginPage2 lp = new LoginPage2(driver);
		lp.setUserName("Admin");
		lp.setPassowrd("admin123");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}

package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	
public WebDriver driver;
public Logger logger;
public Properties pr;
	
	@BeforeClass
	@Parameters({"os","browser"})
	
	public void setUp(String os, String br) throws IOException, InterruptedException
	{
		//loading config.properties file
		
		FileReader file= new FileReader("./src//test//resources//config.properties");
		pr=new Properties();
		pr.load(file);
		
		logger=LogManager.getLogger(this.getClass());
		
		switch(br)
		{
		case "chrome" : driver=new ChromeDriver(); break ;
		case "firefix" : driver=new FirefoxDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		default : System.out.print("---- invalid browser name ----"); return;
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(pr.getProperty("url2"));  // reading url from properties file
		Thread.sleep(3000);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}

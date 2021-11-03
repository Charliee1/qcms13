package actitime.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {


	WebDriver driver = null;
	PropertyUtils pUtils = new PropertyUtils();

	@BeforeSuite
	public void configBS() {
		// database connection
	}

	@BeforeTest
	public void configBT() {
		// parallel testing codes
	}

	@BeforeClass
	public void configBC() 
	{
		// OPEN THE BROWSER
		String browserName = pUtils.getPropertyData(ActitimeConstants.PROPFILE_PATH, ActitimeConstants.BROWSER_NAME);
		System.out.println(browserName);
		String url = pUtils.getPropertyData(ActitimeConstants.PROPFILE_PATH, ActitimeConstants.LOGINURL);
			
		if ("chrome".equals(browserName)) 
		{
			System.setProperty(ActitimeConstants.CHROME_KEY, ActitimeConstants.CHROME_PATH);
			driver = new ChromeDriver();
		} 
		/*else if("firefox".equals(browserName)) 
		{
			System.setProperty(ActiTimeConstants.FIREFOX_KEY, ActiTimeConstants.FIREFOX_PATH);
			driver = new FirefoxDriver();
		} */else 
		{
			throw new SessionNotCreatedException("browser is not compatible");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ActitimeConstants.IMP_TIME,TimeUnit.SECONDS);
		driver.get(url);
	}

	@BeforeMethod
	public void configBM() {
		LoginPage loginPage = new LoginPage(driver);
		String username = pUtils.getPropertyData(ActitimeConstants.PROPFILE_PATH,ActitimeConstants.UN_KEY);
		String password = pUtils.getPropertyData(ActitimeConstants.PROPFILE_PATH,ActitimeConstants.PWD_KEY);
		loginPage.login(username, password);
	}

	@AfterMethod
	public void configAm() {
		HomePage homePage = new HomePage(driver);
		homePage.logout();

	}

	@AfterClass
	public void configAC() {
		// close the browser
		driver.quit();

	}

	@AfterTest
	public void configAT() {
		// close all the parallel connection
	}

	@AfterSuite
	public void configAS() {
		// close database connection
	}


	

}

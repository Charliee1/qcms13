package actitime.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//element identification using @findby
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;
	
	
	public void login(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
		WebActionUtility webActions = new WebActionUtility(driver);
		webActions.enterData(usernameTextField, username);
		webActions.enterData(passwordTextField, password);
		webActions.clickOnElement(loginButton);
	}
	

}

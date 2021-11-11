package actitime.actitime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getLogout() {
		return Logout;
	}
	public void setLogout(WebElement logout) {
		Logout = logout;
	}
	public void logout()
	{
		WebActionUtility webActions = new WebActionUtility(driver);
		webActions.clickOnElement(Logout);
	}

}

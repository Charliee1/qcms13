package actitime.actitime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Users {
	WebDriver driver;
	public Users(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement users;
	@FindBy(xpath="//div[text()='New User']")
	private WebElement newUser;
	@FindBy(xpath="//input[@id='createUserPanel_firstNameField']")
	private WebElement firstName;
	@FindBy(xpath="//input[@id='createUserPanel_lastNameField']")
	private WebElement lastName;
	@FindBy(xpath="//input[@id='createUserPanel_emailField']")
	private WebElement emailId;
	@FindBy(xpath="//div[text()='Save & Send Invitation']")
	private WebElement saveAndSend;
	@FindBy(xpath="//*[@id=\"createUserPanel\"]/div[2]/div[1]/div[5]/span")
	private WebElement close;
	public void User(String fname, String lname, String eid) {
		WebActionUtility webActions = new WebActionUtility(driver);
		webActions.clickOnElement(users);
		webActions.clickOnElement(newUser);
		webActions.clickOnElement(firstName);
		webActions.enterData(firstName, fname);
		webActions.clickOnElement(lastName);
		webActions.enterData(lastName, lname);
		webActions.clickOnElement(emailId);
		webActions.enterData(emailId,eid);
		webActions.clickOnElement(saveAndSend);
		webActions.clickOnElement(close);
	}
}
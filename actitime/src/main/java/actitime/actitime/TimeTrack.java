package actitime.actitime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TimeTrack {
	public WebDriver driver;
	public TimeTrack(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='New']")
	private WebElement newButton;
	@FindBy(xpath="//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[1]/input")
	private WebElement enterTaskName;
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement createTask;
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getNewButton() {
		return newButton;
	}
	public void setNewButton(WebElement newButton) {
		this.newButton = newButton;
	}
	public WebElement getEnterTaskName() {
		return enterTaskName;
	}
	public void setEnterTaskName(WebElement enterTaskName) {
		this.enterTaskName = enterTaskName;
	}
	public WebElement getCreateTask() {
		return createTask;
	}
	public void setCreateTask(WebElement createTask) {
		this.createTask = createTask;
	}
	public void Timetrack(String taskname) {	
		WebActionUtility webActions = new WebActionUtility(driver);
		webActions.clickOnElement(newButton);
		webActions.clickOnElement(enterTaskName);
		webActions.enterData(enterTaskName,taskname);
		webActions.clickOnElement(createTask);
	}
}
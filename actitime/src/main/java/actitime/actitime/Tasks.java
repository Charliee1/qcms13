package actitime.actitime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Tasks {
	WebDriver driver;
	public Tasks(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement tasks;
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;
	@FindBy(xpath="//*[@id=\"customerLightBox_content\"]/div[2]/div[1]/div/div[1]/div[1]/input")
	private WebElement enterCName;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomer;
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[5]/div[1]/div/div[1]/div/div[1]/div/div[2]/div/div[1]")
	private WebElement customerName;
	@FindBy(xpath="//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement settings;
	public WebElement getSettings() {
		return settings;
	}
	public void setSettings(WebElement settings) {
		this.settings = settings;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getTasks() {
		return tasks;
	}
	public void setTasks(WebElement tasks) {
		this.tasks = tasks;
	}
	public WebElement getAddNew() {
		return addNew;
	}
	public void setAddNew(WebElement addNew) {
		this.addNew = addNew;
	}
	public WebElement getNewCustomer() {
		return newCustomer;
	}
	public void setNewCustomer(WebElement newCustomer) {
		this.newCustomer = newCustomer;
	}
	public WebElement getEnterCName() {
		return enterCName;
	}
	public void setEnterCName(WebElement enterCName) {
		this.enterCName = enterCName;
	}
	public WebElement getCreateCustomer() {
		return createCustomer;
	}
	public void setCreateCustomer(WebElement createCustomer) {
		this.createCustomer = createCustomer;
	}
	public WebElement getCustomerName() {
		return customerName;
	}
	public void setCustomerName(WebElement customerName) {
		this.customerName = customerName;
	}
	public void Task(String cname) {
		WebActionUtility webActions = new WebActionUtility(driver);
		webActions.clickOnElement(tasks);
		webActions.clickOnElement(addNew);
		webActions.clickOnElement(newCustomer);
		webActions.enterData(enterCName, cname);
		webActions.clickOnElement(createCustomer);
		webActions.clickOnElement(settings);
	}
		 public String  getCustomerNameText() {
		     	WebDriverWait wait=new WebDriverWait(driver,10);
		     	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"taskListBlock\"]/div[5]/div[1]/div/div[1]/div/div[1]/div/div[2]/div/div[1]")));
		     	System.out.println(customerName.getText());
				return customerName.getText();
	}
}
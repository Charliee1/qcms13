package actitime.actitime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Reports {
	WebDriver driver;
	public Reports(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='container_reports']")
	private WebElement reports;
	@FindBy(xpath="//span[text()='New Report']")
	private WebElement newReport;
	@FindBy(xpath="//div[@class='configureButton components_button']")
	private WebElement configReportParameter;
	@FindBy(xpath="//span[@id='applyReportConfiguration']")
	private WebElement generateHTMLReport;
	public void Report() {
		WebActionUtility webActions = new WebActionUtility(driver);
		webActions.clickOnElement(reports);
		webActions.clickOnElement(newReport);
		webActions.clickOnElement(configReportParameter);
		webActions.clickOnElement(generateHTMLReport);
	}
}
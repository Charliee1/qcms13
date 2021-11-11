package actitime.TestCases;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import actitime.actitime.BaseClass;
import actitime.actitime.Reports;
public class TestCase6  extends BaseClass{
	@Test
	public void Report() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reports reportes = new Reports(driver);
		reportes.Report();
	}
}
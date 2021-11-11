package actitime.TestCases;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import actitime.actitime.ActitimeConstants;
import actitime.actitime.BaseClass;
import actitime.actitime.PropertyUtils;
import actitime.actitime.Tasks;
public class TestCase5  extends BaseClass{
	@Test
	public void Task() {
		PropertyUtils pUtils = new PropertyUtils();
		String cname= pUtils.getPropertyData(ActitimeConstants.PROPFILE_PATH,ActitimeConstants.CUSTOMER_NAME);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 Tasks taskes = new Tasks(driver);
		 taskes.Task(cname);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 String actualCustomer=taskes.getCustomerNameText();
			System.out.println(actualCustomer);
			Assert.assertEquals(cname,actualCustomer);
	}
}
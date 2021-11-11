package actitime.TestCases;
import org.testng.annotations.Test;
import actitime.actitime.ActitimeConstants;
import actitime.actitime.BaseClass;
import actitime.actitime.HomePage;
import actitime.actitime.PropertyUtils;
import actitime.actitime.Users;
public class TestCase7 extends BaseClass {
	@Test
	public void User() {
		PropertyUtils pUtils = new PropertyUtils();
		String fname= pUtils.getPropertyData(ActitimeConstants.PROPFILE_PATH,ActitimeConstants.FIRST_NAME);
		String lname= pUtils.getPropertyData(ActitimeConstants.PROPFILE_PATH,ActitimeConstants.LAST_NAME);
		String eid= pUtils.getPropertyData(ActitimeConstants.PROPFILE_PATH,ActitimeConstants.EMAIL_ID);
		Users useres = new Users(driver);
		useres.User(fname, lname, eid);
		HomePage homepage = new HomePage(driver);
		homepage.logout();
	}
}
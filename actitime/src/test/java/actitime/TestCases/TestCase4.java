package actitime.TestCases;
import org.testng.annotations.Test;
import actitime.actitime.ActitimeConstants;
import actitime.actitime.BaseClass;
import actitime.actitime.PropertyUtils;
import actitime.actitime.TimeTrack;
public class TestCase4  extends BaseClass{
@Test
	public void createTask() {		
		PropertyUtils pUtils = new PropertyUtils();
		String taskname = pUtils.getPropertyData(ActitimeConstants.PROPFILE_PATH,ActitimeConstants.TASK_NAME);
		TimeTrack timetrack = new TimeTrack(driver);
		timetrack.Timetrack(taskname);
		}  
}
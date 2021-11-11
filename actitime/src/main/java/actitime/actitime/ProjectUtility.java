package actitime.actitime;
public class ProjectUtility {
	public void sleepInseconds(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
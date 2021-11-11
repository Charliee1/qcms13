package actitime.TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import actitime.actitime.BaseClass;
public class TestCase2 extends BaseClass{
	@Test
	public void sample() {
		System.out.println("started");
		Assert.fail();
		System.out.println("ended");
	}
}
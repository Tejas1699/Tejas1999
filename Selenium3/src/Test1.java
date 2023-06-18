import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 extends BaseTest {
	@Test
	public void TestOne() {
		Reporter.log("Test1", true);
	}
}

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class Annotations {
	@DataProvider
	String[] getData() {
		String[] S = { "A", "B", "C", "D" };
		return S;
	}

	@Test(dataProvider = "getData")
	public void reg(String getData) {
		Reporter.log("User " + getData + " registered", true);
	}
}

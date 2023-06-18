import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificatiosPopUp {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		option.addArguments("incognito");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
	}
}

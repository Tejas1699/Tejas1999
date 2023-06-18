import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i <= 10; i++) {
			js.executeScript("window.scrollBy(0,100)");
			Thread.sleep(500);
		}
		for (int i = 1; i <= 10; i++) {
			js.executeScript("window.scrollBy(0,-100)");
			Thread.sleep(500);
		}
	}
}

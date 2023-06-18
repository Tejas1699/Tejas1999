import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("7506436460");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("7506436460");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	}
}

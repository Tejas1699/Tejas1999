import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewProgram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.fb.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
	}
}


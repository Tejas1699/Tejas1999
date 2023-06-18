import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameProgram1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		driver.switchTo().defaultContent();
	}
}

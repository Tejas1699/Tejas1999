import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CWProgram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		for (int i = 0; i <=100; i++) {
			try {
				driver.findElement(By.name("username")).sendKeys("hello");
				System.out.println(i);
				break;
			} catch (Exception e) {
			}
		}
	}
}

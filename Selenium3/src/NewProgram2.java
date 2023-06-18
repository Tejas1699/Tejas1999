import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewProgram2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		//System.out.println(driver.findElement(By.className("atLogoImg")).getSize());
		//System.out.println(driver.findElement(By.className("atLogoImg")).getLocation());
		System.out.println(driver.findElement(By.className("_6lux")).getRect().x);
		System.out.println(driver.findElement(By.id("passContainer")).getRect().x);
	}
}

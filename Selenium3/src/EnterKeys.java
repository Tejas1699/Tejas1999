import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterKeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		Actions act=new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://text-compare.com");
		driver.findElement(By.name("text1")).sendKeys("Welcome");
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).keyDown("a").keyUp("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).keyDown("c").keyUp("c").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).keyUp(Keys.TAB);
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).keyDown("v").keyUp("v").keyUp(Keys.CONTROL).perform();
	}
}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidInvalid {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demo.actitime.com/login.do");
		LoginPage L=new LoginPage(driver);
		L.getUser().sendKeys("sdgviwb");
		L.getPass().sendKeys("ywgvwb");
		L.getLogin().click();
		Thread.sleep(5000);
		L.getUser().sendKeys("admin");
		L.getPass().sendKeys("manager");
		L.getLogin().click();
	}
}

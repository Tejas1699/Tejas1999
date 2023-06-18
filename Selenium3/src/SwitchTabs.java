import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTabs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("//*[@id=\"B6lrZWOE1M6jGHzTQLGlIA\"]/div[2]/div[1]/div[1]/a/div[2]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/h2/a/span")).click();
		Thread.sleep(2000);
		Set<String> allIDs = driver.getWindowHandles();
		for (String oneID : allIDs) {
			driver.switchTo().window(oneID);
		}
		driver.close();
	}
}

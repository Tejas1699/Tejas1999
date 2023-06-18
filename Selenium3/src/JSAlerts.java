import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		Alert alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		Thread.sleep(3000);
		alt.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		Thread.sleep(3000);
		alt.dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Thread.sleep(3000);
		alt.sendKeys("Hello");
		Thread.sleep(3000);
		alt.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Thread.sleep(3000);
		alt.dismiss();
		System.out.println("Test Passed");
	}
}

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement img=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		File f2=new File("./scr.png");
		File f1=img.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f1,f2);
	}

}

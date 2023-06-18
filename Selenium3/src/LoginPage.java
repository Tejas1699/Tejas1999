import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="username") 
	private WebElement user;
	@FindBy (name="pwd") 
	private WebElement pass;
	@FindBy (xpath="//div[text()='Login ']") 
	private WebElement login;
	
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
}

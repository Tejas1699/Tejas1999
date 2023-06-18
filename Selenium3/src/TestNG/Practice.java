package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice {
  @Test(priority=1)
  public void register() {
	  Reporter.log("register", true);
  }
  @Test(priority=2)
  public void login() {
	  Reporter.log("login", true);
  }
  @Test(priority=3)
  public void edit() {
	  Reporter.log("edit", true);
  }
  @Test(priority=4)
  public void delete() {
	  Reporter.log("delete", true);
  }
}

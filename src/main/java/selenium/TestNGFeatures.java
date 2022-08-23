package selenium;
import org.testng.annotations.Test;

public class TestNGFeatures {
  @Test
  public void login() {
	  
	  System.out.println("login test");
	  int i= 9/0;
  }
  
  @Test(dependsOnMethods = "login") //if login method fails this method will be ignored
  public void home() {
	  
	  System.out.println("home test");
  }
  
  @Test
  public void search() {
	  
	  System.out.println("search test");
  }
}

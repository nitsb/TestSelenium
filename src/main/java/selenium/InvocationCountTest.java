package selenium;
import org.testng.annotations.Test;

public class InvocationCountTest {
 
  @Test(invocationCount = 10) //this will run the method 10 times e.g 
  //if we need t dump data
  public void f() {
	  
	  int a=10;
	  int b=10;
	  int c=20;
	  int sum = a+b;
	  System.out.println("sum== "+sum);
  }
}

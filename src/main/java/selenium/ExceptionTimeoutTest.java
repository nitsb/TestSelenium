package selenium;
import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
//  @Test(timeOut = 2)//max time to execute the methds
//  public void infiniteloop() {
//	  int i=1;
//	  while(i==1)
//	  {
//		  System.out.println(i);
//	  }
//  }
  @Test(expectedExceptions = NumberFormatException.class)
  public void exceptionTest()
  {
	  String s ="200S";
	  Integer.parseInt(s);
	  
  }
  
}

package testNG_multiBrowser;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Method1() {
	  System.out.println("This is method1");
  }
 @Test 
  public void Method2() {
	  System.out.println("This is method2");
	  Reporter.log("This is method2", true);
  }
}

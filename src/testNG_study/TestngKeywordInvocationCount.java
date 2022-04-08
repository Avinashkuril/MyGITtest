package testNG_study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class TestngKeywordInvocationCount {
  @Test(invocationCount = 3)
  public void A() {
	  Reporter.log("This is A", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("This is before method", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("This is after method", true);
  }
  
  @Test
  public void B() {
	  Reporter.log("This is B", true);
  }
  
  @Test
  public void a() {
	  Reporter.log("This is c", true);
  }

}

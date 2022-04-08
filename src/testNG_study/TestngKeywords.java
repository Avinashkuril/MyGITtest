package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngKeywords {
  @Test(priority = 1)
  public void Method1() {
	  Reporter.log("'This is Method1",true);
  }
  
  @Test(priority = 3)
  public void Method2() {
	  Reporter.log("THis is method2",true);
  }
  
  @Test(priority = 2)
  public void Method3() {
	  Reporter.log("This is method3",true);
  }
  
  @BeforeMethod
  public void before() {
	  Reporter.log("This is before method",true);
  }
  
  @AfterMethod
  public void after() {
	  Reporter.log("This is after method",true);
  }
}

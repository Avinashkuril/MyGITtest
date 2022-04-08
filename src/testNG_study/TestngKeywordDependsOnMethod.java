package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngKeywordDependsOnMethod {
	@Test
	  public void A() {
		  Reporter.log("This is method A", true);
	  }
	  
	  @Test(dependsOnMethods = "C")
	  public void B() {
		  Reporter.log("This is method B", true);
	  }
	  
	  @Test(timeOut = 1000)
	  public void C() throws InterruptedException {
		  Thread.sleep(2000);
		  Reporter.log("This is method C", true);
	  }
}

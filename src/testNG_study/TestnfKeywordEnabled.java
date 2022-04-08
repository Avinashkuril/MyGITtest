package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestnfKeywordEnabled {
  @Test
  public void A() {
	  Reporter.log("This is method A", true);
  }
  
  @Test(enabled = false)
  public void B() {
	  Reporter.log("This is method B", true);
  }
  
  @Test
  public void C() {
	  Reporter.log("This is method C", true);
  }
}

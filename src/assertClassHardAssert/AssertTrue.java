package assertClassHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void f() {
	  
	  boolean a=false;
	  
	  
	  Assert.assertTrue(a,"This tc failed coz");
	  
  }
}

package assertClassHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
  @Test
  public void f() {
	  
	  String a="abcd";
	  String b="abcde";
	  
	  Assert.assertEquals(a, b,"This tc failed coz");
  }
}

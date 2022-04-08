package assertClassHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void f() {
	  
	  String a="abcd";
	  String b="abcde";
	  
	  Assert.assertNotEquals(a, b,"This tc passed coz");
  }
}

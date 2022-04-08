package softAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {
	
	SoftAssert s= new SoftAssert();
  @Test
  public void method1() {
	  
	  String a="Avinash";
	  String b="Avinash";
	  
	  s.assertNotEquals(a, b,"TC failed coz");
	  
	  s.assertNull(b,"It failed coz");
	  s.assertAll();
  }
  
  @Test
  public void method2() {
	  String c="abcd";
	  String d="abcd";
	  
	  Assert.assertEquals(c, d,"This failed coz");
	  Assert.assertNull(c,"It failed coz");
	  
  }
}

package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listener.ListenerTestUse.class)

public class ListenerTest {
  @Test
  public void a() {
	  
	  Assert.fail();
  }
  
  @Test (dependsOnMethods = "a")
  public void b() {
	  Reporter.log("This test is passed", true);
  }
  
  @Test
  public void c() {
	  Reporter.log("This tc passed", true);
  }
}

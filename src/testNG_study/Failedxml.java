package testNG_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failedxml {

	@Test
	public void a() {
		Reporter.log("Method a", true);
	}
	@Test(timeOut = 100)
	public void b() throws InterruptedException {
		Thread.sleep(1000);
		Reporter.log("Method b", true);
	}
	@Test
	public void c() {
		Reporter.log("Method c", true);
	}
	@Test
	public void d() {
		
		Reporter.log("Method d", true);
	}
	@Test
	public void e() {
		Reporter.log("Method e", true);
	}
	@Test
	public void f() {
		Reporter.log("Method f", true);
	}
}

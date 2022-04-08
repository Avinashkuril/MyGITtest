package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_Exclude {
	
	@Test(groups = "reg")
	public void a() {
		Reporter.log("Method a", true);
	}
	@Test
	public void b() {
		Reporter.log("Method b", true);
	}
	@Test(groups = "sanity")
	public void c() {
		Reporter.log("Method c", true);
	}
	@Test
	public void d() {
		Reporter.log("Method d", true);
	}
	@Test(groups = "sanity")
	public void e() {
		Reporter.log("Method e", true);
	}
	@Test(groups = "reg")
	public void f() {
		Reporter.log("Method f", true);
	}

}

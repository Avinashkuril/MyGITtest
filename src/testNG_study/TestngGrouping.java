package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngGrouping {
	@Test(groups = "reg")
	public void s() {
		Reporter.log("Method s", true);
	}
	@Test(groups = "sanity")
	public void t() {
		Reporter.log("Methodt", true);
	}
	@Test(groups = "reg")
	public void u() {
		Reporter.log("Method u", true);
	}
	@Test(groups = "sanity")
	public void v() {
		Reporter.log("Method v", true);
	}
	@Test(groups = "reg")
	public void x() {
		Reporter.log("Method x", true);
	}
	@Test(groups = "sanity")
	public void y() {
		Reporter.log("Method y", true);
	}
}

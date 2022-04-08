package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerTestUse implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("TC has started", true);
		ITestListener.super.onTestStart(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC has passed", true);
		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TC has failed", true);
		ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TC has skipped", true);
		ITestListener.super.onTestSkipped(result);
	}
}

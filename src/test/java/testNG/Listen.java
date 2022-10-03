package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listen implements ITestListener{

	public void onTestStart(ITestResult result) {
		Reporter.log("OnTest Start",true);
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("OnTest Sucess",true);
		// TODO Auto-generated method stub
	
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("onTest Failure",true);
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("On test skipped",true);
		// TODO Auto-generated method stub
			}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("onTestFailedButWithinSuccessPercentage",true);
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("onTestFailedWithTimeout",true);
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		Reporter.log("Onstrat",true);
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		Reporter.log("Onfinish",true);
		// TODO Auto-generated method stub
		
	}

}

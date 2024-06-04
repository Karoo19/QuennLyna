package Demo1;

import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListeners interface which implements testing listeners
public class Listeners1 implements ITestListener {


@Override
public void onTestStart(ITestResult result) {
	System.out.println();
}

@Override
public void onTestFailure(ITestResult result) {
	//Screenshot code
	//Response if API failed
	System.out.println("I failed executed listeners Pass code" +result.getName());
}

@Override
public void onTestSuccess(ITestResult result) {
	//Screenshot code
	//Response API
}



}
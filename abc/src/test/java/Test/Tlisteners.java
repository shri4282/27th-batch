package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.screenshot;

public class Tlisteners extends Basetest implements ITestListener
{
	public void onTestStart(ITestResult result) 
	{
		System.out.println(result.getName()+ "test has passed");
		//try {
			//screenshot.takeScreenShot(driver, result.getName());
		//}
		//catch(IOException e) {
			//e.printStackTrace();
		//}
	}
	
	public void onTestFailue(ITestResult result) {
		//System.out.println(result.getName()+"test has failed");
		
		try {
			screenshot.takeScreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"test success");
	}
	public void onTestSkipped(ITestResult result) {
	System.out.println(result.getName()+"test Skipped");
	}
}

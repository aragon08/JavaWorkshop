package TestNG_Workshop;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestMethodFinder;
import org.testng.ITestResult;

public class ListenersCustom implements ITestListener {
    //This belongs to ITestListeners and will execute before starting Test set/batch
    public void onStart(ITestContext arg){
        System.out.println("Start test execution......." + arg.getName());
    }

    //This belongs to ITestListeners and will execute after starting Test set/batch
    public void onFinish(ITestContext arg){
        System.out.println("Finish test execution......." + arg.getName());
    }

    //####Method level####

    //This belongs to ITestListeners and will execute before the main test start i.e. @Test
    public void onTestStart(ITestResult arg){
        System.out.println("Start test......." + arg.getName());
    }

    //This belongs to ITestListeners and will execute when a test is skipped
    public void onTestSkipped(ITestResult arg){
        System.out.println("Skipped test......." + arg.getName());
    }

    //This belongs to ITestListeners and will execute when a test is passed
    public void onTestSuccess(ITestResult arg){
        System.out.println("Passed test......." + arg.getName());
    }

    //This belongs to ITestListeners and will execute when a test is failed
    public void onTestFailure(ITestResult arg){
        System.out.println("Failed test......." + arg.getName());
    }


}

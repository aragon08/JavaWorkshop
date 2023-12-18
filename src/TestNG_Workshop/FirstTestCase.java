package TestNG_Workshop;

import org.testng.annotations.Test;

/*
1. Setup - open browser and app
2. login
3. close
 */
public class FirstTestCase {
    //TestSuite > TestCase > TestSteps
    //Package > Classes > Methods @Test

    @Test(priority = 1)
    void setup(){
        System.out.println("This is the Setup");
    }

    @Test(priority = 3)
    void searchCustomer(){
        System.out.println("This is the Search Customer");
    }

    @Test(priority = 2)
    void addCustomer(){
        System.out.println("This is the Add Customer");
    }

    @Test(priority = 4)
    void tearDown(){
        System.out.println("This is the teardown");
    }

}

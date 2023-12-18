package TestNG_Workshop;

import org.testng.annotations.*;

public class TestDemo {

    @Test(priority = 1)
    void setup(){
        System.out.println("This is the Setup");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("This is the login");
    }

    @Test(priority = 3)
    void tearDown(){
        System.out.println("This is the teardown");
    }

   /*
    @BeforeGroups
    @BeforeSuite
    @BeforeTest
    @BeforeClass
    @BeforeMethod
    @Test
    @AfterMethod
    @AfterClass
    @AfterTest
    @AfterSuite
    @AfterGroups
    */

}

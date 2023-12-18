package TestNG_Workshop;

import org.testng.annotations.*;

public class TCAnnotations {
    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    void AfterClass(){
        System.out.println("This will execute After the Class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method");
    }
    @Test
    void tcAnotation1(){
        System.out.println("This is the TC annotation 1");
    }

    @Test
    void tcAnotation2(){
        System.out.println("This is the TC annotation 2");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("This will execute before each test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This will execute after each test");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("This will execute before Suite");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("This will execute after Suite");
    }
}

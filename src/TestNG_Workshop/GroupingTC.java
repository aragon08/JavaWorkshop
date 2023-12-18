package TestNG_Workshop;

import org.testng.annotations.Test;

public class GroupingTC {

    @Test(groups = {"sanity"})
    void test1(){
        System.out.println("This is the test 1...");
    }

    @Test(groups = {"sanity"})
    void test2(){
        System.out.println("This is the test 2...");
    }
    @Test(groups = {"regression"})
    void test3(){
        System.out.println("This is the test 3...");
    }
    @Test(groups = {"regression"})
    void test4(){
        System.out.println("This is the test 4...");
    }
    @Test(groups = {"sanity","regression"})
    void test5(){
        System.out.println("This is the test 5...");
    }
}

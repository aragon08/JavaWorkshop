package TestNG_Workshop;

import org.testng.annotations.Test;

public class PriorityAndDisabling {

    @Test(priority = 0)
    void tc1(){
        System.out.println("This is the TC 1");
    }

    @Test(priority = 2, enabled = false)
    void tc2(){
        System.out.println("This is the TC 2");
    }

    @Test(priority = 4)
    void tc3(){
        System.out.println("This is the TC 3");
    }

    @Test(priority = 2)
    void tc4(){
        System.out.println("This is the TC 4");
    }

    @Test(priority = 3)
    void tc5(){
        System.out.println("This is the TC 5");
    }
}

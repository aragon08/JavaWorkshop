package TestNG_Workshop;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {

    @Test
    void startCar(){
        System.out.println("Car started");
        Assert.fail();

    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("Car driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"driveCar","stopCar"})
    void parkCar(){
        System.out.println("Car parked");
    }

    @Test(dependsOnMethods = {"driveCar","stopCar"}, alwaysRun = true)
    void runCar(){
        System.out.println("Car running");
    }
}

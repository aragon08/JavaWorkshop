package TestNG_Workshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelEx2 {
    WebDriver driver;
    @Test
    void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/mxjcruz/IdeaProjects/JavaWorkshop/drivers/chrome/119/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button.orangehrm-login-button")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}

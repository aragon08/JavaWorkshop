package TestNG_Workshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class ParallelEx {

    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/mxjcruz/IdeaProjects/JavaWorkshop/drivers/chrome/119/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.orangehrm-login-branding>img")));
        WebElement logo = driver.findElement(By.cssSelector("div.orangehrm-login-branding>img"));
        //WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));

        Assert.assertTrue(logo.isDisplayed(),"The logo is not displayed");
        Thread.sleep(5000);
    }

    @Test
    void homePageTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/mxjcruz/IdeaProjects/JavaWorkshop/drivers/chrome/119/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");


        Assert.assertEquals(driver.getTitle(),"OrangeHRM", "Title is not match");
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}

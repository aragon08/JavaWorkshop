package TestNG_Workshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AssertionsEx {

    WebDriver driver;

    @BeforeClass
    void setup(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/mxjcruz/IdeaProjects/JavaWorkshop/drivers/chrome/119/chromedriver.exe");
        driver = new ChromeDriver();

        // Using driver navigate to the URL given, and maximize the window
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    void logo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.orangehrm-login-branding>img")));
        WebElement logo = driver.findElement(By.cssSelector("div.orangehrm-login-branding>img"));
        //WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));

        Assert.assertTrue(logo.isDisplayed(),"The logo is not displayed");
    }

    @Test(priority = 2)
    void homePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", title, "Title is not match");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}

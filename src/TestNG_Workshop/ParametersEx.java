package TestNG_Workshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParametersEx {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "app"})
    void setup(String browser, String app){
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:/Users/mxjcruz/IdeaProjects/JavaWorkshop/drivers/chrome/119/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:/Users/mxjcruz/IdeaProjects/JavaWorkshop/drivers/firefox/geckodriver.exe");
            driver = new FirefoxDriver();

        }

        // Using driver navigate to the URL given, and maximize the window
        driver.get(app);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    void logo() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.orangehrm-login-branding>img")));
        WebElement logo = driver.findElement(By.cssSelector("div.orangehrm-login-branding>img"));
        //WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));

        Assert.assertTrue(logo.isDisplayed(),"The logo is not displayed");
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    void homePageTitle() throws InterruptedException {
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", title, "Title is not match");
        Thread.sleep(5000);
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}

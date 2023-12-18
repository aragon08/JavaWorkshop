package TestNG_Workshop.CSVDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

    WebDriver driver;

    @BeforeTest
    public void setUpTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/mxjcruz/IdeaProjects/JavaWorkshop/drivers/chrome/119/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "testData1")
    public void test1(String userName, String password) throws InterruptedException {
        //System.out.println(userName + " | " + password);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.ByCssSelector("input[name='username']")).sendKeys(userName);
        driver.findElement(By.ByCssSelector("input[name='password']")).sendKeys(password);
        Thread.sleep(5000);
    }

    @DataProvider(name = "testData1")
    public Object[][] getData(){
        String excelPath = "C:\\Users\\mxjcruz\\IdeaProjects\\JavaWorkshop\\DataCSV";
        Object data[][] = testData(excelPath, sheetName);
        return data;
    }
    public static Object[][] testData(String excelPath, String sheetName){
        ExcelUtils excel = new ExcelUtils(excelPath + "/DataCSV/CSVDat.xlsx","sheet1");

        int rowCount = excel.getRow();
        int colCount =excel.getCol();
        Object data [][] = new Object[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                String cellData = excel.getCellsString(i, j);
//                System.out.print(cellData + " | ");
                data[i][j] = cellData;
            }
//            System.out.println();
        }
        return data;
    }
}

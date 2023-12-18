package TestNG_Workshop;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

public class DataProviderCSV {

    WebDriver driver;

    @Test(dataProvider = "getTestData")
    public void loginTest(String browser, String userInfo){

        //usernfo = User1,TestUser1,pwd1
        String UserData[] = userInfo.split(",");
        String user = UserData[0];
        String userName = UserData[1];
        String pwd = UserData[2];

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:/Users/mxjcruz/IdeaProjects/JavaWorkshop/drivers/chrome/119/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:/Users/mxjcruz/IdeaProjects/JavaWorkshop/drivers/firefox/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @DataProvider(name = "getTestData")
    public Object[][] getData(){
        String path = System.getProperty("user.dir") +  "\\TestingData.xlsx";
        String [][] data = null;
        try {
            File file = new File(path);

            FileInputStream fis = new FileInputStream(file);

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);

            //Get number of rows
            int rows = sheet.getPhysicalNumberOfRows();//6

            //Get number of cells
            int cells = sheet.getRow(0).getPhysicalNumberOfCells();//3

            data = new String[rows - 2][cells - 1];

            for (int i = 2; i < rows; i++){
                for (int j = 1; j < cells; j++){
                    String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
                    data[i - 2][j - 1] = cellData;
                    //data[0][0] = Chrome
                    //data[0][1] = User1,TestUser1,pwd1
                }
            }



        }catch (Exception e){
            e.printStackTrace();
        }
        return data;
    }
}

package TestNG_Workshop.CSVDataProvider;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class CSVReference {

    static String path;
    static XSSFWorkbook wb;
    static XSSFSheet sheet;

    public CSVReference(String excelPath, String sheetName) {

        try {
            //path = System.getProperty("user.dir" + "\\DataCSV\\CSVData.xlsx");
            wb = new XSSFWorkbook(path);
            sheet = wb.getSheet(sheetName);
        } catch (IOException e) {
            e.printStackTrace();

        }


    }


    public static void main(String[] args) throws IOException {
        //getRows();
        getCellsString(0,0);
        getCellsNumeric(1,1);
//        String path = System.getProperty("user.dir");
//        System.out.println(path);
//        String originalString = "Hello World!!!";
//        String addingBackSlash = originalString + "\\";
//        System.out.println(originalString);
//        System.out.println(addingBackSlash);
        //C:\Users\mxjcruz\IdeaProjects\JavaWorkshop\DataCSV
    }

    public static int getRow() throws IOException {
        int rows = 0;
        try {
            //path = System.getProperty("user.dir");
//            wb = new XSSFWorkbook("C:\\Users\\mxjcruz\\IdeaProjects\\JavaWorkshop\\DataCSV\\CSVData.xlsx");
//            sheet = wb.getSheet("Sheet1");
            rows = sheet.getPhysicalNumberOfRows();
            System.out.println("Rows number: " + rows);

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
        return rows;
    }

    public static int getCol() throws IOException {
        int col = 0;
        try {
            //path = System.getProperty("user.dir");
//            wb = new XSSFWorkbook("C:\\Users\\mxjcruz\\IdeaProjects\\JavaWorkshop\\DataCSV\\CSVData.xlsx");
//            sheet = wb.getSheet("Sheet1");
            col = sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println("Rows number: " + col);

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
        return col;
    }

    public static String getCellsString(int rowNum, int colNum){
        String cells = null;
        try {
            //path = System.getProperty("user.dir");
//            wb = new XSSFWorkbook("C:\\Users\\mxjcruz\\IdeaProjects\\JavaWorkshop\\DataCSV\\CSVData.xlsx");
//            sheet = wb.getSheet("Sheet1");
            cells = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            System.out.println("Cells number: " + cells);

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
        return cells;
    }

    public static double getCellsNumeric(int rowNum, int colNum){
        double cells = 0;
        try {
            //path = System.getProperty("user.dir");
//            wb = new XSSFWorkbook("C:\\Users\\mxjcruz\\IdeaProjects\\JavaWorkshop\\DataCSV\\CSVData.xlsx");
//            sheet = wb.getSheet("Sheet1");
            cells = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
            System.out.println("Cells number: " + cells);

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
        return cells;
    }

}

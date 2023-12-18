package TestNG_Workshop.CSVDataProvider;


public class ExcelDemo {
    public static void main(String[] args) {
        String excelPath = System.getProperty("user.dir");
        ExcelUtils excel = new ExcelUtils(excelPath + "/DataCSV/CSVDat.xlsx","sheet1");

//        excel.getRows();
    }
}

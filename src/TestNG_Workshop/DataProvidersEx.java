package TestNG_Workshop;

import org.testng.annotations.DataProvider;

public class DataProvidersEx {


@DataProvider(name = "LoginDataProvider")
    public  Object[][] getData(){
        Object[][] data ={
                {"test1@mail.com"},
                {"test2@mail.com"},
                {"test3@mail.com"}
        };
        return data;
    }
}

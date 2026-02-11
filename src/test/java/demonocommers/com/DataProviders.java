package demonocommers.com;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "loginData")
    public static Object[][] getLoginData() throws Exception {
        String path = System.getProperty("user.dir") + "/testData/LoginData.xlsx";
        return ExcelUtils.getExcelData(path, "Sheet1");
    }
}

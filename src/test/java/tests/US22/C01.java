package tests.US22;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01 {
    @Test
    public void us22test() {
        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));
    }
}

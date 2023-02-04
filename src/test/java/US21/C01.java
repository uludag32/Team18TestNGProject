package US21;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01 {
    @Test
    public void us21test() {
        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));
    }
}

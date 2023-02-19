package tests.US13;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US13Test {
    @Test
    public void testUs13(){
        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));
    }



}

package tests.US18;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.muhammet.Mx;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US18 {
Mx mx;
    @Test
    public void test1(){


        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));
        ReusableMethods.waitFor(10);
        mx=new Mx();
        mx.myAccount.click();
        ReusableMethods.waitFor(1);
        mx.userName.sendKeys(ConfigReader.getProperty("vendor_username"));
        ReusableMethods.waitFor(1);
        mx.password.sendKeys(ConfigReader.getProperty("vendor_password"), Keys.TAB, Keys.TAB,Keys.TAB,Keys.ENTER);
        ReusableMethods.waitFor(3);
        String expectedTitle= mx.loginPageAssert.getText();
        Assert.assertTrue(expectedTitle.contains("My Account"));
        ReusableMethods.waitFor(5);


    }
}


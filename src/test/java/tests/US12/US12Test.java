package tests.US12;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class US12Test {
    SpendingGood_HomePage spendingGood_homePage;
    SpendingGood_LoginPage spendingGood_loginPage;

    @Test

    public void us12(){
        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));
        spendingGood_homePage=new SpendingGood_HomePage();
        spendingGood_loginPage=new SpendingGood_LoginPage();
        spendingGood_homePage.Sign_In.click();
        spendingGood_homePage.userName.sendKeys(ConfigReader.getProperty("vendor_username"));
        spendingGood_loginPage.password.sendKeys(ConfigReader.getProperty("vendor_password"));
        spendingGood_homePage.SignIN.click();







    }

}

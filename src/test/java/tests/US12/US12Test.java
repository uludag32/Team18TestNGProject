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
       spendingGood_homePage.Register.click();
        ReusableMethods.waitFor(2);






    }

}

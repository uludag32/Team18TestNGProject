package tests.US05;

import org.openqa.selenium.interactions.Actions;
import pages.ilker.SpendingGood_HomePagei;
import pages.ilker.SpendingGood_MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Base {
    SpendingGood_HomePagei spendingGood_homePagei = new SpendingGood_HomePagei();
    SpendingGood_MyAccountPage spendingGood_myAccountPage = new SpendingGood_MyAccountPage();


    Actions actions =new Actions(Driver.getDriver());
    public void SpendingGoodEditted(){
        //Url adresine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));

        //Sign In butonuna tıklar
        spendingGood_homePagei.signInButton.click();

        //Username or email address textine valid bir deger girer
        spendingGood_homePagei.username.sendKeys(ConfigReader.getProperty("ilkerid"));

        //Password textine valid bir deger girer
        spendingGood_homePagei.password.sendKeys(ConfigReader.getProperty("ilkerpw1"));

        //SIGN IN butonuna tıklar
        spendingGood_homePagei.loginbutton.click();
        ReusableMethods.waitFor(2);

        //My Account butonuna tıklar
        spendingGood_homePagei.myAccount.click();

        //Account details butonuna tıklar
        spendingGood_myAccountPage.accountDetailsButton.click();

        //Account Details yazısı görülür
        spendingGood_myAccountPage.accountDetailsYazısı.isDisplayed();
    }
}

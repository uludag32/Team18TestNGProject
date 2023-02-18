package tests.US04;

import org.openqa.selenium.Keys;
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
        spendingGood_homePagei.password.sendKeys(ConfigReader.getProperty("ilkerpw"));

        //SIGN IN butonuna tıklar
        spendingGood_homePagei.loginbutton.click();
        ReusableMethods.waitFor(2);

        //My Account butonuna tıklar
        spendingGood_homePagei.myAccount.click();

        //Addresses butonuna tıklar
        spendingGood_myAccountPage.adressesButton.click();

        //Billing adress altındaki add butonuna tıklar

        actions.keyDown(Keys.PAGE_DOWN).build().perform();
        ReusableMethods.waitFor(2);
        spendingGood_myAccountPage.shippingAddressAdd.click();


        //First name text valid bir deger girilir
        spendingGood_myAccountPage.shippingFirstName.clear();
        spendingGood_myAccountPage.shippingFirstName.sendKeys("İlker");

        //Last name text valid bir deger girilir
        spendingGood_myAccountPage.shippingLastName.clear();
        spendingGood_myAccountPage.shippingLastName.sendKeys("Özdemir");
        ReusableMethods.waitFor(2);

        //Country / Region dropdown Turkey seçilir
        actions.keyDown(Keys.PAGE_DOWN).build().perform();
        ReusableMethods.waitFor(2);
        ReusableMethods.selectFromDropdown(spendingGood_myAccountPage.shippingCountryDropDown,"Turkey");

        //Street address text valid bir deger girilir
        spendingGood_myAccountPage.shippingStreetAddress.clear();
        spendingGood_myAccountPage.shippingStreetAddress.sendKeys("Adana");

        //Town / City text valid bir deger girilir
        spendingGood_myAccountPage.shippingCity.clear();
        spendingGood_myAccountPage.shippingCity.sendKeys("Adana");

        //Province dropdown Adana secilir
        ReusableMethods.selectFromDropdown(spendingGood_myAccountPage.shippingProvinceDropDown,"Adana");

        //ZIP Code valid bir deger girilir
        spendingGood_myAccountPage.shippingZipCode.clear();
        spendingGood_myAccountPage.shippingZipCode.sendKeys("01100");

    }
}

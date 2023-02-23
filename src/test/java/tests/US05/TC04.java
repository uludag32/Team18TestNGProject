package tests.US05;


import com.github.javafaker.Faker;

import org.apache.poi.ss.formula.functions.Count;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC04 extends Base{

    @Test
    public void US05TC04(){
        SpendingGoodEditted();
        //First name text valid bir deger girilir
        spendingGood_myAccountPage.accountFirstName.clear();
        spendingGood_myAccountPage.accountFirstName.sendKeys("İlker");

        //Last name text valid bir deger girilir
        spendingGood_myAccountPage.accountLastName.clear();
        spendingGood_myAccountPage.accountLastName.sendKeys("Özdemir");

        //Display name text valid bir deger girilir
        spendingGood_myAccountPage.accountDisplayName.clear();
        spendingGood_myAccountPage.accountDisplayName.sendKeys("fener1907");

        //Email address valid bir deger girilir
        spendingGood_myAccountPage.accountEmail.clear();
        spendingGood_myAccountPage.accountEmail.sendKeys("wsaafdaaswdfwasfd@gmail.com", Keys.PAGE_DOWN);

        //Biography bölümü doldurabilir olmalı
        Driver.getDriver().switchTo().frame(0);
        spendingGood_myAccountPage.biographyText.sendKeys("Adana doğum 24 yaş");
        Driver.getDriver().switchTo().defaultContent();

        //Current password leave blank to leave unchanged text kullanılan şifre girilmeli
        spendingGood_myAccountPage.currentPassword.sendKeys(ConfigReader.getProperty("ilkerpw1"));

        //New password leave blank to leave unchanged text yeni şifre girilmeli
        spendingGood_myAccountPage.newPassword.sendKeys(ConfigReader.getProperty("ilkerpw2"));

        //Confirm password text yeni şifre tekrar girilmeli
        spendingGood_myAccountPage.confirmPassword.sendKeys(ConfigReader.getProperty("ilkerpw2"));
        ReusableMethods.waitFor(2);

        //Save changes butonuna tıklar
        spendingGood_myAccountPage.confirmPassword.sendKeys("",Keys.TAB);
        ReusableMethods.waitFor(2);
        spendingGood_myAccountPage.accountSave.click();
    }
}

package tests.US05;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC03 extends Base{
    @Test
    public void US05TC03(){
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

    }
}

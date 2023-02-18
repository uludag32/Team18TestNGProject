package tests.US05;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class TC02 extends Base{
    @Test
    public void US05TC02(){
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
        spendingGood_myAccountPage.accountEmail.sendKeys("wsaafdaaswdfwasfd@gmail.com", Keys.PAGE_DOWN,Keys.PAGE_DOWN);

        //Save changes butonuna tıklar
        ReusableMethods.waitFor(2);
        spendingGood_myAccountPage.accountSave.click();
    }
}

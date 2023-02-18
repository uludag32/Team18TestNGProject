package tests.US03;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ilker.SpendingGood_MyAccountPage;
import utilities.Driver;


public class TC03 extends Base{

    SpendingGood_MyAccountPage spendingGood_myAccountPage = new SpendingGood_MyAccountPage();
    @Test
    public void US03TC03() {
        SpendingGoodEditted();


        //Email addresi;kayıt olunan e-mail adresi görülür
        Assert.assertEquals(spendingGood_myAccountPage.billingEmailAddress.getAttribute("value"),"wsaafdaaswdfwasfd@gmail.com");

        //Save address butonuna tıklar
        spendingGood_myAccountPage.save.click();

        Driver.closeDriver();

    }

}




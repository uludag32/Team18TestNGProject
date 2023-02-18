package tests.US03;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Driver;


public class TC02 extends Base{

    @Test
    public void US03TC02(){
        SpendingGoodEditted();


        //Email addresi;kayıt olunan e-mail adresi görülür
        Assert.assertEquals(spendingGood_myAccountPage.billingEmailAddress.getAttribute("value"),"wsaafdaaswdfwasfd@gmail.com");

        Driver.closeDriver();

    }

}

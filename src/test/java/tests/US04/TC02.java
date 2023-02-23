package tests.US04;

import org.testng.annotations.Test;
import pages.ilker.SpendingGood_MyAccountPage;
import utilities.Driver;

public class TC02 extends Base{
    SpendingGood_MyAccountPage spendingGood_myAccountPage = new SpendingGood_MyAccountPage();
    @Test
    public void US04TC02(){
        SpendingGoodEditted();
        spendingGood_myAccountPage.save.click();
        Driver.closeDriver();

    }
}

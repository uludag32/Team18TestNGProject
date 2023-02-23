package tests.US03;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.ilker.SpendingGood_HomePagei;
import pages.ilker.SpendingGood_MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01 extends Base{
    SpendingGood_HomePagei spendingGood_homePagei = new SpendingGood_HomePagei();
    SpendingGood_MyAccountPage spendingGood_myAccountPage = new SpendingGood_MyAccountPage();

    Actions actions =new Actions(Driver.getDriver());

    @Test
    public void US03TC01(){
        SpendingGoodEditted();
        Driver.closeDriver();


    }

}

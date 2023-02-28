package tests.US08;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.omer.SpendingGoodDashboardPage;
import pages.omer.SpendingGoodHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US08TC01 {

    @Test
    public void us08Test01() {
        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));

        SpendingGoodHomePage spendingGoodHomePage = new SpendingGoodHomePage();

        spendingGoodHomePage.signIn.click();
        spendingGoodHomePage.username.sendKeys(ConfigReader.getProperty("customer_email"));
        spendingGoodHomePage.password.sendKeys(ConfigReader.getProperty("customer_password"));
        spendingGoodHomePage.submitButton.submit();

        SpendingGoodDashboardPage spendingGoodDashboardPage = new SpendingGoodDashboardPage();
        Assert.assertTrue(spendingGoodDashboardPage.dashboardMessage.isDisplayed());

        ReusableMethods.waitFor(5);

        spendingGoodDashboardPage.searchArea.sendKeys(ConfigReader.getProperty("product"));
        spendingGoodDashboardPage.searchButton.submit();
        ReusableMethods.waitFor(5);
        spendingGoodDashboardPage.firstProduct.click();
        ReusableMethods.waitFor(7);
        spendingGoodDashboardPage.wishlistButton.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(5);
        spendingGoodDashboardPage.hearthButton.click();
        ReusableMethods.waitFor(7);
        spendingGoodDashboardPage.wishListPageTitle.isDisplayed();
        spendingGoodDashboardPage.quickViewButton.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(5);
        spendingGoodDashboardPage.addToChartButton.click();

        spendingGoodDashboardPage.closeButton.click();
        spendingGoodDashboardPage.viewChartButton.click();
        spendingGoodDashboardPage.checkOutButton.click();
    }

    @Test
    public void us08Test02() {
        SpendingGoodDashboardPage spendingGoodDashboardPage = new SpendingGoodDashboardPage();
        spendingGoodDashboardPage.firstName.clear();
        spendingGoodDashboardPage.firstName.sendKeys(ConfigReader.getProperty("Firstname"));
        spendingGoodDashboardPage.firstName.sendKeys(Keys.TAB, ConfigReader.getProperty("Lastname"));
        spendingGoodDashboardPage.billingCompany.clear();
        spendingGoodDashboardPage.billingCompany.sendKeys(ConfigReader.getProperty("Company"));

        ReusableMethods.waitFor(5);

       spendingGoodDashboardPage.selectionArrow1.click();
       spendingGoodDashboardPage.dropDownMenuTurkey.sendKeys("Turkey",Keys.TAB);

        ReusableMethods.waitFor(5);
        spendingGoodDashboardPage.streetAddress1.clear();
        spendingGoodDashboardPage.streetAddress1.sendKeys(ConfigReader.getProperty("Street_Adresses"));
        ReusableMethods.waitFor(5);
        spendingGoodDashboardPage.postCode.clear();
        spendingGoodDashboardPage.postCode.sendKeys(ConfigReader.getProperty("Postcode_ZIP"));
        ReusableMethods.waitFor(5);
        spendingGoodDashboardPage.billingTownCity.clear();
        spendingGoodDashboardPage.billingTownCity.sendKeys(ConfigReader.getProperty("townCity"));
        ReusableMethods.waitFor(7);


       ReusableMethods.selectFromDropdown(spendingGoodDashboardPage.province, "Ankara");
//        spendingGoodDashboardPage.selectionArrow2.click();
//       spendingGoodDashboardPage.province.sendKeys("Ankara",Keys.TAB);

        spendingGoodDashboardPage.phone.clear();
        spendingGoodDashboardPage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.waitFor(5);

        spendingGoodDashboardPage.phone.sendKeys(Keys.TAB,ConfigReader.getProperty("customer_email"));
        spendingGoodDashboardPage.placeOrderButton.submit();

        Assert.assertTrue(spendingGoodDashboardPage.orderCompleteMessage.isDisplayed());

    }
}

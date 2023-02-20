package tests.US20;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.yilmaz.US20_SpendinggoodHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US20_AC1_TC01 {

    US20_SpendinggoodHomePage us20_spendinggoodHomePage;
    @Test
    public void spending() {
        us20_spendinggoodHomePage = new US20_SpendinggoodHomePage();

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));
        ReusableMethods.waitFor(2);
        us20_spendinggoodHomePage.signInTab.click();
        ReusableMethods.waitFor(2);
        us20_spendinggoodHomePage.emailBox.click();
        us20_spendinggoodHomePage.emailBox.sendKeys(ConfigReader.getProperty("vendor_email"));
        us20_spendinggoodHomePage.passwordBox.click();
        us20_spendinggoodHomePage.passwordBox.sendKeys(ConfigReader.getProperty("vendor_password"));
        us20_spendinggoodHomePage.SIGNINbutton.click();
        ReusableMethods.waitFor(3);
        assert us20_spendinggoodHomePage.homePageDisplayed.isDisplayed();
        us20_spendinggoodHomePage.myAccount.click();

        assert us20_spendinggoodHomePage.myAccountDisplayed.isDisplayed();
        ReusableMethods.waitFor(3);
        us20_spendinggoodHomePage.storeManager.click();
        assert us20_spendinggoodHomePage.storeMangerDisplayed.isDisplayed();
        ReusableMethods.waitFor(3);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us20_spendinggoodHomePage.coupons).perform();
        ReusableMethods.waitFor(3);
        assert us20_spendinggoodHomePage.addNew.isDisplayed();
        us20_spendinggoodHomePage.addNew.click();

        us20_spendinggoodHomePage.codeBox.click();
        us20_spendinggoodHomePage.codeBox.sendKeys("123-987");
        us20_spendinggoodHomePage.descriptionBox.click();
        us20_spendinggoodHomePage.descriptionBox.sendKeys("You are entitled to use a coupon.");
        us20_spendinggoodHomePage.discountTypeBox.click();//Percentage Discount
        ReusableMethods.waitFor(3);
        us20_spendinggoodHomePage.discountTypeBox.click();
        ReusableMethods.waitFor(3);
        us20_spendinggoodHomePage.couponAmountBox.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us20_spendinggoodHomePage.couponAmountBox.toString().contains("0"));
        ReusableMethods.waitFor(3);
        us20_spendinggoodHomePage.couponAmountBox.clear();
        ReusableMethods.waitFor(3);
        us20_spendinggoodHomePage.couponAmountBox.sendKeys("50", Keys.TAB,"2024-05-20",Keys.ENTER,Keys.TAB,Keys.PAGE_DOWN);
        ReusableMethods.waitFor(5);
        us20_spendinggoodHomePage.allowFreeShipping.click();
        ReusableMethods.waitFor(3);
        us20_spendinggoodHomePage.showOnStore.sendKeys(Keys.TAB);
        us20_spendinggoodHomePage.showOnStore.click();
        ReusableMethods.waitFor(3);
        us20_spendinggoodHomePage.limit.click();
        us20_spendinggoodHomePage.useLimit.sendKeys("100",Keys.ENTER);
        us20_spendinggoodHomePage.submitBox.click();

        assert us20_spendinggoodHomePage.couponDisplayed.isDisplayed();
        ReusableMethods.waitFor(4);


    }
}


package tests.US21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.yilmaz.US20_SpendinggoodHomePage;
import pages.yilmaz.US21_SpendinggoodHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.Duration;

public class US21_AC2_TC02 {

    US20_SpendinggoodHomePage us20_spendinggoodHomePage;
    US21_SpendinggoodHomePage us21_spendinggoodHomePage;
    @Test
    public void US21_AC2_TC2() throws IOException {
        us20_spendinggoodHomePage = new US20_SpendinggoodHomePage();
        us21_spendinggoodHomePage = new US21_SpendinggoodHomePage();

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));

        us20_spendinggoodHomePage.signInTab.click();
        us20_spendinggoodHomePage.emailBox.sendKeys(ConfigReader.getProperty("customer_email"));
        us20_spendinggoodHomePage.passwordBox.sendKeys(ConfigReader.getProperty("customer_password"));
        us20_spendinggoodHomePage.SIGNINbutton.click();
        ReusableMethods.waitFor(2);
        us20_spendinggoodHomePage.homePageDisplayed.isDisplayed();
        ReusableMethods.waitFor(2);

        us21_spendinggoodHomePage.searchBox.sendKeys("kalemlik", Keys.ENTER);
        assert us21_spendinggoodHomePage.kalemlikDisplayed.isDisplayed();

        us21_spendinggoodHomePage.addToCartButton.click();
        ReusableMethods.waitFor(3);

        String count = "1";
        assert us21_spendinggoodHomePage.sepetDisplayed.getText().contains(count);

        assert us21_spendinggoodHomePage.quantityDisplayed.isDisplayed();
        ReusableMethods.waitFor(3);

        us21_spendinggoodHomePage.quantityArti.click();
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.quantityEksi.click();
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.cart.click();
        ReusableMethods.waitFor(3);

        us21_spendinggoodHomePage.checkoutButton.click();
        ReusableMethods.waitFor(3);
        assert us21_spendinggoodHomePage.faturaDetay.isDisplayed();

        us21_spendinggoodHomePage.enterYourCode.click();
        us21_spendinggoodHomePage.validCode.sendKeys("123-986");
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.applyCoupon.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.getScreenshot("Screenshots");

        String text = "Coupon code applied successfully.";
        try {
            assert text.equals(us21_spendinggoodHomePage.couponDisplayed.getText());
        } catch (Exception e) {
            ReusableMethods.waitFor(3);
        }

        us21_spendinggoodHomePage.firstNameBox.clear();
        us21_spendinggoodHomePage.firstNameBox.sendKeys("12345",Keys.TAB,"123456");
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.companyOptionalBox.clear();
        us21_spendinggoodHomePage.companyOptionalBox.sendKeys("techproed");

        us21_spendinggoodHomePage.countryBox.click();
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.countryTextBox.sendKeys("Turkey",Keys.ENTER);

        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.streetAddressBox.clear();
        us21_spendinggoodHomePage.streetAddressBox.sendKeys("1234");
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.streetAddressOptinalBox.clear();
        us21_spendinggoodHomePage.streetAddressOptinalBox.sendKeys("12345");
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.postCodeBox.clear();
        us21_spendinggoodHomePage.postCodeBox.sendKeys("posta kodu");
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.townBox.clear();
        us21_spendinggoodHomePage.townBox.sendKeys("1234567",Keys.PAGE_DOWN);
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.provinceBox.click();
        us21_spendinggoodHomePage.provinceTextBox.sendKeys("İstanbul",Keys.ENTER);
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.phoneBox.clear();
        us21_spendinggoodHomePage.phoneBox.sendKeys("phone");
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.emailadressBox.clear();
        us21_spendinggoodHomePage.emailadressBox.sendKeys("1234");
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.orderNotesOptionalBox.sendKeys("hediye",Keys.PAGE_UP,Keys.PAGE_UP);
        ReusableMethods.waitFor(4);

        String paymentMethodsText = "Payment Methods";

        assert us21_spendinggoodHomePage.paymentText.getText().contains(paymentMethodsText);
        ReusableMethods.waitFor(3);

        us21_spendinggoodHomePage.payAtTheDoor.click();
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.placeOrderBox.click();
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.placeOrderBox.sendKeys(Keys.PAGE_UP);
        ReusableMethods.waitFor(5);
        ReusableMethods.getScreenshot("Screenshots");

        String mailHatasi = "Invalid billing email address";
        assert us21_spendinggoodHomePage.billingDetailsPageDisplay.getText().contains(mailHatasi);
        ReusableMethods.waitFor(5);

        us21_spendinggoodHomePage.emailadressBox.clear();
        us21_spendinggoodHomePage.emailadressBox.sendKeys("yenihesap4@gmail.com");
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.placeOrderBox.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.getScreenshot("Screenshots");

        String numberHatasi = "BILLING PHONE is not a valid phone number.";
        assert us21_spendinggoodHomePage.billingDetailsPageDisplay.getText().contains(numberHatasi);
        ReusableMethods.waitFor(5);

        us21_spendinggoodHomePage.placeOrderBox.sendKeys(Keys.PAGE_UP);
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.phoneBox.clear();
        us21_spendinggoodHomePage.phoneBox.sendKeys("555-555-5555");
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.placeOrderBox.click();
        ReusableMethods.waitFor(3);

        String finishText2 = "Thank you. Your order has been received.";
        assert us21_spendinggoodHomePage.finishShoppingText.getText().contains(finishText2);
        ReusableMethods.waitFor(3);

    }
}



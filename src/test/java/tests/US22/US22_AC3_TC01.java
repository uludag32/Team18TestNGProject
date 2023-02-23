package tests.US22;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.yilmaz.US20_SpendinggoodHomePage;
import pages.yilmaz.US21_SpendinggoodHomePage;
import pages.yilmaz.US22_SpendinggoodHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US22_AC3_TC01 {
    US20_SpendinggoodHomePage us20_spendinggoodHomePage;
    US21_SpendinggoodHomePage us21_spendinggoodHomePage;
    US22_SpendinggoodHomePage us22_spendinggoodHomePage;

    @Test
    public void AC3_TC01() {
        us20_spendinggoodHomePage = new US20_SpendinggoodHomePage();
        us21_spendinggoodHomePage = new US21_SpendinggoodHomePage();
        us22_spendinggoodHomePage = new US22_SpendinggoodHomePage();

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));
        ReusableMethods.waitFor(3);
        us20_spendinggoodHomePage.signInTab.click();
        ReusableMethods.waitFor(2);
        us20_spendinggoodHomePage.emailBox.click();
        us20_spendinggoodHomePage.emailBox.sendKeys(ConfigReader.getProperty("vendor_email"));
        us20_spendinggoodHomePage.passwordBox.click();
        us20_spendinggoodHomePage.passwordBox.sendKeys(ConfigReader.getProperty("vendor_password"));
        us20_spendinggoodHomePage.SIGNINbutton.click();
        ReusableMethods.waitFor(3);
        assert us20_spendinggoodHomePage.homePageDisplayed.isDisplayed();
        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.searchBox.sendKeys("Samsung 55AU7000", Keys.ENTER);
        ReusableMethods.waitFor(2);

        assert us22_spendinggoodHomePage.samsungTVDisplay.isDisplayed();
        ReusableMethods.waitFor(4);
        us21_spendinggoodHomePage.addToCartButton.click();
        ReusableMethods.waitFor(3);

        String count = "1";
        assert us21_spendinggoodHomePage.sepetDisplayed.getText().contains(count);
        ReusableMethods.waitFor(3);

        us21_spendinggoodHomePage.searchBox.sendKeys("Casio F-91W-1DG",Keys.ENTER);
        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.searchBox.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.waitFor(3);
        us21_spendinggoodHomePage.addToCartButton.click();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",us21_spendinggoodHomePage.cart);
        ReusableMethods.waitFor(3);

        assert us22_spendinggoodHomePage.casioSaatDisplay.isDisplayed();
        ReusableMethods.waitFor(2);

        String count2 = "2";
        assert us21_spendinggoodHomePage.sepetDisplayed.getText().contains(count2);
        ReusableMethods.waitFor(3);

        us21_spendinggoodHomePage.cart.click();
        ReusableMethods.waitFor(2);

        us21_spendinggoodHomePage.checkoutButton.click();
        ReusableMethods.waitFor(3);

        String urun1 = "Samsung 55AU7000";
        String urun2 = "Casio F-91W-1DG";
        assert us22_spendinggoodHomePage.urunlerDisplay.getText().contains(urun1);
        assert us22_spendinggoodHomePage.urunlerDisplay.getText().contains(urun2);
        ReusableMethods.waitFor(3);

        assert us22_spendinggoodHomePage.faturaDetaylariDisplayed.isDisplayed();
        ReusableMethods.waitFor(2);


        //*****   OLUSTURDUGUM KUPONU KULLANDIGIM ICIN ZATEN KULLANILDI YAZISI GELIYOR O YUZDEN NOT ICERISINDE *****
//        us21_spendinggoodHomePage.enterYourCode.click();
//        ReusableMethods.waitFor(2);
//        us21_spendinggoodHomePage.validCode.sendKeys("123-987");
//        ReusableMethods.waitFor(2);
//        us21_spendinggoodHomePage.applyCoupon.click();
//        ReusableMethods.waitFor(5);
//        ReusableMethods.getScreenshot("Screenshots");

//        String gecerliCoupon = "Coupon code applied successfully.";
//        assert us21_spendinggoodHomePage.billingDetailsPageDisplay.getText().contains(gecerliCoupon);
//        ReusableMethods.waitFor(2);

        us21_spendinggoodHomePage.firstNameBox.clear();
        us21_spendinggoodHomePage.firstNameBox.sendKeys("Can");
        ReusableMethods.waitFor(2);

        us21_spendinggoodHomePage.lastNameBox.clear();
        us21_spendinggoodHomePage.lastNameBox.sendKeys("Canan");
        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.companyOptionalBox.clear();
        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.countryBox.click();
        us21_spendinggoodHomePage.countryTextBox.sendKeys("Turkey",Keys.ENTER);
        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.streetAddressBox.clear();
        us21_spendinggoodHomePage.streetAddressBox.sendKeys("Gaziosmanpaşa");
        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.streetAddressOptinalBox.clear();
        ReusableMethods.waitFor(2);

        us21_spendinggoodHomePage.postCodeBox.clear();
        us21_spendinggoodHomePage.postCodeBox.sendKeys("34240");
        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.townBox.clear();
        us21_spendinggoodHomePage.townBox.sendKeys("İstanbul",Keys.PAGE_DOWN);
        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.provinceBox.click();
        us21_spendinggoodHomePage.provinceTextBox.sendKeys("İstanbul",Keys.ENTER);
        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.phoneBox.clear();
        us21_spendinggoodHomePage.phoneBox.sendKeys("555-555-5555");
        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.emailadressBox.clear();
        us21_spendinggoodHomePage.emailadressBox.sendKeys("yenihesap4@gmail.com");
        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.orderNotesOptionalBox.clear();
        ReusableMethods.waitFor(2);
        System.out.println(us22_spendinggoodHomePage.odenecekMiktar.isDisplayed());
        System.out.println(us22_spendinggoodHomePage.odenecekMiktar.getText());

        /*
            Percantage Discount ile olusturulan 50 birim kupon Wire Transfer/ EFT yontemiyle;
            $44.30 olan fiyat => Total $32.15 oldu
         */

        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.wireTransfer.click();
        ReusableMethods.waitFor(2);
        us21_spendinggoodHomePage.placeOrderBox.click();
        ReusableMethods.waitFor(3);

        String finishText = "Thank you. Your order has been received.";
        assert  us21_spendinggoodHomePage.finishShoppingText.getText().contains(finishText);
        ReusableMethods.waitFor(3);

        assert us22_spendinggoodHomePage.orderDetails.isDisplayed();
        ReusableMethods.waitFor(3);

        Driver.closeDriver();
    }
}

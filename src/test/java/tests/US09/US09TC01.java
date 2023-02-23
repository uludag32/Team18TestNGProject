package tests.US09;

import org.apache.commons.compress.harmony.unpack200.IMatcher;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.omer.MailPage;
import pages.omer.SpendingGoodHomePage;
import pages.omer.VendorRegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.security.Key;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class US09TC01 {
    VendorRegistrationPage vendorRegistrationPage = new VendorRegistrationPage();
    MailPage mailPage = new MailPage();
    Actions actions = new Actions(Driver.getDriver());


    @Test
    public void us09Test01() {
        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));

        SpendingGoodHomePage spendingGoodHomePage = new SpendingGoodHomePage();

        spendingGoodHomePage.registerButton.click();
        spendingGoodHomePage.becomeVendor.click();
    }

    @Test
    public void us09Test02() throws IOException {

        vendorRegistrationPage.vendorEmail.sendKeys(ConfigReader.getProperty("becomeVendorMail"));

        vendorRegistrationPage.verificationButton.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(5);
        Assert.assertTrue(vendorRegistrationPage.verificationMessage.isDisplayed());
        ReusableMethods.getScreenshot("sc");
    }

    @Test
    public void us09Test03() {
        Driver.getDriver().get(ConfigReader.getProperty("vendorMailUrl"));
        ReusableMethods.waitFor(2);

        mailPage.mailUsername.sendKeys(ConfigReader.getProperty("becomeVendorMail"));
        mailPage.mailUsername.sendKeys(Keys.TAB, Keys.ENTER);
        // mailPage.loginButton.click();
        mailPage.mailPassWord.sendKeys(ConfigReader.getProperty("vendorPassword"));
        mailPage.mailPassWord.sendKeys(Keys.TAB, Keys.ENTER);
        ReusableMethods.waitFor(10);

        mailPage.mailLink.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(5);


        ReusableMethods.hover(mailPage.firstMailSubject);
        ReusableMethods.doubleClick(mailPage.firstMailSubject);
        // mailPage.firstMailSubject.sendKeys(Keys.ENTER);

        ReusableMethods.waitFor(8);

        // actions.moveToElement(mailPage.firstMailSubject).click();


        Pattern pattern = Pattern.compile("\\d{6}"); // 6 haneli sayıları arama
        Matcher matcher = pattern.matcher(mailPage.verificationMessage.getText());
        String code = null;

        if (matcher.find()) {
            code = matcher.group(0);
            System.out.println("E-posta içeriğindeki kod: " + code);

        }



        // yeni sayfa

            vendorRegistrationPage.verificationCodeBox.sendKeys(code);

            ReusableMethods.waitFor(3);

            vendorRegistrationPage.vendorPassword1.sendKeys(ConfigReader.getProperty("vendorPassword"));
            ReusableMethods.waitFor(3);
            vendorRegistrationPage.vendorPassword1.sendKeys(Keys.TAB, ConfigReader.getProperty("vendorPassword"));

            vendorRegistrationPage.registerButton.click();


            Driver.closeDriver();


        }

    }







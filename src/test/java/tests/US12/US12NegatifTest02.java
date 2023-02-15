package tests.US12;

import org.testng.annotations.Test;
import pages.fatih.SpendingGood_HomePage;
import pages.fatih.SpendingGood_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.io.IOException;


    public class US12NegatifTest02 {
        SpendingGood_HomePage spendingGood_homePage;
        SpendingGood_LoginPage spendingGood_loginPage;

        @Test

        public void us12TC01() throws IOException, AWTException {
            Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));

            spendingGood_homePage = new SpendingGood_HomePage();
            spendingGood_loginPage = new SpendingGood_LoginPage();
            spendingGood_homePage.Sign_In.click();

            spendingGood_homePage.username.sendKeys(ConfigReader.getProperty("vendor_username"));
            spendingGood_homePage.password.sendKeys(ConfigReader.getProperty("vendor_password"));
            spendingGood_homePage.SignIN.click();
            ReusableMethods.verifyElementDisplayed(spendingGood_homePage.username);
            ReusableMethods.waitFor(3);

            spendingGood_loginPage.My_Account.click();
            ReusableMethods.waitFor(5);
            ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.My_Account);
            ReusableMethods.waitFor(3);

            spendingGood_loginPage.Addresses.click();
            ReusableMethods.waitFor(8);
            ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.Addresses);
            ReusableMethods.waitFor(4);

            spendingGood_loginPage.Edit_Your_Billing_Adress.click();
            ReusableMethods.waitFor(3);
            // ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.Edit_Your_Billing_Adress);


            spendingGood_loginPage.Phone.clear();
            spendingGood_loginPage.Phone.sendKeys(ConfigReader.getProperty("Phone1"));
            ReusableMethods.waitFor(5);

            spendingGood_loginPage.Save_Address.click();

            //Assert.assertEquals(spendingGood_loginPage.Error_message_1.getText(),"User with email fake@bluerentalcars.com not found")
            ReusableMethods.waitFor(2);
            //  Logger.getLogger(spendingGood_loginPage.error_message.getText());


            System.out.println(spendingGood_loginPage.error_message.getText());

//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_END);

            ReusableMethods.getScreenshot("Ekran Görüntüsü");

        }
    }

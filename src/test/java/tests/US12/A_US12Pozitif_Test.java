package tests.US12;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.fatih.SpendingGood_HomePage;
import pages.fatih.SpendingGood_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.testng.AssertJUnit.assertTrue;


public class A_US12Pozitif_Test {
    SpendingGood_HomePage spendingGood_homePage;
    SpendingGood_LoginPage spendingGood_loginPage;

    @Test

    public void us12TC01() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));

        spendingGood_homePage = new SpendingGood_HomePage();
        spendingGood_loginPage = new SpendingGood_LoginPage();
        spendingGood_homePage.Sign_In.click();

        spendingGood_homePage.username.sendKeys(ConfigReader.getProperty("vendor_email"));
        spendingGood_homePage.password.sendKeys(ConfigReader.getProperty("vendor_password"));
        spendingGood_homePage.SignIN.click();
        ReusableMethods.verifyElementDisplayed(spendingGood_homePage.username);
        ReusableMethods.waitFor(3);

        spendingGood_loginPage.My_Account.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.My_Account);
        ReusableMethods.waitFor(5);

        Actions actions=new Actions(Driver.getDriver());

        ReusableMethods.waitFor(2);

        spendingGood_loginPage.Addresses.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.Addresses);
        ReusableMethods.waitFor(10);



        //spendingGood_loginPage.Add.click();
       // ReusableMethods.waitFor(5);

        actions.keyDown(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Edit_Your_Billing_Adress.click();
        ReusableMethods.waitFor(4);
        // ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.Edit_Your_Billing_Adress);


        actions.keyDown(Keys.ARROW_DOWN).perform();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Firstname.clear();
        spendingGood_loginPage.Firstname.sendKeys(ConfigReader.getProperty("Firstname"));
        ReusableMethods.waitFor(5);


        spendingGood_loginPage.Lastname.clear();
        spendingGood_loginPage.Lastname.sendKeys(ConfigReader.getProperty("Lastname"));
        ReusableMethods.waitFor(5);

        actions.keyDown(Keys.ARROW_DOWN).perform();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Company_name.clear();
        spendingGood_loginPage.Company_name.sendKeys(ConfigReader.getProperty("Company"));

        ReusableMethods.waitFor(5);

        actions.keyDown(Keys.ARROW_DOWN).perform();
        ReusableMethods.waitFor(5);

            try {
                //Kullanıcı Country / Region  alanına tıklar
                spendingGood_loginPage.Billing_Country_Region1.click();
                ReusableMethods.waitFor(2);
                //Kullanıcı Country / Region  alanından American Samoa'yi secer.
                spendingGood_loginPage.Billing_Country_Region2.sendKeys("American Samoa",Keys.ENTER);
            } catch (Exception e){

            }

            try {
                spendingGood_loginPage.Billing_Country_Region3.click();
                ReusableMethods.waitFor(2);
                //Kullanıcı Country / Region  alanından American Samoa'yi secer.
                spendingGood_loginPage.Billing_Country_Region4.sendKeys("American Samoa",Keys.ENTER,Keys.TAB);
            } catch (Exception e) {
            }


        spendingGood_loginPage.billing_Street_address1.clear();
        spendingGood_loginPage.billing_Street_address1.sendKeys(ConfigReader.getProperty("Street_Adresses"));
        ReusableMethods.waitFor(8);



        spendingGood_loginPage.billing_Street_address2.clear();
        spendingGood_loginPage.billing_Street_address2.sendKeys(ConfigReader.getProperty("ApartmanSuit"));
        ReusableMethods.waitFor(8);

        actions.keyDown(Keys.ARROW_DOWN).perform();
        ReusableMethods.waitFor(5);



        spendingGood_loginPage.Town_City.clear();
        spendingGood_loginPage.Town_City.sendKeys(ConfigReader.getProperty("Town_City"));

        ReusableMethods.waitFor(8);

        spendingGood_loginPage.State.clear();
        spendingGood_loginPage.State.sendKeys(ConfigReader.getProperty("State_Country"));

        ReusableMethods.waitFor(7);


        spendingGood_loginPage.Billing_Zip_Code.clear();
        spendingGood_loginPage.Billing_Zip_Code.sendKeys(ConfigReader.getProperty("Postcode_ZIP"));

        actions.keyDown(Keys.ARROW_DOWN).perform();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Phone.clear();
        spendingGood_loginPage.Phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.waitFor(10);


        try {
            assertTrue("Email Otomatik Görünmüyor: " +spendingGood_loginPage.email , spendingGood_loginPage.email.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Email Görünmüyor: " + spendingGood_loginPage.email);
        }
        //ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.email);

        ReusableMethods.waitFor(5);
        actions.keyDown(Keys.ARROW_DOWN);
        spendingGood_loginPage.Save_Address.submit();
        ReusableMethods.waitFor(8);

       // System.out.println(spendingGood_loginPage.error_message.getText());

//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_END);

        ReusableMethods.getScreenshot("Ekran Görüntüsü");


    }
}
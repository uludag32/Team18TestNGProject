package tests.US12;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.fatih.SpendingGood_HomePage;
import pages.fatih.SpendingGood_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class B_US12OptinalAlan_Test {
    SpendingGood_HomePage spendingGood_homePage;
    SpendingGood_LoginPage spendingGood_loginPage;

    @Test

    public void us12TC01() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));

        spendingGood_homePage = new SpendingGood_HomePage();
        spendingGood_loginPage = new SpendingGood_LoginPage();
        spendingGood_homePage.Sign_In.click();

         Actions actions=new Actions(Driver.getDriver());

        spendingGood_homePage.username.sendKeys(ConfigReader.getProperty("vendor_email"));
        spendingGood_homePage.password.sendKeys(ConfigReader.getProperty("vendor_password"));
        spendingGood_homePage.SignIN.click();
        ReusableMethods.verifyElementDisplayed(spendingGood_homePage.username);
        ReusableMethods.waitFor(3);



        spendingGood_loginPage.My_Account.click();
        ReusableMethods.waitFor(10);
        ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.My_Account);
        ReusableMethods.waitFor(3);

        actions.keyDown(Keys.ARROW_DOWN).perform();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Addresses.click();
        ReusableMethods.waitFor(8);
        ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.Addresses);
        ReusableMethods.waitFor(4);

        actions.keyDown(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);

        //spendingGood_loginPage.Add.click();

        spendingGood_loginPage.Edit_Your_Billing_Adress.click();
        ReusableMethods.waitFor(4);
        // ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.Edit_Your_Billing_Adress);


        spendingGood_loginPage.Firstname.clear();
        spendingGood_loginPage.Firstname.sendKeys(ConfigReader.getProperty("Firstname"));
        ReusableMethods.waitFor(5);


        spendingGood_loginPage.Lastname.clear();
        spendingGood_loginPage.Lastname.sendKeys(ConfigReader.getProperty("Lastname"));
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Company_name.clear();

        ReusableMethods.waitFor(3);

        actions.keyDown(Keys.PAGE_DOWN).perform();
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

        spendingGood_loginPage.Town_City.clear();
        spendingGood_loginPage.Town_City.sendKeys("Urfa");
        ReusableMethods.waitFor(8);

        actions.keyDown(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);

         //spendingGood_loginPage.State.click();
        spendingGood_loginPage.State.clear();
        spendingGood_loginPage.State.sendKeys(ConfigReader.getProperty("State_Country"));

        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Billing_Zip_Code.clear();
        spendingGood_loginPage.Billing_Zip_Code.sendKeys(ConfigReader.getProperty("Postcode_ZIP"));
        ReusableMethods.waitFor(5);



               spendingGood_loginPage.Phone.clear();
        spendingGood_loginPage.Phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.waitFor(10);




        //        spendingGood_loginPage.State.sendKeys("Tocantis");
//        ReusableMethods.waitFor(5);
        ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.email);
        spendingGood_loginPage.Save_Address.submit();

       // System.out.println(spendingGood_loginPage.error_message.getText());

//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_END);

        ReusableMethods.getScreenshot("Ekran Görüntüsü");


    }
}
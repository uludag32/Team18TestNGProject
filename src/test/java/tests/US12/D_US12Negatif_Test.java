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


public class D_US12Negatif_Test {
    SpendingGood_HomePage spendingGood_homePage;
    SpendingGood_LoginPage spendingGood_loginPage;

    @Test

    public void us12TC01() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("spending_Good_Url"));

        ReusableMethods.waitFor(10);

       spendingGood_homePage=new SpendingGood_HomePage();
       spendingGood_loginPage=new SpendingGood_LoginPage();
       spendingGood_homePage.Sign_In.click();
       Actions actions=new Actions(Driver.getDriver());

        spendingGood_homePage.username.sendKeys(ConfigReader.getProperty("vendor_username"));
        spendingGood_homePage.password.sendKeys(ConfigReader.getProperty("vendor_password"));
        spendingGood_homePage.SignIN.click();
        ReusableMethods.verifyElementDisplayed(spendingGood_homePage.username);
        ReusableMethods.waitFor(3);

        spendingGood_loginPage.My_Account.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.My_Account);
        ReusableMethods.waitFor(3);

  actions.keyDown(Keys.ARROW_DOWN).perform();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Addresses.click();
        ReusableMethods.waitFor(10);
        ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.Addresses);
        ReusableMethods.waitFor(4);


        actions.keyDown(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Edit_Your_Billing_Adress.click();
        ReusableMethods.waitFor(3);
       // ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.Edit_Your_Billing_Adress);



        spendingGood_loginPage.Firstname.clear();
        ReusableMethods.waitFor(5);


        spendingGood_loginPage.Lastname.clear();
        ReusableMethods.waitFor(5);


//        actions.keyDown(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);


        spendingGood_loginPage.billing_Street_address1.clear();
        ReusableMethods.waitFor(5);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Town_City.clear();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.State.clear();
        ReusableMethods.waitFor(10);


        spendingGood_loginPage.billing_Zip_Code1.clear();

        spendingGood_loginPage.Billing_Zip_Code.clear();

        ReusableMethods.waitFor(10);


        spendingGood_loginPage.Phone.clear();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Save_Address.submit();
        ReusableMethods.waitFor(3);


    System.out.println(spendingGood_loginPage.error_message.getText());

//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_END);
        actions.keyDown(Keys.ARROW_DOWN).perform();
        actions.keyDown(Keys.ARROW_DOWN).perform();

        ReusableMethods.waitFor(3);
        ReusableMethods.getScreenshot("Ekran Görüntüsü");


    }

}

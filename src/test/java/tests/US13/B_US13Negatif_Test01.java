package tests.US13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.fatih.SpendingGood_HomePage;
import pages.fatih.SpendingGood_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class B_US13Negatif_Test01 {
    SpendingGood_HomePage spendingGood_homePage;
    SpendingGood_LoginPage spendingGood_loginPage;

    @Test
    public void testUs13() throws IOException {
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
        ReusableMethods.waitFor(8);
        ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.Addresses);
        ReusableMethods.waitFor(4);

        actions.keyDown(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Edit_Your_Shipping_Adress.click();
        ReusableMethods.waitFor(15);



        spendingGood_loginPage.Shipping_Firstname1.clear();
        ReusableMethods.waitFor(5);


        spendingGood_loginPage.Shipping_lastname.clear();
        ReusableMethods.waitFor(5);

//        spendingGood_loginPage.shipping_Country_Region.clear();
//        ReusableMethods.waitFor(5);

//        spendingGood_loginPage.shipping_Country_Region0.click();
//        ReusableMethods.waitFor(5);
//        spendingGood_loginPage.shipping_Country_Region01.submit();
//        ReusableMethods.waitFor(5);




        spendingGood_loginPage.shipping_Street_adress_1.clear();
        ReusableMethods.waitFor(5);



        spendingGood_loginPage.shipping_Town_City.clear();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Shipping_State_County.clear();
        ReusableMethods.waitFor(5);



        spendingGood_loginPage.shipping_Zip_Code1.clear();
        ReusableMethods.waitFor(5);



        spendingGood_loginPage.Save_Address.submit();

       actions.keyDown(Keys.ARROW_DOWN).perform();

        System.out.println(spendingGood_loginPage.error_message1.getText());

//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_END);

        ReusableMethods.getScreenshot("Ekran Görüntüsü");


    }

}

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

public class A_US13Pozitif_Test {
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

//        actions.keyDown(Keys.PAGE_DOWN).perform();
//        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Addresses.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.verifyElementDisplayed(spendingGood_loginPage.Addresses);
        ReusableMethods.waitFor(4);

        actions.keyDown(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Edit_Your_Shipping_Adress.click();
        ReusableMethods.waitFor(15);

        spendingGood_loginPage.Shipping_Firstname1.clear();
        spendingGood_loginPage.Shipping_Firstname1.sendKeys((ConfigReader.getProperty("Firstname")));
        ReusableMethods.waitFor(5);


        spendingGood_loginPage.Shipping_lastname.clear();
        spendingGood_loginPage.Shipping_lastname.sendKeys(ConfigReader.getProperty("Lastname"));
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.shipping_Company_name.clear();
        spendingGood_loginPage.shipping_Company_name.sendKeys("Tosyali");

        try {
            //Kullanıcı Country / Region  alanına tıklar
            spendingGood_loginPage.shipping_Country_Region1.click();
            ReusableMethods.waitFor(2);
            //Kullanıcı Country / Region  alanından American Samoa'yi secer.
            spendingGood_loginPage.shipping_Country_Region2.sendKeys("American Samoa",Keys.ENTER);
        } catch (Exception e){

        }

        try {
            spendingGood_loginPage.shipping_Country_Region3.click();
            ReusableMethods.waitFor(2);
            //Kullanıcı Country / Region  alanından American Samoa'yi secer.
            spendingGood_loginPage.shipping_Country_Region4.sendKeys("American Samoa",Keys.ENTER,Keys.TAB);
        } catch (Exception e) {
        }

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.shipping_Street_adress_1.clear();
        spendingGood_loginPage.shipping_Street_adress_1.sendKeys(ConfigReader.getProperty("Street_Adresses"));
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.shipping_Street_adress_2.clear();
        spendingGood_loginPage.shipping_Street_adress_2.sendKeys("Apt");

        ReusableMethods.waitFor(3);


        spendingGood_loginPage.shipping_Town_City.clear();
        spendingGood_loginPage.shipping_Town_City.sendKeys(ConfigReader.getProperty("Town_City"));
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.Shipping_State_County.clear();
        spendingGood_loginPage.Shipping_State_County.sendKeys(ConfigReader.getProperty("State_Country"));
        ReusableMethods.waitFor(5);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);

        spendingGood_loginPage.shipping_Zip_Code1.clear();
        spendingGood_loginPage.shipping_Zip_Code1.sendKeys(ConfigReader.getProperty("Postcode_ZIP"));
        ReusableMethods.waitFor(8);


        spendingGood_loginPage.Save_Address.submit();

        ReusableMethods.waitFor(5);

        System.out.println(spendingGood_loginPage.successfully_message.getText());




//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_END);

        ReusableMethods.getScreenshot("Ekran Görüntüsü");


    }

}


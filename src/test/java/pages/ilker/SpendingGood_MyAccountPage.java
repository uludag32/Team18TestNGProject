package pages.ilker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendingGood_MyAccountPage {
    public SpendingGood_MyAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//*[text()='Addresses'])[1]")
    public WebElement adressesButton;

    @FindBy(xpath = "(//*[.='Account details'])[1]")
    public WebElement accountDetailsButton;

    //Save
    @FindBy(name = "save_address")
    public WebElement save;

    //Billing Address Add
    @FindBy(xpath = "//*[text()='Edit Your Billing Address']")
    public WebElement billingAddressAdd;

    //ShippingAddress Add
    @FindBy(xpath = "//*[text()='Edit Your Shipping Address']")
    public WebElement shippingAddressAdd;

    //Billing Locates
    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement billingFirstName;

    @FindBy(xpath = "//*[@id='billing_last_name']")
    public WebElement billingLastName;

    @FindBy(id = "billing_country")
    public WebElement billingCountryDropDown;

    @FindBy(id = "billing_address_1")
    public WebElement billingStreetAddress;

    @FindBy(id = "billing_city")
    public WebElement billingCity;

    @FindBy(id = "billing_state")
    public WebElement billingProvinceDropDown;

    @FindBy(id = "billing_postcode")
    public WebElement billingZipCode;

    @FindBy(id = "billing_phone")
    public WebElement billingPhone;

    @FindBy(id = "billing_email")
    public WebElement billingEmailAddress;

    //Shipping Locates
    @FindBy(id = "shipping_first_name")
    public WebElement shippingFirstName;

    @FindBy(id = "shipping_last_name")
    public WebElement shippingLastName;

    @FindBy(id = "select2-shipping_country-container")
    public WebElement shippingCountryDropDown;

    @FindBy(id = "shipping_address_1")
    public WebElement shippingStreetAddress;

    @FindBy(id = "shipping_city")
    public WebElement shippingCity;

    @FindBy(id = "shipping_state")
    public WebElement shippingProvinceDropDown;

    @FindBy(id = "shipping_postcode")
    public WebElement shippingZipCode;

    @FindBy(xpath = "//*[text()='Account Details']")
    public WebElement accountDetailsYazısı;

    //Account Details Locates
    @FindBy(id = "account_first_name")
    public WebElement accountFirstName;

    @FindBy(id = "account_last_name")
    public WebElement accountLastName;

    @FindBy(id = "account_display_name")
    public WebElement accountDisplayName;

    @FindBy(id = "account_email")
    public WebElement accountEmail;

    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement biographyText;

    @FindBy(id = "password_current")
    public WebElement currentPassword;

    @FindBy(id = "password_1")
    public WebElement newPassword;

    @FindBy(id = "password_2")
    public WebElement confirmPassword;

    @FindBy(xpath = "//button[@name='save_account_details']")
    public WebElement accountSave;


}

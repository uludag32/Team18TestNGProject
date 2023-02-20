package pages.fatih;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendingGood_LoginPage {
    public SpendingGood_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   //Billing Locate'leri


    @FindBy(xpath = "//ul[@role='alert']")
    public WebElement error_message;

    @FindBy(xpath = "(//*[.='My Account'])[1]")
    public WebElement My_Account;


    @FindBy(linkText = "//a[text()='Add']")
    public WebElement Add;


    @FindBy(xpath = "//a[.='Addresses']")
    public WebElement Addresses;



    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
        public WebElement Edit_Your_Billing_Adress;


    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement Firstname;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    public WebElement Lastname;

    @FindBy(xpath = "//input[@id='billing_company']")
    public WebElement Company_name;


    @FindBy(xpath = "(//span[@role='presentation'])[1]")
    public WebElement Country_Region1;

    @FindBy(xpath ="//li[.='Bhutan']")
    public WebElement Country_Region2;



    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement billing_Street_address1;

    @FindBy(xpath = "//input[@id='billing_address_2']")
    public WebElement billing_Street_address2;

    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement Town_City;


    @FindBy(xpath = "//input[@id='billing_state']")
    public WebElement State;


    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement Billing_Zip_Code;


    @FindBy(xpath = "//input[@id='billing_phone']")
    public WebElement Phone;

    @FindBy(xpath = "//input[@id='billing_email']")
    public WebElement email;


    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement Save_Address;

    @FindBy(xpath = "//html[@lang='en-US']")

    public WebElement Scrollbar;




   //Shipping Locate' leri


    @FindBy(linkText = "(//A[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement ADD;


    @FindBy(linkText = "//input[@id='shipping_first_name']")
    public WebElement firstname;


    @FindBy(linkText = "//a[text()='Add']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public WebElement Firstname1;

    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement Edit_Your_Shipping_Adress;


    @FindBy(xpath = "//input[@id='shipping_last_name']")
    public WebElement Shipping_lastname;

    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public WebElement Shipping_Firstname1;


    @FindBy(xpath = "//input[@id='shipping_company']")
    public WebElement shipping_Company_name;

    @FindBy(xpath = "//span[@class='select2-selection__arrow']")
    public WebElement shipping_Country_Region0;

    @FindBy(xpath = "//li[@id='select2-shipping_country-result-t2rv-AS']")
    public WebElement shipping_Country_Region01;

    @FindBy(xpath = "//input[@id='shipping_address_1']")
    public WebElement shipping_Street_adress_1;

    @FindBy(xpath = "//input[@id='shipping_address_2']")
    public WebElement shipping_Street_adress_2;

    @FindBy(xpath = "//input[@id='shipping_state']")
    public WebElement Shipping_State_County;

    @FindBy(xpath = "//input[@id='shipping_city']")
    public WebElement shipping_Town_City;


    @FindBy(xpath = "//input[@id='shipping_postcode']")
    public WebElement shipping_Zip_Code1;

    @FindBy(xpath = "//button[@name='save_address']")

    public WebElement SHIPPING_SAVE_ADRESS;

    @FindBy(xpath = "//ul[@role='alert']")
    public WebElement error_message1;

    @FindBy(xpath = "//div[@class='woocommerce-notices-wrapper']")
    public WebElement successfully_message;

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboard;




}
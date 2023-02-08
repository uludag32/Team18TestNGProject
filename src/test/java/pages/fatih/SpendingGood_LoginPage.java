package pages.fatih;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendingGood_LoginPage {
    public SpendingGood_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   //Billing Locate'leri

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement error_message;

    @FindBy(linkText = "//a[text()='My Account']")
    public WebElement My_Accounr;

    @FindBy(linkText = "//a[text()='Addresses']")
    public WebElement Adresses;

    @FindBy(linkText = "//a[text()='Add']")
    public WebElement Add;

    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement Firstname;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    public WebElement Lastname;

    @FindBy(xpath = "//input[@id='billing_company']")
    public WebElement Company_name;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement billing_Street_address1;

    @FindBy(xpath = "//input[@id='billing_address_2']")
    public WebElement billing_Street_address2;

    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement Town_City;

    @FindBy(xpath = "(//span[@class='select2-selection__placeholder'])[2]")
    public WebElement State;


    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement Zip_Code;


    @FindBy(xpath = "//input[@id='billing_phone']")
    public WebElement Phone;

    @FindBy(xpath = "//input[@id='billing_email']")
    public WebElement email;

   //Shipping Locate' leri

    @FindBy(linkText = "(//A[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement ADD;

    @FindBy(linkText = "//input[@id='shipping_first_name']")
    public WebElement firstname;

    @FindBy(linkText = "//a[text()='Add']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public WebElement Firstname1;

    @FindBy(xpath = "//input[@id='shipping_last_name']")
    public WebElement shipping_Lastname;

    @FindBy(xpath = "//input[@id='shipping_company']")
    public WebElement shipping_Company_name;

    @FindBy(xpath = "//span[@class='select2-selection__placeholder']")
    public WebElement shipping_Country_Region;

    @FindBy(xpath = "//input[@id='shipping_address_02']']")
    public WebElement shipping_States_adress_1;

    @FindBy(xpath = "//input[@id='shipping_address_2']")
    public WebElement shipping_States_adress_03;

    @FindBy(xpath = "//input[@id='shipping_city']")
    public WebElement shippin_Town_City;


    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement shipping_Zip_Code1;

    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement SAVE_ADRESS;

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboard;




}
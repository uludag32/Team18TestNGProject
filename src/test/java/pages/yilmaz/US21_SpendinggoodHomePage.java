package pages.yilmaz;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US21_SpendinggoodHomePage {
    public US21_SpendinggoodHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement searchBox;

    @FindBy(xpath = "//h1")
    public WebElement kalemlikDisplayed;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='cart-count']")
    public WebElement sepetDisplayed;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement quantityDisplayed;

    @FindBy(xpath = "//button[@class='quantity-plus w-icon-plus']")
    public WebElement quantityArti;

    @FindBy(xpath = "//button[@class='quantity-minus w-icon-minus']")
    public WebElement quantityEksi;

    @FindBy(xpath = "//*[@class='w-icon-cart']")
    public WebElement cart;

    @FindBy(xpath = "//*[@class='button checkout wc-forward']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//*[contains(text(),'Billing details')]")
    public WebElement faturaDetay;

    @FindBy(xpath = "//*[@class='showcoupon']")
    public WebElement enterYourCode;

    @FindBy(xpath = "//*[@id='coupon_code']")
    public WebElement validCode;

    @FindBy(xpath = "//button[text()='Apply coupon']")
    public WebElement applyCoupon;

    @FindBy(xpath = "//*[contains(text(),'Sorry, this coupon is not applicable to selected products.')]")
    public WebElement couponDisplayed;

    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[@id='billing_last_name']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='billing_company']")
    public WebElement companyOptionalBox;

    @FindBy(xpath = "//*[@id='select2-billing_country-container']")
    public WebElement countryBox;

    @FindBy(xpath = "//*[@class='select2-search__field']")
    public WebElement countryTextBox;

    @FindBy(xpath = "//*[@id='billing_address_1']")
    public WebElement streetAddressBox;

    @FindBy(xpath = "//input[@id='billing_address_2']")
    public WebElement streetAddressOptinalBox;

    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement postCodeBox;

    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement townBox;

    @FindBy(xpath = "(//span[@role='presentation'])[2]")
    public WebElement provinceBox;

    @FindBy(xpath = "//*[@class='select2-search__field']")
    public WebElement provinceTextBox;

    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement phoneBox;

    @FindBy(xpath = "//input[@id='billing_email']")
    public WebElement emailadressBox;

    @FindBy(xpath = "//*[@id='order_comments']")
    public WebElement orderNotesOptionalBox;

    @FindBy(xpath = "//div[@id='payment']")
    public WebElement paymentText;

    @FindBy(xpath = "//input[@id='payment_method_bacs']")
    public WebElement wireTransfer;

    @FindBy(xpath = "//input[@id='payment_method_cod']")
    public WebElement payAtTheDoor;

    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement placeOrderBox;

    @FindBy(xpath = "//*[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement finishShoppingText;

    @FindBy(xpath = "//html[@lang='en-US']")
    public WebElement billingDetailsPageDisplay;

}

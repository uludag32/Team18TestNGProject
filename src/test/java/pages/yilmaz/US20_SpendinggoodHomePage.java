package pages.yilmaz;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US20_SpendinggoodHomePage {
    public US20_SpendinggoodHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Sign In ']")
    public WebElement signInTab;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement SIGNINbutton;

    @FindBy(xpath = "//html[@lang='en-US']")
    public WebElement homePageDisplayed;

    @FindBy(xpath = "(//a[contains(text(),'My Account')])[1]")
    public WebElement myAccount;

    @FindBy(xpath = "//h2[text()='My Account']")
    public WebElement myAccountDisplayed;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy(xpath = "//h2[text()='Store Manager']")
    public WebElement storeMangerDisplayed;

    @FindBy(xpath = "//*[contains(text(),'Coupons')]")
    public WebElement coupons;

    @FindBy(xpath = "(//a[contains(text(),'Add New')])[4]")
    public WebElement addNew;

    @FindBy(xpath = "//*[@id='title']")
    public WebElement codeBox;

    @FindBy(xpath = "//*[@id='description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "//*[@id='discount_type']")
    public WebElement discountTypeBox;

    @FindBy(xpath = "//*[@id='coupon_amount']")
    public WebElement couponAmountBox;

    @FindBy(xpath = "//input[@id='expiry_date']")
    public WebElement expiryDateBox;

    //    @FindBy(xpath = "//input[@id='free_shipping']")
//    public WebElement allowFreeShipping;
    @FindBy(xpath = "//*[@name='free_shipping']")
    public WebElement allowFreeShipping;

    @FindBy(xpath = "//*[@name='show_on_store']")
    public WebElement showOnStore;

    @FindBy(xpath = "//*[@id='coupons_manage_limit']")
    public WebElement limit;

    @FindBy(xpath = "//input[@id='usage_limit']")
    public WebElement useLimit;

    @FindBy(xpath = "//*[@id='wcfm_coupon_manager_submit_button']")
    public WebElement submitBox;

    @FindBy(xpath = "//*[text()='Coupon Successfully Published.']")
    public WebElement couponDisplayed;

    @FindBy(xpath = "//*[contains(text(),'Coupon code already exists - customers will use the latest coupon with this code.')]")
    public WebElement kuponKoduZatenKullanildi;



}

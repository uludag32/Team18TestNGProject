package pages.omer;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendingGoodDashboardPage {

    public SpendingGoodDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//p[.='Welcome to spendıng good!']")
    public WebElement dashboardMessage;

    @FindBy(xpath = "(//input[@name='s'])[1]")
    public WebElement searchArea;

    @FindBy(xpath = "//i[@class='w-icon-search']")
    public WebElement searchButton;

    @FindBy(xpath = "(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "//a[@data-product-id='20629']")
    public WebElement wishlistButton;

    @FindBy(xpath = "//a[@data-title='Browse wishlist...']")
    public WebElement hearthButton;

    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement wishListPageTitle;

    @FindBy(xpath = "//button[@title='Quick View']")
    public WebElement quickViewButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addToChartButton;
    @FindBy(xpath = "//a[@title='Remove this product']")
    public WebElement removeProductButton;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/button")
    public WebElement closeButton;
    @FindBy(xpath = "//a[@class='cart-toggle']")
    public WebElement viewChartButton;
    @FindBy(xpath = "//a[@class='btn btn-sm btn-dark btn-rounded']")
    public WebElement popUpCheckoutButton;

    @FindBy(xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkOutButton;


//Billing Details Locators
    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='billing_company']")
    public WebElement billingCompany;

    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[1]")
    public WebElement selectionArrow1;
    @FindBy(xpath="//input[@class='select2-search__field']")
    public WebElement dropDownMenuTurkey;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement streetAddress1;

    @FindBy(xpath="//input[@id='billing_postcode']")
    public WebElement postCode;


    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement billingTownCity;

    @FindBy(xpath = "//span[@title='Ankara']")
    public WebElement province;

    @FindBy(id="billing_phone")
    public WebElement phone;

    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//i[@class='fas fa-check']")
    public WebElement orderCompleteMessage;





}

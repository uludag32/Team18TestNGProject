package pages.yilmaz;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US22_SpendinggoodHomePage {
    public US22_SpendinggoodHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[@class='product_title entry-title']")
    public WebElement samsungTVDisplay;

    @FindBy(xpath = "//h1[@class='product_title entry-title']")
    public WebElement casioSaatDisplay;

    @FindBy(xpath = "//*[@class='shop_table woocommerce-checkout-review-order-table']")
    public WebElement urunlerDisplay;

    @FindBy(xpath = "//h3[contains(text(),'Billing details')]")
    public WebElement faturaDetaylariDisplayed;

    @FindBy(xpath = "//*[@class='order-total']")
    public WebElement odenecekMiktar;

    @FindBy(xpath = "//*[@class='woocommerce-order-details']")
    public WebElement orderDetails;

}


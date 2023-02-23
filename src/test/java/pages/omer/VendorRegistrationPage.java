package pages.omer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VendorRegistrationPage {
    public VendorRegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="user_email")
    public WebElement vendorEmail;

    @FindBy(xpath = "//input[@name='wcfm_email_verified_button']")
    public  WebElement verificationButton;

    @FindBy(xpath = "//div[@class='wcfm-message email_verification_message wcfm-success']")
    public WebElement verificationMessage;

    @FindBy(xpath = "//input[@placeholder='Verification Code']")
    public WebElement verificationCodeBox;

    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement vendorRegistrationHeader;

    @FindBy(xpath = "//input[@id='passoword']")
    public WebElement vendorPassword1;

    @FindBy(xpath = "//input[@id='wcfm_membership_register_button']")
    public WebElement registerButton;

    @FindBy(xpath = "//a[@class='button button-large']")
    public WebElement setUpCancelButton;

    @FindBy(xpath = "//div[@class='wcfm-message wcfm-error']")
    public WebElement errorMessage;

}
package tests.US12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendingGood_HomePage {
public SpendingGood_HomePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath="//a[@class='register inline-type']")
    public WebElement Register;

@FindBy(linkText = "//a[text()='Become a Vendor']\n")
    public WebElement Become_a_Vendor;

@FindBy(xpath = "//input[@id='wcfm_membership_register_button']\n")
    public WebElement Register_Onay;

@FindBy(linkText = "//a[text()='Not right now']")
    public WebElement Store_Setup;

@FindBy(linkText = "//a[text()='Log out']\n")
    public WebElement logoutLink;


}

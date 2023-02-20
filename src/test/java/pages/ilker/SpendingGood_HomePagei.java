package pages.ilker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendingGood_HomePagei {
    public SpendingGood_HomePagei() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Sign In ']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement loginbutton;

    @FindBy(xpath = "(//*[.='My Account'])[1]")
    public WebElement myAccount;


}

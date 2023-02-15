package pages.muhammet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Mx {
    public Mx(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='My Account']")
    public WebElement myAccount;

    @FindBy (id = "username")
    public WebElement userName;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (name= "login")
    public WebElement loginx;

    @FindBy (xpath = "//h2[@class='page-title']")
    public WebElement loginPageAssert;

    @FindBy  (xpath = "//*[text()='Store Manager']")
    public WebElement storeM;
}

package pages.omer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendingGoodHomePage {

    public SpendingGoodHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//i[@class='w-icon-account']")
    public WebElement signIn;
    @FindBy(id = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "login")
    public WebElement submitButton;

}

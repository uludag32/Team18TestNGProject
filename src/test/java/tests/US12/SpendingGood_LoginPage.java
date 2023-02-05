package tests.US12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendingGood_LoginPage {
    public SpendingGood_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy(xpath = "//input[@id='user_email']\n")
    public WebElement emailBox;

     @FindBy(xpath = "//input[@data-required='1']\n")
    public WebElement Verification;

     @FindBy(xpath = "//input[@id='passoword']\n")
    public WebElement password1;

     @FindBy(xpath = "//input[@id='confirm_pwd']\n")
    public WebElement password2;

     @FindBy(xpath = "//div[@role='alert']")
    public WebElement error_message;


}

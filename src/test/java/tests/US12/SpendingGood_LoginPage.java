package tests.US12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendingGood_LoginPage {
    public SpendingGood_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

     @FindBy(xpath = "//input[@id='password']")
    public WebElement password;


     @FindBy(xpath = "//div[@role='alert']")
    public WebElement error_message;


}

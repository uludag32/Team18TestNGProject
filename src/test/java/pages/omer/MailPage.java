package pages.omer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MailPage {

    public  MailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='login-username']")
    public WebElement mailUsername;

    @FindBy(xpath = "//input[@id='login-signIn']")
    public  WebElement loginButton;

    @FindBy(xpath = "//input[@id='login-passwd']")
    public WebElement mailPassWord;


    @FindBy(xpath = "//a[@id='ybarMailLink']")
    public WebElement mailLink;


    @FindBy(xpath = "(//span[@data-test-id='message-subject'])[1]")
    public WebElement firstMailSubject;





    @FindBy(xpath = "//span[@data-test-id='message-group-subject-text']")
    public WebElement verificationMessage;




}

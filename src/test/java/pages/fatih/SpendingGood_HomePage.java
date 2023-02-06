package pages.fatih;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendingGood_HomePage {
public SpendingGood_HomePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath="(//span[text()='Sign In '])[1]")
    public WebElement Sign_In;

@FindBy(id = "username")
    public WebElement userName;

@FindBy(xpath = "//button[@name='login']")
    public WebElement SignIN;



@FindBy(linkText = "//a[text()='Log out']\n")
    public WebElement logoutLink;


}

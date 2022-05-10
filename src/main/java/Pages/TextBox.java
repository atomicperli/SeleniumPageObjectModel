package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TextBox {

    WebDriver myDriver;

    @FindBy(how=How.XPATH, using = "//input[@id='userName']")
    public WebElement fullName;

    @FindBy(how=How.XPATH, using = "//input[@id='userEmail']")
    public WebElement email;

    @FindBy(how=How.XPATH, using = "//textarea[@id='currentAddress']")
    public WebElement presentAddress;

    @FindBy(how=How.XPATH, using = "//textarea[@id='permanentAddress']")
    public WebElement permanentAddress;

    @FindBy(how = How.XPATH, using = "//button[@id='submit']")
    public WebElement submitButton;
    
    @FindBy(how = How.XPATH, using = "//button[@id='submit']")
    public WebElement submitButton2;

    @FindBy(how = How.XPATH, using = "//button[@id='submit']")
    public WebElement submitButton3;

}

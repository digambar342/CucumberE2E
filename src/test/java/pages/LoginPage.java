package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Utils;

public class LoginPage extends Utils {

    private WebDriver driver;
    @FindBy (id = "user-name")
    private WebElement userName;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="login-button")
    private WebElement loginButton;

    @FindBy(xpath="//h3[@data-test='error']")
    private WebElement errorMesage;


    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUserName(String uName){
        waitFor(userName);
        userName.sendKeys(uName);
    }
    public void enterPassword(String pwd){
        waitFor(password);
        password.sendKeys(pwd);
    }
    public void clickOnSubmit(){
        waitFor(loginButton);
        loginButton.click();
    }
    public void validateErrorMessage(){
        waitFor(errorMesage);
        Assert.assertTrue(errorMesage.getText().contains("Username and password do not match"));
    }

}

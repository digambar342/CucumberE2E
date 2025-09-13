package stepDefinations;

import driver.DriverRepo;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.LoginPage;
import pages.Products;

public class StepDefinations {
    private static final Logger log = LoggerFactory.getLogger(StepDefinations.class);
    WebDriver driver= DriverRepo.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    Products productPage = new Products(driver);
    @Given("user enters correct userName {string}")
    public void user_enters_correct_user_name(String userName) {
        System.out.println("Enter correct userName "+userName);
        loginPage.enterUserName(userName);
    }
    @Given("user enters correct password {string}")
    public void user_enters_correct_password(String password) {
        System.out.println("Enter correct password "+password);
        loginPage.enterPassword(password);
    }
    @Given("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        loginPage.clickOnSubmit();
    }
    @Given("user verifies that product page appears")
    public void user_verifies_that_product_page_appears(){
        Assert.assertTrue(productPage.verifyProductPage());
    }
    @Given("user verifies the error message")
    public void user_verifies_the_error_message(){
     loginPage.validateErrorMessage();
    }
}

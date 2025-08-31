package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {
    private WebDriver driver;
    @FindBy (xpath = "//span[contains(text(),'Products')]")
    private WebElement ProductsText;

    public Products(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public boolean verifyProductPage(){
        boolean isProductAppears=false;
        try {
            if(ProductsText.isDisplayed()){
                isProductAppears=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return isProductAppears;
    }

}

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoexeHomePage extends BasePage{
    public AutoexeHomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "header")
    private WebElement homePageIsVisible;
    @FindBy(xpath = ".//a[@href='/login']")
    private WebElement signUpLoginLocator;


    public void clickOnSignSignUpButton(){
        signUpLoginLocator.click();

    }
    public boolean IsHomePageVisble(){
        return homePageIsVisible.isDisplayed();
    }



    }


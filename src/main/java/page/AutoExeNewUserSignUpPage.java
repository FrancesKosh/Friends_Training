package page;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoexeNewUserSignPage extends BasePage{

    public AutoexeNewUserSignPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
    private WebElement newUserSignupPageIsVisible;
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement enterNameLocator;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement enterEmailLocator;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement clickOnSignUpLocator;





    public boolean IsNewUseSignUpPageVisble(){
        return newUserSignupPageIsVisible.isDisplayed();
    }
    public void EnterName(String Nme){
        enterNameLocator.sendKeys(Nme);

    }
    public void EnterEmail(String Email){
        enterEmailLocator.sendKeys(generateRandomEmail());
    }
    private String generateRandomEmail(){
        return RandomStringUtils.random(4, true, true) + "@GMail.com";
    }
    public void ClickOnSignUpButton(){
        clickOnSignUpLocator.click();

    }
}

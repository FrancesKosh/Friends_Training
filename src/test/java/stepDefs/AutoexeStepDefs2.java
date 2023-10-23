package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AutoExeAccountInfoPage;
import page.AutoExeNewUserSignUpPage;
import page.AutoExercisesHomePage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AutoexeStepDefs extends BaseUtil {
    private BaseUtil base;
    public AutoexeStepDefs(BaseUtil base){this.base=base;}

    @Given("I am on autoexercise home page")
    public void i_am_on_autoexercise_home_page() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.manage().window().maximize();
//        base.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        base.driver.get("https://automationexercise.com/");
    }
    @Then("I Verify that home page is visible successfully")
    public void i_verify_that_home_page_is_visible_successfully() {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesHomePage autoExercisesHomePage = new AutoExercisesHomePage(base.driver);
        assertThat(autoExercisesHomePage.IsHomePageVisble(),equalTo(true));


    }
    @Then("Click on {string} button")
    public void click_on_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesHomePage autoExercisesHomePage = new AutoExercisesHomePage(base.driver);
        autoExercisesHomePage.clickOnSignSignUpButton();
    }
    @Then("I Verify {string} is visible")
    public void i_verify_is_visible(String string) {
        AutoExeNewUserSignUpPage autoExeNewUserSignUpPage = new AutoExeNewUserSignUpPage(base.driver);
        assertThat(autoExeNewUserSignUpPage.IsNewUseSignUpPageVisble(),equalTo(true));
    }
    @Then("I Enter {string} and {string}")
    public void i_enter_and(String Nme, String Email) {
        // Write code here that turns the phrase above into concrete actions
        AutoExeNewUserSignUpPage autoExeNewUserSignUpPage = new AutoExeNewUserSignUpPage(base.driver);
        autoExeNewUserSignUpPage.EnterName(Nme);
        autoExeNewUserSignUpPage.EnterEmail(Email);
    }
    @Then("Click {string} button")
    public void click_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExeNewUserSignUpPage autoExeNewUserSignUpPage = new AutoExeNewUserSignUpPage(base.driver);
        autoExeNewUserSignUpPage.ClickOnSignUpButton();
    }
    @Then("I Verify that {string} is visible")
    public void i_verify_that_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExeAccountInfoPage autoExeAccountInfoPage = new AutoExeAccountInfoPage(base.driver);
        assertThat(autoExeAccountInfoPage.IsAccountInfoPageVisble(),equalTo(true));
    }
    @When("Fill details: Title, {string} and {string}")
    public void fill_details_title_and(String pWord, String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExeAccountInfoPage autoExeAccountInfoPage = new AutoExeAccountInfoPage(base.driver);
        autoExeAccountInfoPage.ClickOnGenderButton();
        autoExeAccountInfoPage.EnterPassword(pWord);
        autoExeAccountInfoPage.EnterDayofBirth();
        autoExeAccountInfoPage.EnterMonthOfBirth();
        autoExeAccountInfoPage.EnterYearOfBirth();

    }
    @When("Select checkbox {string}")
    public void select_checkbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExeAccountInfoPage autoExeAccountInfoPage = new AutoExeAccountInfoPage(base.driver);
        autoExeAccountInfoPage.ClickOnSignUpLettersButton();
        autoExeAccountInfoPage.ClickOnReceiveOfferButton();
    }
    @When("Fill details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fill_details(String fName, String lName, String coyName, String addre, String countryName, String staNmae, String citNmae, String zipCde, String num) {
        // Write code here that turns the phrase above into concrete actions
        AutoExeAccountInfoPage autoExeAccountInfoPage = new AutoExeAccountInfoPage(base.driver);
        autoExeAccountInfoPage.EnterFirstName(fName);
        autoExeAccountInfoPage.EnterLastName(lName);
        autoExeAccountInfoPage.EnterCompanyName(coyName);
        autoExeAccountInfoPage.EnterAddress(addre);
        autoExeAccountInfoPage.EnterCountryName(countryName);
        autoExeAccountInfoPage.EnterStateName(staNmae);
        autoExeAccountInfoPage.EnterCityName(citNmae);
        autoExeAccountInfoPage.EnterZipCodeNum(zipCde);
        autoExeAccountInfoPage.EnterMobileNum(num);
    }
    @When("Click {string}")
    public void click(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExeAccountInfoPage autoExeAccountInfoPage = new AutoExeAccountInfoPage(base.driver);
        autoExeAccountInfoPage.ClickOnCreateAccButton();
    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExeAccountInfoPage autoExeAccountInfoPage = new AutoExeAccountInfoPage(base.driver);
        assertThat(autoExeAccountInfoPage.AccountCreatedIsDispalyed(),equalTo(true));
    }
    @Then("Click Continue button")
    public void click_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        AutoExeAccountInfoPage autoExeAccountInfoPage= new AutoExeAccountInfoPage(base.driver);
        autoExeAccountInfoPage.ClickOnContinueButton();

    }

    @And("I Enter correct {string} and {string}")
    public void iEnterCorrectAnd(String eMail, String pWord) {
        AutoExeNewUserSignUpPage autoExeNewUserSignUpPage = new AutoExeNewUserSignUpPage(base.driver);
        autoExeNewUserSignUpPage.EnterEmailAddress(eMail);
        autoExeNewUserSignUpPage.EnterPassWord(pWord);

    }

    @And("I Click login button")
    public void iClickLoginButton() {
        AutoExeNewUserSignUpPage autoExeNewUserSignUpPage = new AutoExeNewUserSignUpPage(base.driver);
        autoExeNewUserSignUpPage.ClickOnLoginButton();
    }

    @When("Enter incorrect {string} and {string}")
    public void enter_incorrect_and(String wEmail, String wPWord) {
        // Write code here that turns the phrase above into concrete actions
        AutoExeNewUserSignUpPage autoExeNewUserSignUpPage = new AutoExeNewUserSignUpPage(base.driver);
        autoExeNewUserSignUpPage.EnterWrongEmailAdd(wEmail);
        autoExeNewUserSignUpPage.EnterWrongPassword(wPWord);

    }
    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExeNewUserSignUpPage autoExeNewUserSignUpPage = new AutoExeNewUserSignUpPage(base.driver);
        assertThat(autoExeNewUserSignUpPage.IsWrongEmailandPwordDisplayed(),equalTo(true));
    }
}

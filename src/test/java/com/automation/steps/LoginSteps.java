package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    
    LoginPage loginPage = new LoginPage();

    @Given("user enters email {string}")
    public void userEntersEmail(String email) {
        loginPage.clickOnGettingStarted();
        loginPage.enterEmail(ConfigReader.getConfigValue(email));
        loginPage.clickOnNextBtn();
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.clickOnSignInOptions();
        loginPage.clickOnSignInWithPassword();
        loginPage.enterPassword(ConfigReader.getConfigValue(password));
       
    }

    @Then("user clicks on login btn")
    public void user_clicks_on_login_btn() {
       loginPage.clickOnLoginBtn();
       loginPage.clickOnPermission();
       loginPage.clickOnAllowNotification();
    }

    @Then("verify user logged in")
    public void verify_user_logged_in() {
        Assert.assertTrue(loginPage.isAddIconDisplayed());
        new HomePage().clickOnWelcomeBanner();
    }

}

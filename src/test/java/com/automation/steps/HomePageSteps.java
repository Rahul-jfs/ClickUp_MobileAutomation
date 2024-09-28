package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Given("user opens app")
    public void user_opens_app() {
        
    }

    @When("user clicks on add button")
    public void user_clicks_on_add_button() {
//        homePage.clickOnWelcomeBanner();
        homePage.clickAddButton();
    }

    @Then("user adds event")
    public void user_adds_event() {
        
    }

    @When("user clicks on more button")
    public void userClicksOnMoreButton() {
        homePage.clickMoreButton();
    }

    @And("user clicks on notepad option")
    public void userClicksOnNotepadOption() {
        homePage.clickOnNotePadOption();
    }

    @When("user clicks on invite option")
    public void userClicksOnInviteOption() {
        homePage.clickInviteOption();
    }

    @Then("verify invite popup is displayed")
    public void verifyInvitePopupIsDisplayed() {
        Assert.assertTrue(homePage.isInvitePopupDisplayed());
    }


    @When("user enters email of member to invite")
    public void userEntersEmailOfMemberToInvite() {
        homePage.enterInviteEmail();
    }

    @And("clicks on invite button")
    public void clicksOnInviteButton() {
        homePage.clickOnInviteBtn();
    }

    @Then("verify invite is sent")
    public void verifyInviteIsSent() {
        Assert.assertTrue(homePage.isInviteSent());
    }

    @When("user clicks on Next button")
    public void userClicksOnNextButton() {
        homePage.clickOnNextBtn();
    }

//    @Then("verify tasks of name {string} displayed")
//    public void verifyNextTasksOfNameDisplayed(String nextTask) {
//        Assert.assertTrue("There are no overdue tasks",homePage.isNextTaskDisplayed(ConfigReader.getConfigValue(nextTask)));
//    }
//
//    @When("user clicks on the task name as {string}")
//    public void userClicksOnTheTaskNameAs(String nextTask) {
//        homePage.clickOnNextTask(ConfigReader.getConfigValue(nextTask));
//    }
//
//    @When("user clicks on overdue button")
//    public void userClicksOnOverdueButton() {
//        homePage.clickOnOverdueBtn();
//    }

    @When("user clicks on see all of my work")
    public void userClicksOnSeeAllOfMyWork() {
        homePage.clickOnSeeAllOfMyWork();
    }

    @And("user clicks on see all of favorite")
    public void userClicksOnSeeAllOfFavorite() {
        homePage.clickOnSeeAllOfFavorite();
    }

}

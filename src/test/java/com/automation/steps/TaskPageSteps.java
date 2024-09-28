package com.automation.steps;

import com.automation.pages.TaskPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TaskPageSteps {

    TaskPage taskPage = new TaskPage();

    @Then("verify user is on task description page")
    public void verifyUserIsOnTaskDescriptionPage() {
        Assert.assertTrue(taskPage.isTaskPageDisplayed());
    }

    @When("user clicks on task status type")
    public void userClicksOnTaskStatusType() {
        taskPage.clickTaskStatusType();
    }

    @Then("verify status types is displayed")
    public void verifyStatusTypesIsDisplayed() {
        Assert.assertTrue(taskPage.isStatusTypesDisplayed());
    }

    @When("user clicks on complete task option")
    public void userClicksOnCompleteTaskOption() {
        taskPage.clickCompleteTaskOption();
    }

    @Then("verify task is marked as complete")
    public void verifyTaskIsMarkedAsComplete() {
        Assert.assertTrue(taskPage.isTaskMarkedComplete());
    }

    @When("user clicks on options button")
    public void userClicksOnOptionsButton() {
        taskPage.clickOnOptionsBtn();
    }

    @Then("verify options popup is displayed")
    public void verifyOptionsPopupIsDisplayed() {
        Assert.assertTrue(taskPage.isOptionsPopupDisplayed());
    }

    @When("user clicks on favorite option")
    public void userClicksOnFavoriteOption() {
        taskPage.clickOnFavoriteOption();
    }

    @Then("verify the option is changed to unFavorite")
    public void verifyTheOptionIsChangedToUnFavorite() {
        Assert.assertTrue(taskPage.isUnFavoriteOptionDisplayed());
    }

    @When("user clicks on done button of options popup")
    public void userClicksOnDoneButtonOfOptionsPopup() {
        taskPage.clickOnPopupDoneBtn();
    }

    @When("user clicks on inProgress task option")
    public void userClicksOnInProgressTaskOption() {
        taskPage.clickOnInProgressTaskOption();
    }

    @When("user clicks on unFavorite option")
    public void userClicksOnUnFavoriteOption() {
        taskPage.clickOnUnFavoriteOption();
    }

    @Then("verify the option is changed to favorite")
    public void verifyTheOptionIsChangedToFavorite() {
        Assert.assertTrue(taskPage.isFavoriteOptionDisplayed());
    }

    @Then("verify task is marked as inProgress")
    public void verifyTaskIsMarkedAsInProgress() {
        Assert.assertTrue(taskPage.isTaskMarkedInProgress());
    }
}

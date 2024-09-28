package com.automation.steps;

import com.automation.pages.MyWorkPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyWorkPageSteps {

    MyWorkPage myWorkPage = new MyWorkPage();

    @Then("verify my work page is displayed")
    public void verifyMyWorkPageIsDisplayed() {
        Assert.assertTrue(myWorkPage.isMyWorkPageDisplayed());
    }

    @When("user clicks on overdue task button")
    public void userClicksOnOverdueTaskButton() {
        myWorkPage.clickOnOverdueTaskBtn();
    }

    @Then("verify overdue tasks are displayed")
    public void verifyOverdueTasksAreDisplayed() {
        Assert.assertTrue(myWorkPage.isOverdueTaskDisplayed());
    }

    @Then("verify overdue tasks of name {string} is displayed")
    public void verifyOverdueTasksOfNameIsDisplayed(String overdueTask) {

    }

    @Then("verify tasks of name {string} displayed")
    public void verifyNextTasksOfNameDisplayed(String nextTask) {
        Assert.assertTrue("There are no overdue tasks",myWorkPage.isNextTaskDisplayed(ConfigReader.getConfigValue(nextTask)));
    }

    @When("user clicks on the task name as {string}")
    public void userClicksOnTheTaskNameAs(String nextTask) {
        myWorkPage.clickOnNextTask(ConfigReader.getConfigValue(nextTask));
    }

    @When("user clicks on overdue button")
    public void userClicksOnOverdueButton() {
        myWorkPage.clickOnOverdueBtn();
    }

    @When("user clicks on done button")
    public void userClicksOnDoneButton() {
        myWorkPage.clickOnDoneBtn();
    }

    @And("clicks on back button of myWork page")
    public void clicksOnBackButtonOfMyWorkPage() {
        myWorkPage.clickOnWorkPageBackBtn();
    }

    @When("user clicks swipes on task name as {string}")
    public void userClicksSwipesOnTaskNameAs(String nextTaskName) {
        myWorkPage.swipeOnTheTaskName(ConfigReader.getConfigValue(nextTaskName));
    }

    @Then("verify task is completed")
    public void verifyTaskIsCompleted() {
        Assert.assertTrue(myWorkPage.isTaskCompleted());
    }
}

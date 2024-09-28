package com.automation.steps;

import com.automation.pages.AddTaskPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddTaskPageSteps {

    AddTaskPage addTaskPage = new AddTaskPage();

    @And("user enters assignee")
    public void userEntersAssignee() {
        addTaskPage.clickOnAddAssignee();
        addTaskPage.clickOnMeProfile();
    }

    @And("user clicks on sets date")
    public void userSetsDate() {
        addTaskPage.clickOnSetDate();
    }

    @And("user enters task title as {string}")
    public void userEntersTaskTitleAs(String title) {
        addTaskPage.enterTaskTitle(ConfigReader.getConfigValue(title));
    }

    @And("user sets due date as {string}")
    public void userSetsDueDateAs(String dueDate) {
        addTaskPage.setDueDate(ConfigReader.getConfigValue(dueDate));
        addTaskPage.clickDoneBtn();
    }

    @And("user clicks on create button")
    public void userClicksOnCreateButton() {
        addTaskPage.clickCreateBtn();
    }

    @Then("verify task is created")
    public void verifyTaskIsCreated() {
        Assert.assertTrue(addTaskPage.isTaskCreated());
    }


    @And("user sets due date")
    public void userSetsDueDate() {
        addTaskPage.setDueDate("2 September 2024");
        addTaskPage.clickDoneBtn();
    }
}

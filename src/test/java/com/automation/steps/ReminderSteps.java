package com.automation.steps;

import com.automation.pages.ReminderPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReminderSteps {
    ReminderPage reminderPage = new ReminderPage();

    @When("user clicks on add reminder")

    public void user_clicks_on_add_reminder() {
        reminderPage.clickOnAddReminder();
    }

    @When("user enters reminder name as {string}")
    public void user_enters_reminder_name_as(String string) {
        System.out.println(string);
        reminderPage.enterAddReminderText(ConfigReader.getConfigValue(string));
    }

    @Then("verify reminder is visible")
    public void verify_reminder_is_visible() {
//        Assert.assertTrue(reminderPage.isAttachIconDisplayed());
    }


    @And("user clicks on create reminder button")
    public void userClicksOnCreateReminderButton() {
        reminderPage.clickOnCreateBtn();
    }

    @When("user clicks on see all of reminder")
    public void userClicksOnSeeAllOfReminder() {
        reminderPage.clickOnSeeAllOfRemainder();
    }

    @Then("verify reminder page is displayed")
    public void verifyReminderPageIsDisplayed() {
        Assert.assertTrue(reminderPage.isRemainderPageDisplayed());
    }

    @When("user clicks on overdue option")
    public void userClicksOnOverdueOption() {
        reminderPage.clickOnOverdueBtn();
    }

    @Then("verify list of overdue remainders are displayed")
    public void verifyListOfOverdueRemaindersAreDisplayed() {
        Assert.assertTrue(reminderPage.isListOfReminderListDisplayed());
    }

    @When("user clicks on overdue remainder of name {string}")
    public void userClicksOnOverdueRemainderOfName(String overdueReminderName) {
        reminderPage.clickOnReminderOfName(ConfigReader.getConfigValue(overdueReminderName));
    }

    @Then("verify reminder details page is displayed")
    public void verifyReminderDetailsPageIsDisplayed() {
        Assert.assertTrue(reminderPage.isReminderDetailsPageDisplayed());
    }

    @When("user clicks on more option")
    public void userClicksOnMoreOption() {
        reminderPage.clickOnMoreOption();
    }

    @And("clicks on delete button of reminder")
    public void clicksOnDeleteButtonOfReminder() {
        reminderPage.clickDeleteReminderBtn();
    }

    @Then("verify reminder is deleted")
    public void verifyReminderIsDeleted() {
        Assert.assertTrue(reminderPage.isReminderDeleted());
    }
}

package com.automation.steps;

import com.automation.pages.NotePadPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NotePadPageSteps {

    NotePadPage notePadPage = new NotePadPage();

    @Then("verify notepad page is displayed")
    public void verifyNotepadPageIsDisplayed() {
        Assert.assertTrue(notePadPage.isNotePadPageDisplayed());
    }


    @When("user clicks on create new note button")
    public void userClicksOnCreateNewNoteButton() {
        notePadPage.clickOnCreateNewNoteBtn();
    }

    @And("user creates a new note name as {string}")
    public void userCreatesANewNoteNameAs(String noteName) {
        notePadPage.enterNoteName(ConfigReader.getConfigValue(noteName));
    }

    @And("user clicks on create new note button of notePad")
    public void userClicksOnCreateNewNoteButtonOfNotePad() {
        notePadPage.clickOnCreateNoteBtn();
    }

//    @Then("verify note is created of name {string}")
//    public void verifyNoteIsCreatedOfName(String noteName) {
//        Assert.assertTrue(notePadPage.isNoteCreated(ConfigReader.getConfigValue(noteName)));
//    }

    @When("user clicks on edit note button")
    public void userClicksOnEditNoteButton() {
        notePadPage.clickOnEditNoteBtn();
    }

    @And("user enters the note message as {string}")
    public void userEntersTheNoteMessageAs(String noteMsg) {
        notePadPage.enterNoteMsg(ConfigReader.getConfigValue(noteMsg));
    }

    @And("user clicks on back button")
    public void userClicksOnBackButton() {
        notePadPage.clickOnBackButton();
    }

    @Then("verify note is present of name {string}")
    public void verifyNoteIsPresentOfName(String noteName) {
        Assert.assertTrue(notePadPage.isNotePresentInList(ConfigReader.getConfigValue(noteName)));
    }

    @When("user clicks on the note name from the list {string}")
    public void userClicksOnTheNoteNameFromTheList(String noteName) {
        notePadPage.clickOnNoteNameFromList(ConfigReader.getConfigValue(noteName));
    }

    @Then("verify note is present with noteName {string} and noteMsg {string}")
    public void verifyNoteIsPresentWithNoteNameAndNoteMsg(String noteName, String noteMsg) {
        Assert.assertTrue(notePadPage.isNotePresentWithNameAndMsg(ConfigReader.getConfigValue(noteName), ConfigReader.getConfigValue(noteMsg)));
    }

    @When("user clicks on the note to be deleted of name {string}")
    public void userClicksOnTheNoteToBeDeletedOfName(String noteName) {
        notePadPage.clickOnNoteNameFromList(ConfigReader.getConfigValue(noteName));
    }

    @And("user clicks on notepad more option")
    public void userClicksOnNotepadMoreOption() {
        notePadPage.clickOnNotePadMoreOption();
    }

    @And("clicks on delete button")
    public void clicksOnDeleteButton() {
        notePadPage.clickOnDeleteButton();
    }

    @And("clicks on confirm delete button")
    public void clicksOnConfirmDeleteButton() {
        notePadPage.clickOnConfirmDeleteBtn();
    }

    @Then("verify note is deleted of name {string}")
    public void verifyNoteIsDeletedOfName(String noteName) {
        Assert.assertTrue(notePadPage.isNoteDeletedOfName(ConfigReader.getConfigValue(noteName)));
    }
}

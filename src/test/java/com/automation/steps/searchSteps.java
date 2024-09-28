package com.automation.steps;

import com.automation.pages.SearchPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {

    SearchPage searchPage = new SearchPage();


    @Given("user is on home page")
    public void user_is_on_home_page() {

    }

    @When("user clicks on search icon")
    public void user_clicks_on_search_icon() {
        searchPage.clickOnSearchIcon();
//        searchPage.clickOnSearchIcon();
    }

    @When("user enters task name as {string}")
    public void user_enters_task_name_as(String string) {
        searchPage.enterInput(ConfigReader.getConfigValue(string));
        searchPage.clickOnSearch();
    }

    @Then("verify task is visible")
    public void verify_task_is_visible() {

    }

}

package com.automation.steps;

import com.automation.pages.FavoritePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FavoritePageSteps {

    FavoritePage favoritePage = new FavoritePage();

    @Then("verify favorite page is displayed")
    public void verifyFavoritePageIsDisplayed() {
        Assert.assertTrue(favoritePage.isFavoritePageDisplayed());
    }

    @And("clicks on the favorite task {string}")
    public void clicksOnTheFavoriteTask(String favoriteTaskName) {
        favoritePage.clickOnFavoriteTask(ConfigReader.getConfigValue(favoriteTaskName));
    }

    @Then("verify favorite task is removed")
    public void verifyFavoriteTaskIsRemoved() {
        Assert.assertTrue(favoritePage.isFavoriteTaskRemoved());
    }
}

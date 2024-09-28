package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage extends BasePage {

    @FindBy(xpath = "//android.view.View[contains(@content-desc,'Details')]")
    WebElement detailsTab;

    @FindBy(xpath = "//android.view.View[contains(@content-desc,'Activity')]")
    WebElement activityTab;

    @FindBy(xpath = "//android.view.View[contains(@content-desc,'Status & Type')]")
    WebElement taskStatusType;

    @FindBy(xpath = "//android.widget.Switch[@content-desc='COMPLETE']")
    WebElement completeTaskOption;

    @FindBy(xpath = "//android.widget.Switch[@content-desc='TO DO']")
    WebElement todoTaskOption;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Options']")
    WebElement optionsBtn;

    @FindBy(xpath = "//android.view.View[@content-desc='Options']")
    WebElement optionsPopupTitle;

    @FindBy(xpath = "//android.view.View[@content-desc='Favorite']")
    WebElement favoriteOption;

    @FindBy(xpath = "//android.view.View[@content-desc='Delete']")
    WebElement deleteOption;

    @FindBy(xpath = "//android.view.View[@content-desc='Move Task']")
    WebElement moveTaskOption;

    @FindBy(xpath = "//android.view.View[@content-desc='Unfavorite']")
    WebElement unFavoriteOption;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Close']")
    WebElement popupDoneBtn;

    @FindBy(xpath = "//android.widget.Switch[@content-desc='IN PROGRESS']")
    WebElement inProgressTaskOption;

    public boolean isTaskPageDisplayed() {
        return detailsTab.isDisplayed() && activityTab.isDisplayed();
    }

    public void clickTaskStatusType() {
        taskStatusType.click();
    }

    public boolean isStatusTypesDisplayed() {
        return completeTaskOption.isDisplayed() && todoTaskOption.isDisplayed();
    }

    public void clickCompleteTaskOption() {
        completeTaskOption.click();
    }

    public boolean isTaskMarkedComplete() {
        WebElement taskStatus = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Complete')]"));
        return taskStatus.isDisplayed();
    }

    public void clickOnOptionsBtn() {
        optionsBtn.click();
    }

    public boolean isOptionsPopupDisplayed() {
        return optionsPopupTitle.isDisplayed() && deleteOption.isDisplayed();
    }

    public void clickOnFavoriteOption() {
        favoriteOption.click();
    }

    public boolean isUnFavoriteOptionDisplayed() {
        return unFavoriteOption.isDisplayed();
    }

    public void clickOnPopupDoneBtn() {
        popupDoneBtn.click();
    }

    public void clickOnInProgressTaskOption() {
        inProgressTaskOption.click();
    }

    public void clickOnUnFavoriteOption() {
        unFavoriteOption.click();
    }

    public boolean isFavoriteOptionDisplayed() {
        return favoriteOption.isDisplayed();
    }

    public boolean isTaskMarkedInProgress() {
        WebElement taskStatus = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'In Progress')]"));
        return taskStatus.isDisplayed();
    }
}

package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//android.widget.Button[@content-desc='Get started']")
    WebElement getStarted;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement email;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Next']")
    WebElement nextBtn;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Other Sign In Options']")
    WebElement signInOptions;

    @FindBy(xpath = "//android.view.View[@content-desc='Sign in with password']")
    WebElement signInWithPasswordBtn;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement password;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Login']")
    WebElement loginBtn;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Give permissions']")
    WebElement permissionBtn;

    @FindBy(xpath = "//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")
    WebElement allowNotification;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Action']")
    WebElement addIcon;

    public void clickOnGettingStarted() {
        getStarted.click();
    }

    public void clickOnNextBtn() {
        if(isClickable(nextBtn)){
            nextBtn.click();
        }

    }

    public void clickOnSignInOptions() {
        signInOptions.click();
    }

    public void clickOnSignInWithPassword() {
        signInWithPasswordBtn.click();
    }

    public void clickOnLoginBtn() {
        loginBtn.click();

    }

    public void clickOnPermission() {
        permissionBtn.click();
    }

    public void clickOnAllowNotification() {
        allowNotification.click();
    }


    public void enterEmail(String data) {
        email.sendKeys(data);
    }

    public void enterPassword(String data) {
        password.sendKeys(data);
    }

    public boolean isAddIconDisplayed() {
        return addIcon.isDisplayed();
    }


}

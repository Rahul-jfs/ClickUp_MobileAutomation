package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//android.widget.Button[@content-desc='Action']")
    WebElement addIcon;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Next\"]")
    WebElement nextBtn;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Done\"]")
    WebElement doneBtn;

    @FindBy(xpath = "//android.widget.Button[contains(@content-desc,'More')]")
    WebElement moreBtn;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Notepad']")
    WebElement notePadOption;

    @FindBy(xpath = "//android.widget.Button[contains(@content-desc,'Invite')]")
    WebElement inviteOption;

    @FindBy(xpath = "//android.view.View[@content-desc='Invite members']")
    WebElement invitePopupHeading;

    @FindBy(xpath = "//android.widget.Button[@content-desc]")
    WebElement inviteBtn;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement inviteEmailInput;

    @FindBy(xpath = "//android.widget.Toast[contains(@text,'Invites sent')]")
    WebElement inviteSentMsg;

    @FindBy(xpath = "//android.widget.Switch[@content-desc='Next']")
    WebElement nextTaskBtn;

    String nextTaskXPATH = "//android.widget.Button[contains(@content-desc,'%s')]";

    @FindBy(xpath = "//android.widget.Switch[@content-desc='Overdue']")
    WebElement overdueBtn;

    @FindBy(xpath = "//android.widget.Button[@content-desc='See all My Work']")
    WebElement seeAllMyWorkBtn;

    @FindBy(xpath = "//android.widget.Button[@content-desc='See all Favorites']")
    WebElement seeAllFavoriteBtn;

    public void clickAddButton() {
        addIcon.click();
    }

    public void clickOnWelcomeBanner() {
        moreBtn.click();
        tap(115, 387);

        if (isPresent(nextBtn)) {
            for (int i = 0; i < 7; i++) {
                nextBtn.click();
            }
            doneBtn.click();
        }
    }

    public void clickMoreButton() {
        moreBtn.click();
    }

    public void clickOnNotePadOption() {
        notePadOption.click();
    }

    public void clickInviteOption() {
        inviteOption.click();
    }

    public boolean isInvitePopupDisplayed() {
        return invitePopupHeading.isDisplayed() && inviteBtn.isDisplayed();
    }

    public void enterInviteEmail() {
        String inviteEmail = generateRandomEmail();
        inviteEmailInput.sendKeys(inviteEmail);
    }

    public void clickOnInviteBtn() {
        inviteBtn.click();
    }

    public boolean isInviteSent() {
        inviteSentMsg = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Inviting:\"]"));
        boolean isEle = isElementVisible(inviteSentMsg);
        System.out.println(isEle);
        return isEle;
    }

    public void clickOnNextBtn() {
        nextTaskBtn.click();
    }

    public void clickOnSeeAllOfMyWork() {
        seeAllMyWorkBtn.click();
    }

    public void clickOnSeeAllOfFavorite() {
        int height =  driver.manage().window().getSize().getHeight();
        int width =  driver.manage().window().getSize().getWidth();
        while (!isPresentWithoutWait(seeAllFavoriteBtn)) {
            scrollOrSwipe(width/2,height/2,width/2,height/4);
        }
        scrollOrSwipe(width/2,height/2,width/2,height/4);
        seeAllFavoriteBtn.click();
    }

}

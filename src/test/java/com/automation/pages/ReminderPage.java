package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReminderPage extends BasePage {

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Create a Reminder\"]")
    WebElement addReminderBtn;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement addReminderText;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Create\"]")
    WebElement createBtn;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[1]")
    WebElement attachIcon;

    @FindBy(xpath = "//android.widget.Button[@content-desc='See all Reminders']")
    WebElement seeAllRemaindersBtn;

    @FindBy(xpath = "//android.view.View[@content-desc='Reminders']")
    WebElement reminderPageTitle;

    @FindBy(xpath = "//android.widget.Switch[@content-desc='Overdue']")
    WebElement overDueBtn;

    @FindBy(xpath = "//android.widget.Button[contains(@content-desc,'Reminder:') and not(contains(@content-desc,'Create'))]")
    List<WebElement> reminderList;

    String reminderNameXPATH = "//android.widget.Button[contains(@content-desc, '%s')]";

    @FindBy(xpath = "//android.view.View[@content-desc='Save']")
    WebElement saveBtn;

    @FindBy(xpath = "(//android.widget.Button[@content-desc='Back']/following-sibling::android.widget.ImageView)[3]")
    WebElement moreOptionOption;

    @FindBy(xpath = "//android.view.View[@content-desc='Delete']")
    WebElement deleteReminderBtn;

    public void clickOnAddReminder() {
//        new HomePage().clickOnWelcomeBanner();
        int height =  driver.manage().window().getSize().getHeight();
        int width =  driver.manage().window().getSize().getWidth();
       while (!isPresentWithoutWait(addReminderBtn))
       {

           scrollOrSwipe(width/2,height/2,width/2,height/4);
       }
        scrollOrSwipe(width/2,height/2,width/2,height/4);
        addReminderBtn.click();
    }

    public void clickOnCreateBtn() {
        createBtn.click();
    }

    public void enterAddReminderText(String data) {
        addReminderText.click();
        addReminderText.sendKeys(data);
    }

    public boolean isAttachIconDisplayed() {
        return attachIcon.isDisplayed();
    }

    public void clickOnSeeAllOfRemainder() {
        while (!isPresentWithoutWait(addReminderBtn))
        {
            int height =  driver.manage().window().getSize().getHeight();
            int width =  driver.manage().window().getSize().getWidth();
            scrollOrSwipe(width/2,height/2,width/2,height/4);
        }
        seeAllRemaindersBtn.click();
    }

    public boolean isRemainderPageDisplayed() {
        return reminderPageTitle.isDisplayed() && overDueBtn.isDisplayed();
    }

    public void clickOnOverdueBtn() {
        overDueBtn.click();
    }

    int noOfReminder = 0;
    public boolean isListOfReminderListDisplayed() {
        waitForElementToBeVisible(reminderList.get(0));
        noOfReminder = reminderList.size();
        System.out.println("no OF Reminaindoef"+noOfReminder);
        System.out.println("List i  askdnas"+reminderList.size());
        return !reminderList.isEmpty();
    }

    public void clickOnReminderOfName(String overdueReminderName) {
        String xpath = String.format(reminderNameXPATH, overdueReminderName);
        System.out.println(xpath);
        driver.findElement(By.xpath(xpath)).click();
    }

    public boolean isReminderDetailsPageDisplayed() {
        return moreOptionOption.isDisplayed() && saveBtn.isDisplayed();
    }

    public void clickOnMoreOption() {
        moreOptionOption.click();
    }

    public void clickDeleteReminderBtn() {
        deleteReminderBtn.click();
    }

    public boolean isReminderDeleted() {
        int reminderLeft = driver.findElements(By.xpath("//android.widget.Button[contains(@content-desc,'Reminder:') and not(contains(@content-desc,'Create'))]")).size();
        return reminderLeft == noOfReminder-1;
    }
}

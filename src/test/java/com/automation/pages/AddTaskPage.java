package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTaskPage extends BasePage {

    @FindBy(xpath = "//android.widget.Button[@content-desc='Create task']")
    WebElement createBtn;

    @FindBy(xpath = "//android.view.View[@content-desc='Add assignee']/preceding-sibling::android.widget.EditText")
    WebElement taskTitleInput;

    @FindBy(xpath = "//android.view.View[@content-desc='Add assignee']")
    WebElement addAssigneeTab;

    @FindBy(xpath = "//android.view.View[@content-desc='Me']")
    WebElement meProfile;

    @FindBy(xpath = "//android.view.View[@content-desc='Set dates']")
    WebElement setDateBtn;

    String MONTH_XPATH = "//android.view.View[@content-desc='%s']";
    String date_XPATH = "/android.view.View[@content-desc='%s']";

    WebElement requiredDate;

    @FindBy(xpath = "//android.widget.ScrollView")
    WebElement calenderMonthDiv;

    @FindBy(xpath = "//android.view.View[@content-desc='Done']")
    WebElement doneBtn;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Create task']")
    WebElement createTaskBtn;

    @FindBy(xpath = "//android.view.View[@content-desc='Task created']")
    WebElement taskCompletedPopUp;

    public void enterTaskTitle(String title) {
        taskTitleInput.click();
        taskTitleInput.clear();
        for (char ch : title.toCharArray()) {
            taskTitleInput.sendKeys(Character.toString(ch));
        }
    }

    public void clickOnAddAssignee() {
        addAssigneeTab.click();
    }

    public void clickOnMeProfile() {
        meProfile.click();
    }

    public void clickOnSetDate() {
        setDateBtn.click();
    }

    public void setDueDate(String dueDate) {

        String monthYear = dueDate.substring(dueDate.indexOf(" ") + 1);
        String date = dueDate.substring(0, dueDate.indexOf(" "));

        String monthYearXpath = String.format(MONTH_XPATH, monthYear);
        String dateXpath = String.format(date_XPATH, date);

        System.out.println(monthYearXpath + dateXpath);

        int width = calenderMonthDiv.getSize().getWidth();
        int height = calenderMonthDiv.getSize().getHeight();
        int x = calenderMonthDiv.getLocation().getX();
        int y = calenderMonthDiv.getLocation().getY();
        while (true) {
            try {
                requiredDate = driver.findElement(By.xpath(monthYearXpath + dateXpath));
                break;
            } catch (NoSuchElementException ignored) {
                scrollOrSwipe(width / 2 + x, height / 2 + y, width / 2 + x, height / 2);
            }
        }


        requiredDate.click();
    }

    private boolean isElementPresent(WebElement element) {
        return element.isDisplayed();
    }

    public void clickDoneBtn() {
        doneBtn.click();
    }

    public void clickCreateBtn() {
        if(isClickable(createTaskBtn)){
            createTaskBtn.click();
        }
    }

    public boolean isTaskCreated() {
        return taskCompletedPopUp.isDisplayed();
    }

    public void addSpaceInTaskName() {
        taskTitleInput.click();
        taskTitleInput.sendKeys(" ");
    }
}

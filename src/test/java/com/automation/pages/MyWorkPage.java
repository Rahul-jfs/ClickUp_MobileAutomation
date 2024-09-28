package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyWorkPage extends BasePage {

    @FindBy(xpath = "//android.widget.Switch[@content-desc='Next']")
    WebElement nextTaskBtn;

    @FindBy(xpath = "//android.widget.Switch[@content-desc='Overdue']")
    WebElement overdueTaskBtn;

    String taskNameXPATH = "//android.widget.Button[contains(@content-desc,'Task: %s')]";

    @FindBy(xpath = "//android.widget.Button[contains(@content-desc,'Task: ')]")
    List<WebElement> overdueTasksList;

    String nextTaskXPATH = "//android.widget.Button[contains(@content-desc,'%s')]";

    @FindBy(xpath = "//android.widget.Switch[@content-desc='Done']")
    WebElement doneTaskBtn;

    @FindBy(xpath = "//android.widget.Switch[@content-desc='Overdue']")
    WebElement overdueBtn;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Back to Home']")
    WebElement backToHomeBtn;


    public boolean isMyWorkPageDisplayed() {
        return nextTaskBtn.isDisplayed() && overdueTaskBtn.isDisplayed();
    }

    public void clickOnOverdueTaskBtn() {
        overdueTaskBtn.click();
    }

    public boolean isOverdueTaskDisplayed() {
        return overdueTasksList.get(0).isDisplayed();
    }

    public void clickOnDoneBtn() {
        doneTaskBtn.click();
    }

    public void clickOnWorkPageBackBtn() {
        backToHomeBtn.click();
    }

    public void swipeOnTheTaskName(String nextTaskName) {
        String xpath = String.format(taskNameXPATH, nextTaskName);
        WebElement taskEle = driver.findElement(By.xpath(xpath));

        int width = taskEle.getSize().getWidth();
        int height = taskEle.getSize().getHeight();
        int x = taskEle.getLocation().getX();
        int y = taskEle.getLocation().getY();

        scrollOrSwipe(x + 10, y + height / 2, x + width, y + height / 2);

    }

    int noOfNextTask = 0;

    public boolean isNextTaskDisplayed(String nextTask) {
        noOfNextTask = driver.findElements(By.xpath("//android.widget.Button[contains(@content-desc,'Task: ')]")).size();
        String xpath = String.format(nextTaskXPATH, nextTask);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void clickOnNextTask(String nextTask) {
        String xpath = String.format(nextTaskXPATH, nextTask);
        System.out.println(xpath);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void clickOnOverdueBtn() {
        overdueBtn.click();
    }

    public boolean isTaskCompleted() {
        int remainingTasks = driver.findElements(By.xpath("//android.widget.Button[contains(@content-desc,'Task: ')]")).size();
        if(remainingTasks == noOfNextTask -1){
            return true;
        }else {
            return false;
        }
    }
}

package PageObjects;

import BaseClass.BaseClass;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LessonsPage extends BaseClass {
    private final BaseClass base;

    public LessonsPage(BaseClass base) {
        this.base = base;
    }

    By closePopup = By.cssSelector(".ui_outside-close-icon");
    By popup = By.cssSelector(".modal-first-time-modal");
    By allLessons = By.id("tab-all");
    By instructor = By.cssSelector(".course-content .course-author");
    String dropDownItems = "//span[contains(text(), \"%s\")]";
    String getElementText = "//*[contains(text(), \"%s\")]";


    public void closePopupIfAppears() {
        if (base.driver.findElement(popup).isDisplayed()) {
            base.driver.findElement(closePopup).click();
        }
    }

    public void clickOnAllLessons() {
        base.driver.findElement(allLessons).click();
    }

    public void clickOpenDropDown(String text) throws InterruptedException {
        base.driver.findElement(By.xpath(String.format(getElementText, text))).click();
    }

    public void clickDropDownItems(String text) throws InterruptedException {
        base.driver.findElement(By.xpath(String.format(dropDownItems, text))).click();
    }

    public void filterByInstructors(String text) {
        WebDriverWait wait = new WebDriverWait(base.driver, 15);
        wait.until((ExpectedCondition<Boolean>) d -> d.findElement(instructor).getText().split("\n")[1].equals(text));
        Assertions.assertEquals(base.driver.findElement(instructor).getText().split("\n")[1],text);
    }


}
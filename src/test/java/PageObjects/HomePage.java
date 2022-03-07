package PageObjects;

import BaseClass.BaseClass;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class HomePage extends BaseClass {

    private final BaseClass base;

    public HomePage(BaseClass base) {
        this.base = base;
    }

    By searchField = By.id("edit-search-block-form--2");
    By searchBtn = By.cssSelector("[id = block-search-form] .glyphicon-search");
    By searchResults = By.cssSelector("[class=title]");


    By learnBtn = By.cssSelector("[data-nav-link='learn']") ;
    By lessonsBtn = By.cssSelector("[href='https://www.chess.com/lessons']");
    public void openHomePage() {
        base.driver.get(base.baseURL);
    }

    public void typeInSearchField(String text) {
        base.driver.findElement(searchField).sendKeys(text);
    }

    public void clickSearchBtn() {
        base.driver.findElement(searchBtn).click();
    }

    public void checkSearchResults(String text) {
        base.driver.findElements(searchResults).forEach(title ->
                Assertions.assertTrue(title.getText().toLowerCase().contains(text),
                        "'" +title.getText() +"'" + " " + "result does not contain" + " " +"'" + text + "'"));


    }


    public void assertTitle (){
        Assertions.assertEquals("Chess.com - Play Chess Online - Free Games",base.driver.getTitle());
    }

    public void hoverOverLearn (){
        Actions action = new Actions(base.driver);

        action.moveToElement(base.driver.findElement(learnBtn)).build().perform();

    }

    public void  clickOnLessons (){
        base.driver.findElement(lessonsBtn).click();
    }
}


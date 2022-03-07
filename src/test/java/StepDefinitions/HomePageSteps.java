package StepDefinitions;

import BaseClass.BaseClass;
import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends HomePage {public HomePageSteps(BaseClass base) {
    super(base);
}
    @Given("Open Chess.com home page")
    public void visitHomePage() {
        super.openHomePage();
    }

    @And("Chess.com home page is opened")
    public void chessComHomePageIsOpened() {
        super.assertTitle();
    }

    @And("I hover over Learn from side menu")
    public void clickOnLearnFromSideMenu() {
        super.hoverOverLearn();
    }

    @And("I click on lessons from side bar")
    public void iClickOnLessonsFromSideBar() {
        super.clickOnLessons();
    }

}

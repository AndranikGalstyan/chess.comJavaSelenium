package StepDefinitions;

import PageObjects.HomePage;
import BaseClass.BaseClass;
import PageObjects.LessonsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FilterSteps extends LessonsPage {

    public FilterSteps(BaseClass base) {
        super(base);
    }

    @And("I close popup if it appears")
    public void iClosePopupIfItAppears() {
        super.closePopupIfAppears();
    }

    @And("I click on All lessons")
    public void iClickOnAllLessons() {
        super.clickOnAllLessons();
    }

    @And("I filter lesson {string} by {string}")
    public void iFilterLessonBy(String arg0, String arg1) throws InterruptedException {
        super.clickOpenDropDown(arg0);
        super.clickDropDownItems(arg1);
    }

   @Then("I verify that lessons are filtered by {string}")
    public void iVerifyThatLessonsAreFilteredBy(String arg0) {
        super.filterByInstructors(arg0);
    }


}


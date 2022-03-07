@test
@search
Feature: Selenium Easy search functionality

  Scenario Outline: Check filters by <instructors>
    Given Open Chess.com home page
    And Chess.com home page is opened
    And I hover over Learn from side menu
    And I click on lessons from side bar
    And I close popup if it appears
    And I click on All lessons
    And I filter lesson "Instructor" by "<instructors>"
    Then I verify that lessons are filtered by "<instructors>"


    Examples:
      | instructors         |
      | Aleksandr Lenderman |
      | Alex Delchev        |
      | Alex Yermolinsky    |
      |  Alisa Melekhina    |
      | Aman Hambleton      |


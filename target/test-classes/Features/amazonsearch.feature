Feature: Amazon search functionality

  Scenario: Validating amazon search function
    Given User opens chrome browser
    And User is on amazon search  page
    When User enters a textword in search box
    And User click on search icon
    Then User navigated expected page

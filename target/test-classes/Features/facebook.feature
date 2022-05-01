Feature: testing facebook

  Scenario: Face book login
    Given User Opens chrome browser
    When User  enters Url for face book
    And User enters username and password
    Then User click on login
    And User logged in facebook successfully

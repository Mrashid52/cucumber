Feature: Login Function

  Scenario: Login in valid credentials
    Given User Launch Chrome browser
    When User Enters URL "https://inventory.omecen.com/"
    Then User Enters username as "admin"
    And user Enters password as "admin_test"
    Then User Click login
    Then User Navigated Dashboard page

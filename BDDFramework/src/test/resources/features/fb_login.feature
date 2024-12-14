Feature: Facebook login functionality
  Scenario: Login to faceboook
    Given I am on the facebook login page
    When I enter valid credentials "Preema" and "Preema123"
    Then I should be logged into facebook
    And I close the browser

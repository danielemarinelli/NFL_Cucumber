Feature: Reading NFL web site

  Scenario Outline: As a user I want navigate on the NFL site
    Given I navigate to NFL
    When I click on signin
    And  I insert my <user> and <password>
    Then I should be able to view my web page
    Examples:
      | user | password |
      | tester1 | pass123 |
      | tester2 | pass456 |